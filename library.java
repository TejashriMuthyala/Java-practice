import java.util.Scanner;
class library{
    public static void main(String args[])
    {
        bookShell bs=new  bookShell();
        bs.setBook(1234,"Tmmortals of Meluha","Amisha",150);
        bs.getBook();
        bookShell sb=new bookShell();
        sb.setBook(1235,"Chanakya's chant","Ashwin sanghi",200);
        sb.getBook();
    }
}
class bookShell{
    int bNum,bPrice;
    String bName, bAuthor;
    public void setBook(int bookId, String bookName, String bookAuthor, int bookPrice){
        bNum=bookId;
        bName=bookName;
        bAuthor=bookAuthor;
        bPrice=bookPrice;
    }
    public void getBook(){
        System.out.println(bNum+" is "+bName+", written by "+bAuthor+" and it's price is "+bPrice);
    }
}