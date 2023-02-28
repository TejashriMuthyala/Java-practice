class teamIndia extends msDhoni{
    public static void main(String args[]){
        teamIndia ti=new teamIndia();
        ti.trophies();
    }
    public void trophies(){
        System.out.println(super.trophies);
    }
}
class msDhoni{
        String trophies="ICC World cup";
}