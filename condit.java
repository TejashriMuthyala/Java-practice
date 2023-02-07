import java.util.Scanner;
class condit{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Hey user, enter first value");
		int num1=sc.nextInt();
		System.out.println("Hey user, enter second value");
		int num2=sc.nextInt();
		int res=num1>num2?num1:num2;
		System.out.println("The biggest number is: "+res);
	}
}