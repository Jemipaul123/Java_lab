import java.util.Scanner;
class matrixmat{
    public static void main(String args[])
    {
        int row1,col1,row2,col2;
        int i,j,k;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of row of first matrix");
        row1= s.nextInt();
        System.out.println("Enter the size of coloumn of first matrix");
        col1= s.nextInt();
        System.out.println("Enter the size of row of second matrix");
        row2= s.nextInt();
        System.out.println("Enter the size of coloumn of second matrix");
        col2= s.nextInt();
        if(col1!=row2)
        System.out.println(" Matrix multiplication not possible ");
        int a[][]= new int[row1][col1];
        int b[][]= new int[row2][col2];
        int c[][]= new int[row1][col2];
        System.out.println("/nEnter the elements of matrix 1");
        for(i=0;i<row1;i++){
            for(j=0;j<col1;j++){
                a[i][j]=s.nextInt();
            }
        }
                
        System.out.println("/nEnter the elements of matrix 2");
        for(i=0;i<row2;i++){
            for(j=0;j<col2;j++){
                b[i][j]=s.nextInt();
            }
        }

        for(i=0;i<row1;i++){
            for(j=0;j<col2;j++){
                c[i][j]=0;
                for(k=0;k<row1;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
                System.out.print( c[i][j] + "  " );
            }
            System.out.println();
        }

    }
}
