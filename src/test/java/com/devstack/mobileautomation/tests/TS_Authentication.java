package com.devstack.mobileautomation.tests;

import com.devstack.mobileautomation.pages.PageLogin;
import com.devstack.mobileautomation.util.TestNGUtil;
import org.testng.annotations.Test;

public class TS_Authentication extends TestNGUtil {

    @Test
    public void loginTest(){
        PageLogin pageLogin = pageHome.clickOnLoginIcon();
        pageLogin.fillUserName("testuser@testmail.com");
        pageLogin.fillPassword("12345678");
        pageLogin.clickLogin();
    }
}
