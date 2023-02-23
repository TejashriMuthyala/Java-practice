class methovrlo2{
    public static void main(String args[]){
        addition(2,3);
        addition(2,4,6);
        addition(1,3,5,7);
    }
    public static void addition(int ...a){
        int sum=0;
        for(int i:a)
        {
            sum+=i;
        }
        System.out.println(sum);
    }
}