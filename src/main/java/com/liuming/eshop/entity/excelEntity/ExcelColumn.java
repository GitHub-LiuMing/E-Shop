package com.liuming.eshop.entity.excelEntity;

import java.lang.annotation.*;

/**
 * @Description 
 * @ClassName ExcelColumn
 * @Author 鲸落
 * @date 2019.12.20 10:28
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ExcelColumn {
    String value() default "";

    int col() default 0;
}
