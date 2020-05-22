package week3Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Launch the url 
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/table.html");

		//Get the table and store it as webelement
		List<WebElement> rows= driver.findElementsByXPath("//table[@id='table_id']//tr");
		//Print the number of rows
		System.out.println(rows.size());
		
		//Print no.of columns
		
		List<WebElement> columns = driver.findElementsByXPath("//table[@id='table_id']//td");
		System.out.println(columns.size());
		
		//Get the progress value of "Learn to interact with elements 
		WebElement progress=driver.findElementByXPath("(//tr[@class='even']//td[2])[1]");
		System.out.println(progress.getText());
		
		//Find the vital task with least completed progress
		//WebElement table =driver.findElementByXPath("//table[@id='table_id']//tr//td[2]");
		List<WebElement> allrows= driver.findElementsByXPath("//table[@id='table_id']//tr//td[2]");
		List<Integer> allinteger=new ArrayList<Integer>();
		String progress1="";
		for (WebElement pro : allrows) {
			 progress1= pro.getText().replaceAll("%", "");
			allinteger.add(Integer.parseInt(progress1));
			
		}
	
		Collections.sort(allinteger);
		System.out.println(allinteger);
		System.out.println(allinteger.get(0));
		driver.findElementByXPath("(//td[(text()='30%')]/following::input)").click();
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
