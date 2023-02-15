import java.util.Scanner;
class calc{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value");
        int num1=sc.nextInt(); //taking first parameter from user
        System.out.println("Enter another value");
        int num2=sc.nextInt(); //taking second parameter from user
        calc ops=new calc();
        ops.add(num1,num2); //method call with parameters
        ops.sub(num1,num2); //method call with parameters
    }
    public void add(int num1,int num2){
        System.out.println("The addition is: " +(num1+num2)); //addition operation
    }
        public void sub(int num1,int num2){
        System.out.println("The subtraction is: " +(num1-num2)); //subtraction
    }
}