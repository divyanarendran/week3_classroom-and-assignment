package week3Assignment;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Redbusurl {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options); 
		//Launch URL
		driver.get("https://www.redbus.in/");
			
		//implcit wait
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		
		//Enter chennai in from field and enter Tab
			WebElement from =driver.findElementById("src");
		   from.sendKeys("Chennai-(All Locations)");
			from.sendKeys(Keys.ENTER);
			from.sendKeys(Keys.TAB);
			
			//Enter Trichy in to field and enter tab
			WebElement to =driver.findElementById("dest");
			to.sendKeys("Trichy");
			to.sendKeys(Keys.ENTER);
			to.sendKeys(Keys.TAB);
			
			
			
			//Click on to current date
		   
			driver.findElement(By.xpath("(//td[@class='current day'])[2]")).click();
			Thread.sleep(2000);
			
			//Click on to  return date
			
			//driver.findElementByXPath("//div[@id='rb-calendar_return_cal']//following::tr[5]/td[4]").click();
			driver.findElementByXPath("//div[@class='fl search-box date-box gtm-returnCalendar']").click();
			driver.findElementByXPath("//div[@id='rb-calendar_return_cal']//tbody/tr[1]/td[3]/button").click();
			driver.findElementByXPath("//div[@id='rb-calendar_return_cal']//tbody/tr[1]/td[3]/button").click();
			driver.findElementByXPath("//div[@id='rb-calendar_return_cal']//following::tr[5]/td[6]").click();
			Thread.sleep(1000);
			
			//click on Search buses
			driver.findElementById("search_btn").click();
			Thread.sleep(1000);
            //driver.close();
			System.out.println("Assignment 4 completed");

	}

}
