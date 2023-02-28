class methovrd extends display{
    public static void main(String args[]){
        methovrd mv=new methovrd();
        mv.printDetails();
    }
    @Override
    public void printDetails(){
        System.out.println("This is methovrd class");
    }
}
class display{
    public void printDetails(){
        System.out.println("This is display class");
    }
}