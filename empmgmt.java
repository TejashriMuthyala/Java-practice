class empmgmt{
    int empid;
    String empName;
    address adr;
    empmgmt(int eid,String ename, address ad){
        empid=eid;
        empName=ename;
        adr=ad;
    }
    public static void main(String args[]){
        address a1=new address("Hyd","Telangana","India");
        address a2=new address("Mumbai","Maharastra","India");
        empmgmt e1=new empmgmt(123,"Tejas",a1);
        empmgmt e2=new empmgmt(124,"Chandra",a2);
        e1.display();
        e2.display();
    }
    public void display(){
        System.out.println(empid+" id belongs to "+empName+" who is from "+adr.city);
    }
}
class address{
    String city,state,country;
    address(String c, String st, String co)
    {
        city=c;
        state=st;
        country=co;
    }
}