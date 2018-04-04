package com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.PageObjects;


import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.Base.PageInstances;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;



public class ExcelPage extends PageInstances {


    public static String getCellData(String xlpath, String sheetName, int rowNum, int cellNum) {

        try {
            FileInputStream fis = new FileInputStream(xlpath);
            Workbook wb = WorkbookFactory.create(fis);
            org.apache.poi.ss.usermodel.Sheet s = wb.getSheet(sheetName);

            String v = null;

            if (s.getRow(rowNum).getCell(cellNum).getCellType() == Cell.CELL_TYPE_STRING) {
                v = s.getRow(rowNum).getCell(cellNum).getStringCellValue();
                System.out.println(v);
            } else if (s.getRow(rowNum).getCell(cellNum).getCellType() == Cell.CELL_TYPE_NUMERIC) {
                v = s.getRow(rowNum).getCell(cellNum).getNumericCellValue() + "";
                System.out.println(v);
            }

            return v;

        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static int getRowCount(String xlpath1, String sheetName1) {
        try {
            FileInputStream fis1 = new FileInputStream(xlpath1);
            Workbook wb1 = WorkbookFactory.create(fis1);
            return wb1.getSheet(sheetName1).getLastRowNum();
        } catch (Exception e) {
            return 0;
        }

    }


    public static boolean display(String xlpath, String sheetName, int rowNum, int cellNum) {

        boolean flag=false;
        if (getCellData(xlpath, sheetName, rowNum, cellNum) != null) {
            flag = true;
        }
        return flag;
    }
}