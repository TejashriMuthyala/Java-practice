import java.util.Scanner;
class cal{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value");
        int num1=sc.nextInt(); //taking first parameter from user
        System.out.println("Enter another value");
        int num2=sc.nextInt(); //taking second parameter from user
        System.out.println("Enter your choice: 1 for Addition, 2 for Subtraction, 3 for Multiplication, 4 for Division");
        int choice=sc.nextInt(); //taking the choice of the user
        cal ops=new cal();
        int addition=ops.add(num1,num2); //method call with parameters
        int subtraction=ops.sub(num1,num2); //method call with parameters
        int multiplication=ops.mul(num1,num2); //method call with parameters
        int division=ops.div(num1,num2);//method call with parameters
        System.out.println(
        switch(choice)
        {
            case 1->"The addition of "+num1+" and "+num2+" is: "+addition; //printing addition
            case 2->"The subtraction of "+num1+" and "+num2+" is: "+subtraction; //printing subtraction
            case 3->"The multiplication of "+num1+" and "+num2+" is: "+multiplication; //printing multiplication
            case 4->"The division of "+num1+" and "+num2+" is: "+division; //printing division
            default->"Invalid choice!";
        }
        );
    }
    public int add(int num1,int num2){
        return num1+num2; //addition operation
    }
    public int sub(int num1,int num2){
        return num1-num2; //subtraction
    }
    public int mul(int num1,int num2){
        return num1*num2; //multiplication
    }
    public int div(int num1,int num2){
        return num1/num2; //division
    }
}