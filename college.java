class college implements library{
    public static void main(String args[]){
        college cl=new college();
        cl.scifi();
        cl.fiction();
    }
    @Override
    public void scifi(){
        System.out.println("Scifi books");
    }
    public void fiction(){
        System.out.println("Fiction books");
    }
}
interface library{
    void scifi();
    void fiction();
}