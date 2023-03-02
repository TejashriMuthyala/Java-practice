class perfume implements fog,upsolo{
    public static void main(String args[]){
        perfume per=new perfume();
        per.dynamic();
        per.madrid6();
    }
    @Override
    public void dynamic(){
        System.out.println("Fog Dynamic");
    }
    @Override
    public void madrid6(){
        System.out.println("US Polo Madrid 6");
    }
}
interface fog{
    void dynamic();
}
interface upsolo{
    void madrid6();
}