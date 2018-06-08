//prime or not
import java.util.Scanner;
class F
{
  int fun(int a)
	{int b=a;
	  int r=1;
	   for(int i=2;i<=b/2;i++)
       {
       	if(b%i==0)
       		{
       			r=0;
                   break;
       		}
       }
	  
	  
	  return r;
		
	}
}
public class A6 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		F obj=new F();
		System.out.println("Enter a number");
		int a=input.nextInt();
	
	int r=obj.fun(a);
	if(a==1 || a==0)
		System.out.println(a+" is neither prime nor composite");
	else if(r==1)
			System.out.println(a+" is prime");
		else
			System.out.println(a+" is not prime");
		
	}
	
	}