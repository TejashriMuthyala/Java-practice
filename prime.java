import java.util.Scanner;
class table{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt(); int i; int prm=0;
        for(i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                prm++;
            }
        }
        if(prm==2)
        {
            System.out.println(num+" is a prime number");
        }
        else
        {
            System.out.println(num+" is not a prime number");
        }
    }
}