package week3Classroom;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTrainNamesAreUnique {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Launch the browser
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("https://erail.in/");
		
		//uncheck the sort by date checkbox
		driver.findElementById("chkSelectDateOnly").click();
		
	       //sleep for two seconds
	       Thread.sleep(1000);
	       
	       List <WebElement> rows= driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr");
	       int rowsize=rows.size();
	      System.out.println(rows.size());
	      String trainname = null;
	      List <String>tname=new ArrayList<String>();
	      
	      for(int i=1;i<rows.size();i++)
	      {
	    	   trainname=driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td[2]/a").getText();
	    	 // System.out.println(trainname);
	    	  tname.add(trainname);
	
	      }
	      
	      Set<String> values= new HashSet<String>(tname);
	     // values.add(trainname);
	      int setsize=values.size();
	     System.out.println(values.size());
	     if(rowsize!=setsize)
	     {
	    	 System.out.println("Duplicate present");
	     }
	     else
	     {
	    	 System.out.println("trainnames are unique");
	     }
		
		
		
		
		
		
		
		

	}

}
