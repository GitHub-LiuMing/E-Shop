package com.liuming.eshop.controller.memberController;

import com.alibaba.fastjson.JSONObject;
import com.liuming.eshop.entity.changeEntity.Change;
import com.liuming.eshop.entity.memberEntity.Member;
import com.liuming.eshop.entity.userEntity.User;
import com.liuming.eshop.mapper.memberMapper.MemberMapper;
import com.liuming.eshop.mapper.userMapper.UserMapper;
import com.liuming.eshop.service.memberService.MemberService;
import com.liuming.eshop.utils.DataResult;
import com.liuming.eshop.utils.IDUtils;
import com.lkx.util.Excel;
import com.lkx.util.ExcelUtil;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.codec.Base64;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.servlet.http.HttpServletResponse;
import java.security.AlgorithmParameters;
import java.security.Security;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @Description 会员
 * @ClassName MemberController
 * @Author 鲸落
 * @date 2019.12.12 15:00
 */
@RestController
@RequestMapping("/member")
public class MemberController {
    @Resource
    private MemberService memberService;

    @Resource
    private MemberMapper memberMapper;

    /**
     * @Description 新增会员
     * @param member
     * @return com.liuming.eshop.utils.DataResult
     * @Author 鲸落
     * @Date 2019.12.14 09:26
     */
    @RequestMapping("/addMember")
    public DataResult addMember(Member member){
        if (StringUtils.isNotBlank(member.getPreMemberId()) && StringUtils.isNotBlank(member.getPreMemberName()) && StringUtils.isNotBlank(member.getPreMemberPhone())){
            //会员等级信息获取失败
            if (StringUtils.isNotBlank(member.getMemberName()) && member.getMemberType() != null && StringUtils.isNotBlank(member.getMemberWechatName()) && StringUtils.isNotBlank(member.getMemberWechatOpenId())){
                return memberService.addMember(member);
            } else {
                return DataResult.build(500,"会员个人信息获取失败");
            }
        } else {
            return DataResult.build(500,"上级信息获取失败，请重试");
        }
    }

    /**
     * @Description 查询会员（密码不能用作解析数据，无法加密和解密，所以该接口无法对密码这个参数进行查询）
     * @param member
     * @return com.liuming.eshop.utils.DataResult
     * @Author 鲸落
     * @Date 2019.12.14 10:55
     */
    @RequestMapping("/findMember")
    public DataResult findMember(Member member){
        return memberService.findMember(member);
    }

    @RequestMapping("/importMember")//exportMember
    @ResponseBody
    public DataResult importExportMember(MultipartFile file) throws Exception {
        // TODO: 2019/12/14 导入导出会员还没有做
        List<Member> memberList = ExcelUtil.readXls(file.getBytes(), Member.class);
        Member member = new Member();
        int i = 0;
        int s = 0;
        for (Member members : memberList) {
            member.setMemberId(members.getMemberId());
            /*member.setMemberLevelId(members.getMemberLevelId());
            member.setMemberLevelName(members.getMemberLevelName());*/
            member.setMemberName(members.getMemberName());
            member.setMemberType(members.getMemberType());
            member.setMemberWechatOpenId(members.getMemberWechatOpenId());
            member.setMemberWechatName(members.getMemberWechatName());
            member.setMemberPhone(members.getMemberPhone());
            member.setPreMemberId(members.getPreMemberId());
            /*member.setPreMemberLevelId(members.getPreMemberLevelId());
            member.setPreMemberLevelName(members.getPreMemberLevelName());*/
            member.setMemberCreatedDate(members.getMemberCreatedDate());
            member.setMemberUpdatedDate(new Date());
            int ins = memberMapper.insertSelective(member);
            if (ins >= 1){
                i++;
            } else {
                s++;
            }
        }
        return DataResult.ok("成功：" + i + "条，失败：" + s + "条");
    }

    @RequestMapping("/exportMember")
    public void exportMember(HttpServletResponse httpServletResponse, String memberId) throws Exception {
        List<Member> memberList = new ArrayList<>();
        Map map = new HashMap();
        if (StringUtils.isNotBlank(memberId)){
            map.put("preMemberId", memberId);
        }
        List<Member> member = memberMapper.findMember(map);
        for(int i = 0;i<member.size();i++){
            Member member1 = new Member();
            member1.setMemberId(member.get(i).getMemberId());
            member1.setMemberName(member.get(i).getMemberName());
            member1.setMemberType(member.get(i).getMemberType());
            member1.setMemberWechatOpenId(member.get(i).getMemberWechatOpenId());
            member1.setMemberWechatName(member.get(i).getMemberWechatName());
            member1.setMemberPhone(member.get(i).getMemberPhone());
            member1.setPreMemberId(member.get(i).getPreMemberId());
            member1.setMemberCreatedDate(member.get(i).getMemberCreatedDate());
            memberList.add(member1);
        }
        ExcelUtil.exportExcelOutputStream(httpServletResponse, memberList, Member.class, "测试");
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
     * @return com.liuming.eshop.utils.DataResult
     * @Author 鲸落
     * @Date 2020.03.21 15:21
     */
    @RequestMapping("/getPurePhoneNumber")
    public DataResult getPhoneNumber(String encryptedData,
                                 String sessionKey,
                                 String iv){
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

                return DataResult.ok(memberPhone);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return DataResult.ok();
    }

    /**
     * @Description 更新会员
     * @param member
     * @return com.liuming.eshop.utils.DataResult
     * @Author 鲸落
     * @Date 2020.04.15 15:02
     */
    @RequestMapping("/updateMember")
    public DataResult updateMember(Member member){
        if (StringUtils.isNotBlank(member.getMemberId())){
            return memberService.updateMember(member);
        } else {
            return DataResult.build(500,"会员信息不存在");
        }
    }

    /**
     * @Description 根据会员ID查询下级会员
     * @param memberId 会员ID
     * @param i 查询几级会员
     * @return com.liuming.eshop.utils.DataResult
     * @Author 鲸落
     * @Date 2020.04.23 16:18
     */
    @RequestMapping("/findMemberById")
    public DataResult findMemberById(String memberId, int i){
        if (StringUtils.isNotBlank(memberId) && i == 1){
            return memberService.findMemberById1(memberId);
        } else if(StringUtils.isNotBlank(memberId) && i == 2){
            return memberService.findMemberById2(memberId);
        }else {
            return DataResult.build(500,"会员ID获取失败");
        }
    }

    @RequestMapping("/t")
    public void t(String preMemberId){
        Member preMember;
        preMember = memberMapper.selectByPrimaryKey(preMemberId);
        //查询七次会员信息
        String memberId = null;
        List<Member> memberList = new ArrayList<>();
        Go: {
            for (int num = 0; num < 6; num++){
                if (preMember.getPreMemberId() != null){
                    if (memberList.size() == 0){
                        memberId = preMember.getMemberId();
                    }
                    Member member1 = memberMapper.selectByPrimaryKey(memberId);
                    if (member1 != null){
                        memberId = member1.getPreMemberId();
                        memberList.add(member1);
                    }
                } else {
                    break Go;
                }
            }
        }


        int zznum = 0;
        List<Member> memberList1 = new ArrayList<>();
        for (int m = 0; m < memberList.size(); m++){
            if (memberList.get(m).getMemberType() == 2){
                if(zznum <= 2){
                    memberList1.add(memberList.get(m));
                }
                zznum += 1;
            }
        }

        if(memberList1.size() == 2){
            if (memberList1.get(1).getMemberType() == 2){
                //至尊高级团队平级奖
                System.out.println("至尊高级团队平级奖");
            }
        }
    }
}
