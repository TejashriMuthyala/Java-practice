import java.util.Scanner;
class matrixsub{
    public static void main(String args[]){
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows=sc.nextInt();
        System.out.println("Enter number of cols");
        int cols=sc.nextInt();
        int arr[][]=new int[rows][cols];
        System.out.println("Enter array values");
        for(i=0;i<rows;i++)
        {
            for(j=0;j<cols;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter number of rows of second array");
        int row=sc.nextInt();
        System.out.println("Enter number of cols of second array");
        int col=sc.nextInt();
        int brr[][]=new int[row][col];
        System.out.println("Enter array values of second array"); 
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                brr[i][j]=sc.nextInt();
            }
        }
        System.out.println();
        for(i=0;i<rows;i++)
        {
            for(j=0;j<cols;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                System.out.print(brr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for(i=0;i<rows;i++)
        {
            for(j=0;j<cols;j++)
            {
                System.out.print(arr[i][j]-brr[i][j]+" ");
            }
            System.out.println();
        }        
    }   

}