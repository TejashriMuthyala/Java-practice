import java.util.Scanner;
class calculator{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num1=sc.nextInt();
		System.out.println("Enter another number");
		int num2=sc.nextInt();
		System.out.println("Select an operation:\n1 for addition\n2 for subtraction\n3 for multiplication");
		int choice=sc.nextInt();
		System.out.println(
			switch(choice)
			{
				case 1->num1+num2;
				case 2->num1-num2;
				case 3->num1*num2;
				default->"Invalid choice!";
			}
		);
	}
}