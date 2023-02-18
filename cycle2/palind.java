import java.io.*;
import java.util.*;

public class pal{

    public static void main(String args[]){
    String str2 ="";
        Scanner sc = new Scanner(System.in);
    System.out.println("enter the string");
    String str= sc.nextLine();
    
    int n= str.length();
    int i;
    for(i=n-1;i>=0;i--)
    {
        str2 = str2 + str.charAt(i);
    }
   if(str.equals(str2))
   {
    System.out.println("Palindrome");}
    else
    {
        System.out.println("not palindrome");
    }
   }
}
