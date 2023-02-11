import java.io.*;
import java.util.Scanner;
import java.util.*;
public class trial2{
    public static void main(String args[])
    {  
        try {
            int data;
            FileInputStream inputStream = new FileInputStream("new.txt");
            FileOutputStream outputStream= new FileOutputStream("output.txt");
             while((data = inputStream.read()) != -1) {
                outputStream.write(data);
            }
         inputStream.close();
         outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
