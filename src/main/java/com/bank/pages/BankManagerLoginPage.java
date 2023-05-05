package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class BankManagerLoginPage extends Utility {


    By addCustomer = By.xpath("//button[contains(text(),'Add Customer')]");
    By firstName = By.cssSelector("input[placeholder='First Name']");
    By lastName = By.cssSelector("input[placeholder='Last Name']");
    By postCode = By.cssSelector("input[placeholder='Post Code']");
    By addCustomerBtn = By.xpath("//button[@type='submit']");
    By openAccount = By.xpath("//button[contains(text(),'Open Account')]");
    By searchCustomer = By.id("userSelect");
    By currency = By.id("currency");
    By processBtn = By.xpath("//button[text()='Process']");


    // click On "Add Customer" Tab
    public void clickOnAddCustomerTab() {
        pmClickOnElement(addCustomer);
    }

    // enter FirstName
    public void inputFirstName(String firstName1) {
        sendTextToElement(firstName, firstName1);
    }

    // enter LastName
    public void inputLastName(String lastName1) {
        sendTextToElement(lastName, lastName1);
    }

    // enter Postcode
    public void inputPostCode(String postCode1) {
        sendTextToElement(postCode, postCode1);
    }

    public void clickOnAddCustomerBtn() {
        pmClickOnElement(addCustomer);
    }

    // click On "Open Account" Tab
    public void clickOnOpenAccountTab() {
        pmClickOnElement(openAccount);

    }
    // Search customer that created in first test
    public void clickOnCustomerCreatedFirst(String searchCustomer1){
        pmClickOnElement(searchCustomer);

       pmSelectByVisibleTextFromDropDown(searchCustomer,searchCustomer1);
    }
    // Select currency "Pound"
    public void clickOnCurrency(String currency1){
        pmClickOnElement(currency);
        pmSelectByVisibleTextFromDropDown(currency,currency1);
    }
    // click on "process" button
    public void clickOnProcessBtn(){
        pmClickOnElement(processBtn);
    }
    // verify message "Account created successfully

    // click on "ok" button on popup


}