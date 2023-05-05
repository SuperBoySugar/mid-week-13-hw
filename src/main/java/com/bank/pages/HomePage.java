package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By bankManagerLogin = By.xpath("//button[normalize-space()='Bank Manager Login']");
    By customerLogin = By.xpath("//button[text()='Customer Login']");




    // click On "Bank Manager Login" Tab
    public void clickOnBankManagerLoginTab(){
        pmClickOnElement(bankManagerLogin);

    }
    // click on "Customer Login" Tab
    public void clickOnCustomerLoginTab(){
        pmClickOnElement(customerLogin);

    }



}
