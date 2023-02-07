import java.util.Scanner;
class task{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println(num+" is the even");
		}
		else
		{
			System.out.println(num+" is odd");
		}
	}
}