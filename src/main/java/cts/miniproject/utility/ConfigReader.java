	
package cts.miniproject.utility;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;

public class ConfigReader {
Properties pro;

public ConfigReader() {

try {
File src=new File("./Configuration/Config.property");

FileInputStream fis=new FileInputStream(src);

pro=new Properties();

pro.load(fis);
} catch (Exception e) {
// TODO Auto-generated catch block
System.out.println("Exception is" + e.getMessage());
}

}
public String getchromepath() {
String path=pro.getProperty("chromeDriver");
return path;
}
public String firefoxpath() {
String path=pro.getProperty("firefoxDriver");
return path;
}
public String TestData() {
String path=pro.getProperty("ExelData");
return path;
}


public String getApplicationURL() {
return pro.getProperty("URL");
}
public String getwordpressURL() {
return pro.getProperty("WordPressURl");
}
public String getwordpressLoginURL() {
return pro.getProperty("WordPressLoginURL");
}

}
