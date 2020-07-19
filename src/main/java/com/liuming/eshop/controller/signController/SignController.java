package com.liuming.eshop.controller.signController;

import com.liuming.eshop.entity.signEntity.Sign;
import com.liuming.eshop.service.signService.SignService;
import com.liuming.eshop.utils.DataResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 签到
 * @ClassName SignController
 * @Author 鲸落
 * @date 2019.08.05 10:58
 */
@RestController
@RequestMapping("/sign")
public class SignController {
    @Autowired
    private SignService signService;

    /**
     * @Description 添加签到规则
     * @param sign
     * @return com.liuming.eshop.utils.DataResult
     * @Author 鲸落
     * @Date 2019.08.05 15:05
     */
    @RequestMapping("/addSign")
    public DataResult addSign(@RequestBody Sign sign){
        return signService.addSign(sign);
    }

    public static void main(String[] args) {
        System.out.println(getSum(5));
    }
    public static int getSum(int n){//n=3
        if (n==1) {
            return 1 + 1;
        }else{
            int sua = n + getSum(n-1);//3*getSum(2);getSum(2)=2*getSum(1)
            return sua;
        }
    }
}
