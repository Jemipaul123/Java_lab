import java.io.*;


public class charstream {
    public static void main(String args[]){
    try {
        FileReader reader = new FileReader("new.txt");
        FileWriter writer = new FileWriter("odd.txt");
        FileWriter writer1 = new FileWriter("even.txt");

    // Reading the file character by character
    int character;
    
    while((character = reader.read()) != -1) {
       
       if(character%2==0){
        writer1.write(character);
       }
       else
       
        // Writing the character to the output file
        writer.write(character);
    }
    reader.close();
    writer.close();
    writer1.close();
        
    } catch (Exception e) {
        // TODO: handle exception
    }


    
}}
