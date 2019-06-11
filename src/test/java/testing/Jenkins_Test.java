package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Jenkins_Test {
	WebDriver driver;
  @Test
  public void LoginTest() {
	  driver.findElement(By.name("userName")).sendKeys("manzoor");
	  driver.findElement(By.name("password")).sendKeys("manzoor");
	  driver.findElement(By.name("login")).click();
	  System.out.println("title after login is "+ driver.getTitle());
  }
  
  @BeforeTest
  public void beforeTest() {
	
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_ADMIN\\Downloads\\Silenium Jar Files\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://newtours.demoaut.com/");
	  System.out.println("current title is " + driver.getTitle());
  }
  
  @AfterTest
  public void afterTest() {
	  driver.quit();
  }
}
