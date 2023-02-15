import java.util.Scanner;
class matrixmul{
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
                arr[i][j]=sc.nextInt(); //to assign values to first array
            }
        }
        System.out.println("Enter number of rows of second array");
        int row=sc.nextInt();
        System.out.println("Enter number of cols of second array");
        int col=sc.nextInt();
        int brr[][]=new int[row][col];
        System.out.println("Enter array values of second array");
        int crr[][]=new int[rows][cols];
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                brr[i][j]=sc.nextInt(); //to assign values to second array
            }
        }
        System.out.println();
        for(i=0;i<rows;i++)
        {
            for(j=0;j<cols;j++)
            {
                System.out.print("The first array is: "+arr[i][j]+" "); //to print first array
            }
            System.out.println();
        }
        System.out.println();
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                System.out.print("The second array is: "+brr[i][j]+" "); //to print second array
            }
            System.out.println();
        }
        System.out.println();
        for(i=0;i<rows;i++)
        {
            for(j=0;j<cols;j++)
            {
                for(int k=0;k<cols;k++)
                {
                    crr[i][j]+=arr[i][k]*brr[k][j];
                }
                System.out.print("The multiplication of arrays is: "+crr[i][j]+" ");//multiplication of matrix
            }
            System.out.println();
        }        
    }   

}