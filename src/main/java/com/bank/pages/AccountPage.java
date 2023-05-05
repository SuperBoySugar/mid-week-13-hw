package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class AccountPage extends Utility {

    By logoutBtn = By.xpath("//button[text()='Logout']");
    By yourName = By.cssSelector("div[class='form-group'] label");
    By depositBtn = By.xpath("//button[normalize-space()='Deposit']");
    By amountField = By.xpath("//input[@placeholder='amount']");
    By deposit = By.xpath("//button[text()='Deposit']");
    By depositMessage = By.xpath("//span[text()='Deposit Successful']");
    By withdrawBtn = By.xpath("//button[normalize-space()='Withdrawl']");
    By fillAmount = By.cssSelector("input[placeholder='amount']");
    By withdraw = By.xpath("//button[normalize-space()='Withdraw']");
    By withdrawText = By.xpath("//label[text()='Amount to be Withdrawn :']");

    public void verifyTextLogout(){
        verifyText("Logout",logoutBtn,"text is not display");
    }
    public void clickOnLogoutBtn(){
        pmClickOnElement(logoutBtn);
    }
    //verify text Your Name
    public void verifyTextYourName(){
        verifyText("Your Name :",yourName,"text not displayed");
    }
    // click On Deposit
    public void clickOnDepositBtn(){
        pmClickOnElement(depositBtn);

    }
    //Enter amount 100
    public void inputAmountField(String amount1){
        sendTextToElement(amountField,amount1);
    }
    //click on "Deposit" Button
    public void clickOnDeposit(){
        pmClickOnElement(deposit);
    }
    // verify message "Deposit Successful"
    public void verifyText(){
        verifyText("Deposit Successful",depositMessage,"money is deposited");
    }
    //  //click on "Withdraw" Tab
    public void clickOnWithdrawBtn(){
        pmClickOnElement(withdrawBtn);
    }
    //  // Enter amount 50
    public void inputFillAmountField(String fillAmount1){
        sendTextToElement(fillAmount,fillAmount1);
    }
    // click on Withdraw
    public void clickonWithraw(){
        pmClickOnElement(withdraw);
    }
    // verify Text withdraw Succesful
    public void verifyTextAmountWithdraw(){
        verifyText("Transaction successful\n" +
                "Amount to be Withdrawn :",withdrawText,"text is not display");
    }

}
