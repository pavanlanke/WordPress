package cts.miniproject.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import cts.miniproject.pages.LoginPageWithPageFactory;
import cts.miniproject.utility.BrowserFactory1;
import cts.miniproject.utility.ConfigReader;


public class VerifyWordpressLoginPageFactory1{
	 ConfigReader select=new ConfigReader();
	
@Test
public void checkValidUser() {
//This will Launch browser and specific url
BrowserFactory1 browserfactory=new BrowserFactory1();

WebDriver driver=browserfactory.startBrowser("chrome",select.getwordpressURL() );

//Create pageObject using PageFactory1hr 
LoginPageWithPageFactory loginpage=PageFactory.initElements(driver, LoginPageWithPageFactory.class);

loginpage.typeUserNameAndPassword("admin", "demo123");
loginpage.clickOnLoginButton();

String url=driver.getCurrentUrl();

Assert.assertEquals(select.getwordpressLoginURL() , url);

}
}
