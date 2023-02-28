class methovrdsuper extends display{
    public static void main(String args[]){
        methovrdsuper mv=new methovrdsuper();
        mv.printDetails();
    }
    @Override
    public void printDetails(){
        super.printDetails();
        System.out.println("This is methovrd class");
    }
}
class display{
    public void printDetails(){
        System.out.println("This is display class");
    }
}