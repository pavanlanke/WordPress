package cts.miniproject.utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory1 {
public WebDriver driver;
public WebDriver startBrowser(String browserName,String url) {
	
	ConfigReader insert=new ConfigReader();
if(browserName.equalsIgnoreCase("chrome")) {
	
	
	System.setProperty("webdriver.chrome.driver",insert.getchromepath() );


driver=new ChromeDriver();
}
else if(browserName.equalsIgnoreCase("firefox")){
	System.setProperty("webdriver.gecko.driver",insert.firefoxpath());
	

driver=new FirefoxDriver();
}

driver.manage().window().maximize();
driver.get(url);
return driver;
}

}
