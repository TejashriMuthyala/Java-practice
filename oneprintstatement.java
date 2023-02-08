import java.util.Scanner;
class oneprintstaement{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a day");
		int day=sc.nextInt();
		System.out.println(
			switch(day)
			{
				case 1,8->"It's Sunday!";
				case 2,9->"It's Monday!";
				case 3->"It's Tuesday!";
				case 4->"It's Wednesday!";
				case 5->"It's Thursday!";
				case 6->"It's Friday!";
				case 7->"It's Saturday!";
				default->"Invalid day!";
			}
		);
	}
}