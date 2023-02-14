import java.util.Scanner;
class smallest{
    public static void main(String args[])
    {
        Scanner ar=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int newSize=ar.nextInt(); //To get the length of array
        int arr[]=new int[newSize]; //To create an array with desired length
        System.out.println("Please enter the values of array");
        for(int i=0;i<newSize;i++) //traditional for
        {
            arr[i]=ar.nextInt(); //to assign values to the array
        }
        int small=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<small) //comparing values of array
            {
                small=arr[i];
            }
        }
        System.out.println(big); //to print the smallest value of array
    }
}