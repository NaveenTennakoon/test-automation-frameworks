package com.qa.test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.ItemsPage;
import com.qa.pages.LoginPage;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class HomePageTest extends TestBase {

    LoginPage loginPage;
    HomePage homePage;
    ItemsPage itemsPage;

    public HomePageTest() {
        super();
    }

    @BeforeMethod
    public void setup() {
        initialization();
        loginPage = new LoginPage();
        homePage = new HomePage();
        homePage = loginPage.login(properties.getProperty("email"), properties.getProperty("password"));
        Logger log = Logger.getLogger("devpinoyLogger");
        PropertyConfigurator.configure("log4j.properties");
        log.info("opening website");
        itemsPage = homePage.items();
    }

    @Test
    public void Test() {
        System.out.println("test");
    }
}
