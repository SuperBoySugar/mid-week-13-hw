package com.bank.testsuite;

import com.bank.pages.AccountPage;
import com.bank.pages.BankManagerLoginPage;
import com.bank.pages.CustomerLoginPage;
import com.bank.pages.HomePage;
import com.bank.testbase.BaseTest;
import org.testng.annotations.Test;

public class BankTest extends BaseTest {

    // Object Creation for page Object
    HomePage homePage = new HomePage();
    BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage();
    CustomerLoginPage customerLoginPage = new CustomerLoginPage();
    AccountPage accountPage = new AccountPage();



    @Test
    public void bankManagerShouldAddCustomerSuccessfully(){

        //click On "Bank Manager Login" Tab
        homePage.clickOnBankManagerLoginTab();
        // click On "Open Account" Tab
     //   bankManagerLoginPage.clickOnOpenAccountTab();
        // click On "Add Customer" Tab
        bankManagerLoginPage.clickOnAddCustomerTab();
        // // enter FirstName
        bankManagerLoginPage.inputFirstName("Vicky");
        // enter LastName
        bankManagerLoginPage.inputLastName("Patel");
        // enter PostCode
        bankManagerLoginPage.inputPostCode("Gh1 4FG");
        // add Customer
        bankManagerLoginPage.clickOnAddCustomerBtn();



    }
    @Test
    public void bankManagerShouldOpenAccountSuccessfully() throws InterruptedException {

        //click On "Bank Manager Login" Tab
        homePage.clickOnBankManagerLoginTab();
        // click on Open Account Tab
        bankManagerLoginPage.clickOnOpenAccountTab();
        // Search customer that created in first test
        Thread.sleep(1000);
        bankManagerLoginPage.clickOnCustomerCreatedFirst("Harry Potter");
        // Select Currency
        bankManagerLoginPage.clickOnCurrency("Pound");
        // click on "process" button
        bankManagerLoginPage.clickOnProcessBtn();
        // verify message "Account created successfully

        // click on "ok" button on popup


    }
    @Test
    public void customerShouldLoginAndLogoutSuceessfully(){

        //click on "Customer Login" Tab
        homePage.clickOnCustomerLoginTab();
        // search customer that you created
        customerLoginPage.clickOnSearchCustomer("Harry Potter");
        // Login Button
        customerLoginPage.clickOnLoginBtn();
        // Verify Text Logout
    //    accountPage.verifyTextLogout();
        // Click on Logout
       accountPage.clickOnLogoutBtn();
       // verify Text Your Name
        accountPage.verifyTextYourName();

    }
    @Test
    public void customerShouldDepositMoneySuccessfully(){
        //click on "Customer Login" Tab
        homePage.clickOnCustomerLoginTab();
        //search customer that you created.
        customerLoginPage.clickOnSearchCustomer("Harry Potter");
        //click on "Login" Button
        customerLoginPage.clickOnLoginBtn();
        //click on "Deposit" Tab
        accountPage.clickOnDepositBtn();
        // Enter amount 100
        accountPage.inputAmountField("100");
        //click on "Deposit" Button
        accountPage.clickOnDeposit();
        // verify message "Deposit Successful"
        accountPage.verifyText();

    }
    @Test
    public void customerShouldWithdrawMoneySuccessfully(){
        //click on "Customer Login" Tab
        homePage.clickOnCustomerLoginTab();
        //search customer that you created.
        customerLoginPage.clickOnSearchCustomer("Harry Potter");
        //click on "Login" Button
        customerLoginPage.clickOnLoginBtn();
        // //click on "Withdraw" Tab
        accountPage.clickOnWithdrawBtn();
        // Enter amount 50
        accountPage.inputFillAmountField("10");
        //click on "Deposit" Button
        accountPage.clickonWithraw();
        // verify message "Transaction Successful"
        accountPage.verifyTextAmountWithdraw();

    }


}
