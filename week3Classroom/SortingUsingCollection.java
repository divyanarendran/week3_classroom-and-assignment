package week3Classroom;

import java.util.Arrays;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String[] company= {"HCL", "Wipro","Aspire Systems", "CTS"};
  int len= company.length;
   
  Arrays. sort(company);

  for (int i = len-1; i>=0; i--)
	{
		System.out.println(company[i]);
	}
   //System.out.println(company);
	}

}
