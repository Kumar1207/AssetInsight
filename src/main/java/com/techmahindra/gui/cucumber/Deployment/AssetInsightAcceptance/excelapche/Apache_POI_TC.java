package com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.excelapche;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.Base.BasePage;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Utils.Constant;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Utils.ExcelUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Apache_POI_TC extends BasePage {

        @FindBy(xpath = ".//*[text()='Technology']")
        private WebElement technologyHomePage;

        @FindBy(xpath = "//*[text()='View']")
        private WebElement view;

        @FindBy(xpath = "//*[text()='Edit']")
        private WebElement edit;

        @FindBy(xpath = "//*[text()='Change']")
        private WebElement change;

        @FindBy(xpath = "//*[text()='Share']")
        private WebElement share;


        public static void getTechnologyApplicationdata() throws Exception {

            ExcelUtils.setExcelFile(Constant.Path_Application +Constant.File_Application,"Technology");
            ExcelUtils.getCellData(1,61);
            System.out.println(ExcelUtils.getCellData(1,61));
            StringTokenizer st = new StringTokenizer(ExcelUtils.getCellData(1, 61), ";");


            WebElement dg=driver.findElement(By.xpath("//*[text()='DATA GOVERNANCE']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", dg);
            dg.click();

            Thread.sleep(1000);
            String view=driver.findElement(By.xpath("//*[text()='View']")).getText();
            Thread.sleep(1000);
            String edit=driver.findElement(By.xpath("//*[text()='Edit']")).getText();
            Thread.sleep(1000);
            String change=driver.findElement(By.xpath("//*[text()='Change']")).getText();
            Thread.sleep(1000);
            String delete=driver.findElement(By.xpath("//*[text()='Delete']")).getText();
            Thread.sleep(1000);
            String share=driver.findElement(By.xpath("//*[text()='Share']")).getText();

            ArrayList<String> str=new ArrayList<String>();
            while(st.hasMoreTokens())
            {
                str.add(st.nextToken().toString());
                System.out.println(view+edit+change+share);

            }
            for(int i=0;i<str.size();i++) {
                if(str.get(i).contains(view) || str.get(i).contains(edit)||str.get(i).contains(change)||str.get(i).contains(share)) {
                    System.out.println("Pass");
                }
                else
                {
                    System.out.println("Fail");
                }
            }

        }
        public static void getProductdata() throws Exception {

            ExcelUtils.setExcelFile(Constant.Path_Product +Constant.File_Product,"Products");
            ExcelUtils.getCellData(7,40);
            System.out.println(ExcelUtils.getCellData(7,40));
            StringTokenizer st = new StringTokenizer(ExcelUtils.getCellData(7, 40), ";");


            WebElement dg=driver.findElement(By.xpath("//*[text()='DATA GOVERNANCE']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", dg);
            dg.click();

            WebElement data=driver.findElement(By.xpath("//*[text()='Where possible please specify the retention period applied to personal data on your product and its basis.']"));
            String txt=data.getText();


            if (st.toString().contains(txt))
            {
                System.out.println("Comparing is ");
            }

     /*   ArrayList<String> str=new ArrayList<String>();
        while(st.hasMoreTokens())
        {
            str.add(st.nextToken().toString());


        }
        for(int i=0;i<str.size();i++) {
            if(str.get(i).contains(data)) {
                System.out.println("Pass");
            }
            else
            {
                System.out.println("Fail");
            }
        }*/

        }

        public Apache_POI_TC() throws Exception {
            super();
        }
        @Override
        protected WebElement elementForLoading() throws Exception {
            return technologyHomePage;
        }

        @Override
        public boolean isPageDisplayed() throws Exception {
            return technologyHomePage.isDisplayed();
        }

        @Override
        protected void pageName() throws Exception {

        }
    }
