package week3Classroom;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erailsortnew {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//launch erail website
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("https://erail.in/");
		//clear and enter chennai egmore as from station
		driver.findElementById("chkSelectDateOnly").click();
       WebElement from= driver.findElementById("txtStationFrom");
       from.clear();
       from.sendKeys("Chennai Egmore",Keys.ENTER);
       Thread.sleep(10000);
       //erase and enter to station as new delhi
      WebElement to=driver.findElementById("txtStationTo");
      to.clear();
      to.sendKeys("New Delhi",Keys.ENTER);
      Thread.sleep(1000);
      //for loop to print all the items in the table
     List <WebElement> rows= driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr");
      System.out.println(rows.size());
     for(int i=1;i<=rows.size();i++)
     {
    	 List <WebElement> cols= driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td"); 
    	// System.out.println(cols.size());
    	 for(int j=1;j<=cols.size();j++)
    	 {
    		 String text= driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td["+j+"]").getText();
    		 System.out.print(text+" ");
    	 
    	 }
    	
    		System.out.println();
    		     }
     
	}
	 
}
