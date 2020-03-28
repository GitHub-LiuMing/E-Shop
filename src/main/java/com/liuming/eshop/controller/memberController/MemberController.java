package com.liuming.eshop.controller.memberController;

import com.alibaba.fastjson.JSONObject;
import com.liuming.eshop.entity.memberEntity.Member;
import com.liuming.eshop.service.memberService.MemberService;
import com.liuming.eshop.utils.DataResult;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.codec.Base64;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.AlgorithmParameters;
import java.security.Security;
import java.util.Arrays;

/**
 * @Description 会员
 * @ClassName MemberController
 * @Author 张孙峰
 * @date 2019.12.12 15:00
 */
@RestController
@RequestMapping("/member")
public class MemberController {
    @Resource
    private MemberService memberService;

    /**
     * @Description 新增会员
     * @param member
     * @return com.liuming.eshop.utils.DataResult
     * @Author 张孙峰
     * @Date 2019.12.14 09:26
     */
    @RequestMapping("/addMember")
    public DataResult addMember(Member member){
        if (StringUtils.isNotBlank(member.getPreMemberId()) && StringUtils.isNotBlank(member.getPreMemberName()) && StringUtils.isNotBlank(member.getPreMemberPhone()) && StringUtils.isNotBlank(member.getPreMemberLevelId()) && StringUtils.isNotBlank(member.getPreMemberLevelName())){
            //上级信息必须有
            if (StringUtils.isNotBlank(member.getMemberLevelId()) && StringUtils.isNotBlank(member.getMemberLevelName())){
                //会员等级信息获取失败
                if (StringUtils.isNotBlank(member.getMemberName()) && member.getMemberType() != null && StringUtils.isNotBlank(member.getMemberWechatName()) && StringUtils.isNotBlank(member.getMemberWechatOpenId())){
                    return memberService.addMember(member);
                } else {
                    return DataResult.build(500,"会员个人信息获取失败");
                }
            } else {
                return DataResult.build(500,"会员等级获取信息失败");
            }
        } else {
            return DataResult.build(500,"上级信息获取失败，请重试");
        }
    }

    /**
     * @Description 查询会员（密码不能用作解析数据，无法加密和解密，所以该接口无法对密码这个参数进行查询）
     * @param member
     * @return com.liuming.eshop.utils.DataResult
     * @Author 张孙峰
     * @Date 2019.12.14 10:55
     */
    @RequestMapping("/findMember")
    public DataResult findMember(Member member){
        return memberService.findMember(member);
    }

    @RequestMapping("/importExportMember")
    public DataResult importExportMember(){
        // TODO: 2019/12/14 导入导出会员还没有做
        return null;
    }

    /**
     * @Description 注册
     * @param member
     * @return com.liuming.eshop.utils.DataResult
     * @Author 鲸落
     * @Date 2020.01.16 18:19
     */
    @RequestMapping("/login")
    public DataResult login(Member member){
        // TODO: 2020/1/16 在注册的service里面设定了一些固定值，需要在上线前处理掉
        if (StringUtils.isNotBlank(member.getMemberPhone())){
            return memberService.login(member);
        } else {
            return DataResult.build(500,"手机号不得为空");
        }
    }

    /**
     * @Description 查询会员密码是否正确（暂时用作登录使用）
     * @param member
     * @return com.liuming.eshop.utils.DataResult
     * @Author 鲸落
     * @Date 2020.01.16 18:19
     */
    @RequestMapping("/findMemberPassword")
    public DataResult findMemberPassword(Member member){
        return memberService.findMemberPassword(member);
    }

    /**
     * @Description 会员密码修改
     * @param member
     * @return com.liuming.eshop.utils.DataResult
     * @Author 鲸落
     * @Date 2020.01.16 17:08
     */
    @RequestMapping("/updateMemberPassword")
    public DataResult updateMemberPassword(Member member){
        if (StringUtils.isNotBlank(member.getMemberPhone()) && StringUtils.isNotBlank(member.getMemberPassword())){
            return memberService.updateMemberPassword(member);
        } else {
            return DataResult.build(500,"会员手机号和密码不得为空");
        }
    }

    /**
     * @Description 通过微信授权获取用户手机号
     * @param encryptedData 加密数据
     * @param sessionKey 会话密钥
     * @param iv
     * @param memberWechatOpenId 微信OpenID
     * @param memberWechatName 微信昵称
     * @param memberHeadPortraitUrl 微信头像
     * @return com.liuming.eshop.utils.DataResult
     * @Author 鲸落
     * @Date 2020.03.21 15:21
     */
    @RequestMapping("/getPurePhoneNumber")
    public DataResult getPhoneNumber(String encryptedData,
                                 String sessionKey,
                                 String iv,
                                 String memberWechatOpenId,
                                 String memberWechatName,
                                 String memberHeadPortraitUrl){
        // 被加密的数据
        byte[] dataByte = Base64.decode(encryptedData);
        // 加密秘钥
        byte[] keyByte = Base64.decode(sessionKey);
        // 偏移量
        byte[] ivByte = Base64.decode(iv);
        try {
            // 如果密钥不足16位，那么就补足.  这个if 中的内容很重要，别瞎动
            int base = 16;
            if (keyByte.length % base != 0) {
                int groups = keyByte.length / base + (keyByte.length % base != 0 ? 1 : 0);
                byte[] temp = new byte[groups * base];
                Arrays.fill(temp, (byte) 0);
                System.arraycopy(keyByte, 0, temp, 0, keyByte.length);
                keyByte = temp;
            }
            // 初始化
            Security.addProvider(new BouncyCastleProvider());
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            SecretKeySpec spec = new SecretKeySpec(keyByte, "AES");
            AlgorithmParameters parameters = AlgorithmParameters.getInstance("AES");
            parameters.init(new IvParameterSpec(ivByte));
            // 初始化
            cipher.init(Cipher.DECRYPT_MODE, spec, parameters);
            byte[] resultByte = cipher.doFinal(dataByte);
            if (null != resultByte && resultByte.length > 0) {
                String result = new String(resultByte, "UTF-8");
                JSONObject jsonObject = JSONObject.parseObject(result);
                String memberPhone = jsonObject.getString("purePhoneNumber");
                System.out.println(memberPhone);

                //TODO 后台查会员数据

                return DataResult.ok();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return DataResult.ok();
    }
}
