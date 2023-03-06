import java.util.regex.*;
class regex1{
    public static void main(String args[]){
        String username="Tejas";
        //username can contain only alphabets and it must be more than 5 chars
        System.out.println(Pattern.matches("[a-zA-Z]{5,}",username));
    }
}