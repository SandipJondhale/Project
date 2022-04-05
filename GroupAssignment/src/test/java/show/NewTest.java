package show;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	public static WebDriver driver;
	
  @Test
  public void f() {
	
	  WebElement city = driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div/div/div[1]/div/div/input"));
	  city.sendKeys("mumbai");
	  driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div/div/div[2]/ul/li[1]/div/div/img")).click();
	  WebElement rrr = driver.findElement(By.xpath("//*[@id=\"super-container\"]/div[2]/div[2]/div[1]/div[2]/div/div/div/div[2]/div/div[1]/div[1]/a/div/div[2]/div/img"));
	  rrr.click();
	  		//WebElement rrr = driver.findElement(By.cssSelector("img[alt='RRR']"));
		   //rrr.click();
		  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://www.bookmyshow.com");
	  driver.manage().window().maximize();
	  
	  
	  
	    }

  @AfterTest
  public void afterTest() {
  }

}
