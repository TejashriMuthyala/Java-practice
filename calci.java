class calci{
    public static void main(String args[])
    {
        calci ops=new calci();
        ops.add(5,10); //method call with parameters
        ops.sub(10,5); //method call with parameters
    }
    public void add(int a,int b){
        System.out.println(a+b); //addition operation
    }
        public void sub(int a,int b){
        System.out.println(a-b); //subtraction
    }
}