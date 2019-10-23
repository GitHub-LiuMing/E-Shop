package com.liuming.eshop.controller.classifyController;

import com.liuming.eshop.entity.classifyEntity.Classify;
import com.liuming.eshop.service.classifyService.ClassifyService;
import com.liuming.eshop.utils.DataResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 分类管理
 * @ClassName ClassifyController
 * @Author 鲸落
 * @date 2019.08.06 15:35
 */
@RestController
@RequestMapping("/classify")
public class ClassifyController {
    @Autowired
    private ClassifyService classifyService;

    /**
     * @Description 添加分类
     * @param classify
     * @return com.liuming.eshop.utils.DataResult
     * @Author 鲸落
     * @Date 2019.08.06 16:53
     *
     * //@RequestBody(required=false) 如果参数类型支持null,则是false
     */
    @RequestMapping("/addClassify")
    public DataResult addClassify(@RequestBody(required=false) Classify classify){
        return classifyService.addClassify(classify);
    }

    /**
     * @Description 查询分类
     * @return com.liuming.eshop.utils.DataResult
     * @Author 鲸落
     * @Date 2019.08.07 13:49
     */
    @RequestMapping("/findClassify")
    public DataResult findClassify(){
        return classifyService.findClassify();
    }
}
