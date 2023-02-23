class employee{
    int empid;
    String empName;
    project pro;
    employee(int eid,String ename, project pj){
        empid=eid;
        empName=ename;
        pro=pj;
    }
    public static void main(String args[]){
        project p1=new project(01,"TechCrew","Frontend");
        project p2=new project(02,"Anonymous","Backend");
        employee e1=new employee(123,"Tejas",p1);
        employee e2=new employee(124,"Chandra",p2);
        e1.display();
        e2.display();
    }
    public void display(){
        System.out.println(empid+" id belongs to "+empName+" who is working on "+pro.projecttech);
    }
}
class project{
    int projectid;
    String projectname,projecttech;
    project(int pi, String pn, String pt)
    {
        projectid=pi;
        projectname=pn;
        projecttech=pt;
    }
}