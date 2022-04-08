package show;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import show.MyWork;

@SuppressWarnings("unused")
public class NewTest {
	public static WebDriver driver;
	public static Properties prop;
	public static String sAppURL;
	public static String city;
	public static String movie;
	public static Actions actions;
	public static String readXL1;	
	
	
	
  @SuppressWarnings("unused")
@Test
  public void f() throws InterruptedException,IOException{
	  
	  actions.moveToElement(driver.findElement(By.cssSelector("#super-container > div.sc-b1h692-2.bjlzfS > header > div.sc-gmeYpB.bFJFiZ > div > div > div > div.sc-eInJlc.fIvCmI > div:nth-child(1) > span"))).perform();	 
	  
	  String []data = MyWork.readXL1();
	  driver.findElement(By.xpath("//*[@id=\'modal-root\']/div/div/div/div[2]/ul/li[1]/div/div/img")).sendKeys(data[1]);
	  System.out.println('\n'+"Search Results for "+ data[1]);
	  //driver.findElement(By.linkText("sc-bqjOQT aUKrX")).click();
		//driver.findElement(By.xpath("//*[@id=\"super-container\"]/div[2]/div[4]/div[2]/div[4]/div/div/div[2]/a[1]/div/div[2]/div/img")).click();
		//driver.findElement(By.xpath("//*[@id=\'modal-root\']/div/div/div/div[2]/ul/li[1]/div/div/img")).sendKeys(data[1]);
	  //driver.findElement(By.xpath("//*[@id=\'modal-root\']/div/div/div/div[2]/ul/li[1]/div/div/img")).click();
		//driver.findElement(By.xpath("//*[@id=\'super-container\']/div[2]/div[2]/div[1]/div[2]/div/div/div/div[2]/div/div[1]/div[1]/a/div/div[3]/div[1]/div")).click();
		 //System.out.println('\n'+"Search Results for "+ data[1]);
		//System.out.println('\n'+m);
	  
	  
	  
	/*for(int counter =1; counter<data.length;counter++)
	 {
		 actions.moveToElement(driver.findElement(By.xpath("//*[@id=\'super-container\']/div[2]/header/div[1]/div/div/div/div[2]/div[1]/span"))).perform();
		 //driver.findElement(By.xpath("//*[@id=\'super-container\']/div[2]/header/div[1]/div/div/div/div[2]/div[1]/span")).click();//click on city
		 driver.findElement(By.xpath("//*[@id=\'modal-root\"]/div/div/div/div[2]/ul/li[1]/div/div/img")).sendKeys(data[counter]);//city_name
		 driver.findElement(By.xpath("//*[@id=\'super-container\']/div[2]/div[2]/div[1]/div[2]/div/div/div/div[2]/div/div[1]/div[1]/a/div/div[2]/div/img")).click();//rrrmovie
		 Thread.sleep(5000);
	 }*/
	 
	  
	  String Header = driver.findElement(By.xpath("//*[@id='component-1']/section/span/h4")).getText();
	  String aboutTheMovie = driver.findElement(By.xpath("//*[@id='component-1']/section/span/div/span")).getText();

		 
		 
		 
	 }
		 
	/*  driver.findElement(By.xpath("//*[@id=\'super-container\']/div[2]/header/div[1]/div/div/div/div[2]/div[1]/span")).click();
	  WebElement city= driver.findElement(By.xpath("//*[@id=\'modal-root\']/div/div/div/div[2]/ul/li[1]/div/div/img"));
	  city.sendKeys(sloc);
	  WebElement movie=driver.findElement(By.xpath("//*[@id=\'super-container\']/div[2]/div[2]/div[1]/div[2]/div/div/div/div[2]/div/div[1]/div[1]/a/div/div[2]/div/img"));
	  movie.sendKeys(sloc);
	  driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div/div/div[2]/ul/li[1]/div/div/img")).click();
	  //WebElement m = driver.findElement(By.xpath("//*[@id=\"super-container\"]/div[2]/header/div[2]/div/div/div/div[1]/div/a[1]"));
		//m.click();
		//WebElement h = driver.findElement(By.xpath("//*[@id=\"super-container\"]/div[2]/header/div[2]/div/div/div/div[1]/div/a[1]"));
		//h.click();
		
	  WebElement rrr = driver.findElement(By.xpath("//*[@id=\'super-container\']/div[2]/div[4]/div[2]/div[4]/div/div/div[2]/a[1]/div/div[2]/div/img"));
	 // rrr.click();
	  //WebElement l = driver.findElement(By.xpath("//*[@id=\"component-1\"]/section/span/h4"));
	  
	  
	  
	  		//WebElement rrr = driver.findElement(By.cssSelector("img[alt='RRR']"));
		    //rrr.click();
		  
	  */
 
  @BeforeTest
  public void beforeTest() throws FileNotFoundException, IOException {
	  try {
		  prop = new Properties();
	  }catch (Exception e) {
		  
		  e.printStackTrace();
	  }
	  
	  prop.load(new FileInputStream("D:\\JavaWorkspace\\GroupAssignment\\Confirguration\\BO_MyShow.properties"));
	  sAppURL = prop.getProperty("sAppURL");
	  city = prop.getProperty("Mumbai");
	  movie = prop.getProperty("RRR");
	  
	  
	  System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
	  ChromeOptions options = new ChromeOptions();
	  options.addArguments("--disable-notifications");
	  driver = new ChromeDriver(options);
	  driver.get("http://www.bookmyshow.com");
	  actions = new Actions(driver);
	  driver.manage().window().maximize();
	  driver.get(sAppURL);
	  
	  
	  
	    }

  @AfterTest
  public void afterTest() {
	  //driver.quit();
  }

}
