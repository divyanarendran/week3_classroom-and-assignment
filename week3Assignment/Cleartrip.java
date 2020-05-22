package week3Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Cleartrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options); 
		//Launch URL
		driver.get("https://www.cleartrip.com/");
			
		//impilcit wait
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		
		//Click on roundclick radio button
		driver.findElementById("RoundTrip").click();
		
		//Enter Chennai in from field
		WebElement from =driver.findElementById("FromTag");
		from.click();
		Thread.sleep(3000); //very important to give thread here
		from.sendKeys("Chennai");
		Thread.sleep(6000);
		from.sendKeys(Keys.TAB);
		
		//Enter  To city to NEw York
		
		WebElement to =driver.findElementById("ToTag");
		to.click();
		Thread.sleep(3000); //very important to give thread here
		to.sendKeys("New York");
		Thread.sleep(6000);
		to.sendKeys(Keys.TAB);
	
		//depart date
		driver.findElementById("DepartDate").click();
		driver.findElementByXPath("(//div[@id='ui-datepicker-div']//following::tr[5]/td[3])[1]").click();
		System.out.println("depart date done");
		
		//to date
		driver.findElementById("ReturnDate").click();
		driver.findElementByXPath("(//div[@id='ui-datepicker-div']//following::tr[5]/td[4])[1]").click();
		System.out.println("to date done");
		
		//Click on 1 to dropdown for adults
		WebElement adult=driver.findElementById("Adults");
    	Select adultdrop=new Select(adult);
    	adultdrop.selectByIndex(1);
    	
    	//Click on 1 to select children
    	WebElement children=driver.findElementById("Childrens");
    	Select childdrop=new Select(children);
    	childdrop.selectByVisibleText("1");
    	
    	//Click 1 to select 1 to infant dropdown
    	WebElement infant= driver.findElementById("Infants");
    	Select infantdrop=new Select(infant);
    	infantdrop.selectByValue("1");
    	
    	//Click on more options
    	driver.findElementById("MoreOptionsLink").click();
    	
    	//Select Premeium economy as class of travel
    	WebElement pe=driver.findElementById("Class");
    	Select economy=new Select(pe);
    	economy.selectByVisibleText("Premium Economy");
    	
    	//Enter Emirates as Preferred Airline and click on to Tab
    	driver.findElementById("AirlineAutocomplete").sendKeys("Emirates",Keys.TAB);
    	
    	
    	//Click on Search flights
    	driver.findElementById("SearchBtn").click();
	
		
		System.out.println("Assignment 3 completed");

	}

}
