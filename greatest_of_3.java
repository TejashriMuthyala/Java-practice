import java.util.Scanner;
class task
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Hey user, enter first value");
		int num1=sc.nextInt();
		System.out.println("Hey user, enter second value");
		int num2=sc.nextInt();
		System.out.println("Hey user, enter third value");
		int num3=sc.nextInt();
		if(num1>num2)
		{	
			if(num1>num3)
			{
				System.out.println(num1+" is the greatest");
			}
			else
			{
				System.out.println(num3+" is the greatest");
			}
		}
		else
		{	
			if(num2>num3)
			{
				System.out.println(num2+" is the greatest");
			}
			else
			{
				System.out.println(num3+" is the greatest");
			}
		}
	}
}