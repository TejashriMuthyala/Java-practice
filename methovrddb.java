class methovrd extends display{
    public static void main(String args[]){
        methovrd mv=new methovrd();
        mv.printDetails();
        mv.announce();
    }
    @Override
    public void printDetails(){
        super.printDetails();
        System.out.println("This is methovrd class");
    }
    public void announce(){
        System.out.println("Announcement of data bindings");
    }
}
class display{
    public void printDetails(){
        System.out.println("This is display class");
    }
}