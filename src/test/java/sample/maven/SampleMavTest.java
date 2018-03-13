package sample.maven;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

//import com.gargoylesoftware.htmlunit.javascript.host.file.File;
import java.io.File;
import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;

@Test
public class SampleMavTest {
 
	File f;

  public void Sample() throws IOException
  {
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  
	  //DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	  ChromeOptions d = new ChromeOptions();
	  //d.addArguments("test-type");
	  //capabilities.setCapability("chrome.binary", "F:\\Repperio eclipse\\maven\\chromedriver.exe");
	  //capabilities.setCapability(ChromeOptions.CAPABILITY, d);
	  
	  //d.setBinary("F:\\Repperio eclipse\\maven\\chromedriver.exe");
	  f = new File("C:\\Users\\tusha\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
	  d.setBinary(f);
	  
	  //f = new File("F:\\Repperio eclipse\\maven\\chromedriver.exe");
	  //ChromeDriverService service = new ChromeDriverService.Builder().usingDriverExecutable(f).usingAnyFreePort().build();
	  //service.start();
	  //WebDriver driver = new RemoteWebDriver(service.getUrl(),DesiredCapabilities.chrome());
	  WebDriver driver = new ChromeDriver(d);
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com");
	  driver.get("https://www.facebook.com");
	  driver.quit();
  }
  
}
