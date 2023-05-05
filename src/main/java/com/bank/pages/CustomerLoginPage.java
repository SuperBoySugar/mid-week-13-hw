package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class CustomerLoginPage extends Utility {

    By searchCustomer = By.id("userSelect");
    By loginBtn = By.xpath("//button[text()='Login']");

    //search customer that you created.
    public void clickOnSearchCustomer(String searchCustomer1){
        pmClickOnElement(searchCustomer);
        pmSelectByVisibleTextFromDropDown(searchCustomer,searchCustomer1);

    }
    //click on "Login" Button
    public void clickOnLoginBtn(){
        pmClickOnElement(loginBtn);
    }
}
