import java.util.Scanner;
class exception3{
    public static void main(String args[])
    {
        Scanner bs=new Scanner(System.in);
        String username; int age; 
        System.out.println("\t\t----------Online voting system-----------");
        System.out.println("Enter full name");
        username=bs.nextLine();
        System.out.println("Enter age");
        age=bs.nextInt();
        try{
            if(checkAge(age)){
                System.out.println("Eligible to vote");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Thank you for your time");
        }
    }
    public static boolean checkAge(int age) throws ArithmeticException
    {
        if(age>18)
        {
            return true;
        }
        else{
            throw new ArithmeticException("Error: User age is not enough to vote");
        }
    }
}