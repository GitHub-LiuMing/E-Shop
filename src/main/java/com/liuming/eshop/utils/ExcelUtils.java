package com.liuming.eshop.utils;

import com.liuming.eshop.entity.userEntity.User;
import org.apache.poi.ss.usermodel.*;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Description
 * @ClassName ExcelUtils
 * @Author 鲸落
 * @date 2019.12.19 15:30
 */
public class ExcelUtils {
    public static List<User> excelToShopIdList(InputStream inputStream) throws Exception {
        List<User> list = new ArrayList<>();
        Workbook workbook = null;
        workbook = WorkbookFactory.create(inputStream);
        inputStream.close();
        //工作表对象
        Sheet sheet = workbook.getSheetAt(0);
        //总行数
        int rowLength = sheet.getLastRowNum();
        //            System.out.println("总行数有多少行" + rowLength);
        //工作表的列
        Row row = sheet.getRow(0);

        //总列数
        int colLength = row.getLastCellNum();
        //            System.out.println("总列数有多少列" + colLength);
        //得到指定的单元格
        Cell cell = row.getCell(0);
        for (int i = 1; i <= rowLength; i++) {
            User user = new User();
            row = sheet.getRow(i);
            for (int j = 0; j < colLength; j++) {
                //列： 0姓名	1人员编号 2餐补 3部门
                cell = row.getCell(j);
                if (cell != null) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    String data = cell.getStringCellValue();
                    data = data.trim();
                    if (j == 0) {
                        user.setUserId(data);
                    } else if (j == 1) {
                        user.setUserName(data);
                    } else if (j == 2) {
                        user.setUserPassword(data);
                    } else if (j == 3) {
                        user.setUserCreateDate(new Date());
                    } else if (j == 4) {
                        user.setUserUpdateDate(new Date());
                    }
                }
            }
            list.add(user);
        }
        return list;
    }
}