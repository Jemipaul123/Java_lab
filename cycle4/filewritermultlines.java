//1. a file handling program using reader and writer
import java.io.*;
import java.util.*;
public class labfilereadwrite{
    public static void main (String args[])
    { try{
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of strings");
        int n = sc.nextInt();
        String[] array = new String[n];
        System.out.println("Enter the string to be written");
        for(int i=0; i<n; i++)
        {array[i] = sc.nextLine();
            FileWriter writer  =new FileWriter("new.txt", true);
        writer.write(i+"." +array[i]);
        writer.write("\n");
        writer.close(); }}
         catch (Exception e) {
            System.out.println("Exception e is caught");
        
 }
}}
