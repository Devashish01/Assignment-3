//Check if a given year is a leap year or not.
import java.util.Scanner;
class B
{
	
	void fun(int a) {
		if(a%4 == 0)
	    {
	        if(a%100 == 0)
	        	{
	            
	        		if (a%400 == 0)
	        			System.out.println("leap year");
	        		else
	            	System.out.println("not a leap year");
	        	}
	        else
	        	System.out.println("leap year");
	    }
	    else
	    	System.out.println("not a leap year");
	}
	
	
}


public class A2 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("Enter a year");
		B obj =new B();
		int a=input.nextInt();
	obj.fun(a);
		
	}
	
	}