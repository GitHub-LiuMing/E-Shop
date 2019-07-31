package com.liuming.eshop.error;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description 
 * @ClassName MainsiteErrorControlle
 * @Author Ming Liu
 * @date 2019.07.27 14:11
 */
@Controller
public class MainsiteErrorControlle implements ErrorController {
    @RequestMapping("/error")
    public String handleError(HttpServletRequest request){
        //获取statusCode:401,404,500
        Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
        if(statusCode == 401){
            return "error/401/401";
        }else if(statusCode == 404){
            return "error/404/404";
        }else if(statusCode == 403){
            return "error/403/403";
        }else{
            return "error/500/500";
        }

    }
    @Override
    public String getErrorPath() {
        return "/error";
    }
}
