import java.util.Scanner;
class table{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt(); int i;
        for(i=1;i<=10;i++)
        {
            System.out.println(num*i);
        }
    }
}