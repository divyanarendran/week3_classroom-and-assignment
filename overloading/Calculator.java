package overloading;

public class Calculator {
	
	public void add(int add1, int add2)
	{
		
		System.out.println(add1+add2);
	}
	public void add(int add3,int add4,int add5)
	{
		System.out.println(add3+add4+add5);
	}
	public void multiply(int mul1,int mul2)
	
	{
		System.out.println(mul1*mul2);
	}
  public void multiply(int mul3,double mul4)
  {
	System.out.println(mul3*mul4);  
  }
  public void subtract(int sub1,int sub2)
  {
	  System.out.println(sub1-sub2);
  }
  public void subtract(double sub3, double sub4)
  {
	  System.out.println(sub3-sub4);
  }

  public void division(int div1,int div2)
  {
	  System.out.println(div1/div2);
  }
  public void division(int div3,double div4)
  {
	  System.out.println(div3/div4);
  }
  public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal=new Calculator();
		cal.add(1, 2);
		cal.add(1, 2, 0);
		cal.subtract(2, 1);
		cal.subtract(2.4, 2.1);
		cal.multiply(3, 4);
		cal.multiply(2, 2.14);
		cal.division(10, 2.1);
		cal.division(6, 2);

	}

}
