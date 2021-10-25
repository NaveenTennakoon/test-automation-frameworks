package com.qa.test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class  LoginPageTest extends TestBase  {
    LoginPage loginPage;
    HomePage homePage;
    public LoginPageTest() {
        super();
    }

    @BeforeMethod
    public void setup() {
        loginPage = new LoginPage();
        homePage = loginPage.login(properties.getProperty("email"), properties.getProperty("password"));
    }

//    @Test
//    public void checkValidInvalidUser()
//    {
//        loginPage.login(properties.getProperty("email"), properties.getProperty("password_invalid"));
//        String bodyText = driver.findElement(By.tagName("body")).getText();
//        Assert.assertTrue(bodyText.contains("Invalid Password"), "Text not found!");
//    }
//
//    @Test
//    public void checkInvalidInvalidUser()
//    {
//        loginPage.login(properties.getProperty("email_invalid"), properties.getProperty("password"));
//        String bodyText = driver.findElement(By.tagName("body")).getText();
//        Assert.assertTrue(bodyText.contains("Invalid Email"), "Text not found!");
//    }
//
//    @Test
//    public void checkValidUser()
//    {
//        loginPage.login(properties.getProperty("email"), properties.getProperty("password"));
//    }

    @Test
    public void Test() {
        System.out.println("test");
     }

}
