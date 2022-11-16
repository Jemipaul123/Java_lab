import java.io.*;
import java.util.Scanner;

public class polyadd{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
    int sum,sum2;
System.out.println("enter the 1st coefficent ");
int coef1= sc.nextInt();
System.out.println("enter the 2nd coefficent ");
int coef2= sc.nextInt();
System.out.println("The first polynomial is " +coef1 +"x+"+coef2);

System.out.println("enter the 1st coefficent ");
int coeff1= sc.nextInt();
System.out.println("enter the 2nd coefficent ");
int coeff2= sc.nextInt();
System.out.println("The second polynomial is " +coeff1 +"x+"+coeff2);

sum= coef1+coeff1;
sum2= coef2+coeff2;
System.out.println("The sum is " +sum +"x+"+sum2);
    }
}

