class theater{
    public static void main(String args[])
    {
        movie fm=new movie();
        fm.addMovie(200,"Maze Runner: The Death trials","Wes Ball");
        fm.getMovie();
        movie mf=new movie();
        mf.addMovie(200,"Escape Room","Adam Robitel");
        mf.getMovie();
    }
}
class movie{
    int mTicket;
    String mName, mDirector;
    public void addMovie(int movieTicket, String movieName, String movieDirector){
        mName=movieName;
        mDirector=movieDirector;
        mTicket=movieTicket;
    }
    public void getMovie(){
        System.out.println("The movie "+mName+" is directed by "+mDirector+" and it's ticket price is "+mTicket);
    }
}