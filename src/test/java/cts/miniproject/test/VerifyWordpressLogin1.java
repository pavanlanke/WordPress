package cts.miniproject.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import cts.miniproject.pages.WordpressLogin1;

public class VerifyWordpressLogin1 {
@Test
public void verifyValidLogin() {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\pavan lanke\\eclipse-workspace\\pavan\\src\\test\\resources\\binaries\\chromedriver.exe");
WebDriver driver=new ChromeDriver();

driver.get("http://demosite.center/wordpress/wp-login.php");
driver.manage().window().maximize();

WordpressLogin1 login=new WordpressLogin1(driver);

login.typeUserNameAndPassword("admin", "demo123");
login.clickOnLoginButton();


String url=driver.getCurrentUrl();
Assert.assertEquals("http://demosite.center/wordpress/wp-admin/", url);
}
}