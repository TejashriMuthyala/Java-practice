import java.util.Scanner;
class arrnew{
    public static void main(String args[])
    {
        Scanner ar=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int ns=ar.nextInt();
        int arr[]=new int[ns];
        System.out.println("Please enter the values of array");
        for(int i=0;i<ns;i++)
        {
            arr[i]=ar.nextInt();
        }
        System.out.println("The array values are: ");
        for(int dummy:arr)
        System.out.println(dummy);
    }
}