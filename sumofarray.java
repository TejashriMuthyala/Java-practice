import java.util.Scanner;
class sumofarray{
    public static void main(String args[])
    {
        int sum=0;
        Scanner ar=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int ns=ar.nextInt();
        int arr[]=new int[ns];
        System.out.println("Please enter the values of array");
        for(int i=0;i<ns;i++)
        {
            arr[i]=ar.nextInt();
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}