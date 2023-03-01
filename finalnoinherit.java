class finaluse{
    public static void main(String srgs[]){
        sbi sb=new sbi();
        sb.fixedDeposit();
    }
}
final class rbi{
    public void fixedDeposit(){
        System.out.println("Fixed deposit in rbi");
    }
}
class sbi extends rbi{
    public void fixedDeposit(){
        System.out.println("Fixed deposit in sbi");
    }
}