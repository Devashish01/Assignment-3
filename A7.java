//Find the reverse of a number N.
import java.util.Scanner;
class G
{
	void fun(int a)
	{ int b,rem;//,sum=0;
		b=a;
		while(b>0)
		{
			rem=b%10;
			//sum=sum+rem;
			b=b/10;
			System.out.print(rem);
		}
	
	}
	
}

public class A7 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		G obj=new G();
		System.out.println("enter the number");
		int a=input.nextInt();
	
		obj.fun(a);
		
		
	}
	
	}