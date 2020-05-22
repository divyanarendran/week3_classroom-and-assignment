package week3Classroom;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import org.openqa.selenium.WebDriver;


public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String input="PayPal India";
    char[] charArray = input.toCharArray();
    Set<Character> charSet= new LinkedHashSet<Character>();
    Set<Character> dupCharSet= new LinkedHashSet<Character>();
   // WebDriver driver=new Chromedriver();
    
    for(Character eachChar:charArray)
    {
    	
    	if(!charSet.add(eachChar))
    	{
    		dupCharSet.add(eachChar);
    	}
    	
    }
    charSet.removeAll(dupCharSet);
    for(Character temp:charSet)
    {
    	if(temp!=' ') {
    	System.out.print(temp);
    	}
    }
	}

}
