import java.util.Scanner;
class divisibleby5{
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
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%5==0) //checking if the array element is divisible by 5
            {
                System.out.println(arr[i]); //to print the value of array that is divisible by 5
            }
        }
    }
}