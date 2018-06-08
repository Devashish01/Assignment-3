//print the pattern
class C
{
	void fun()
	{
		
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.print("\n");
		}
		
	}
}
public class A3 {

	public static void main(String[] args) {
		
		C obj=new C();
		obj.fun();
		
	}
}
