
import java.io.*;


public class labfileread {
    public static void main(String args[]){
    try {
        FileReader reader = new FileReader("new.txt");
        FileWriter writer = new FileWriter("output.txt");

    // Reading the file character by character
    int character;
    while((character = reader.read()) != -1) {
        // Writing the character to the output file
        writer.write(character);
    }
    reader.close();
    writer.close();
        
    } catch (Exception e) {
        // TODO: handle exception
    }


    
}}
