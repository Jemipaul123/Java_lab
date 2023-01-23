import java.util.Scanner;
class frequency   
{  
     
     public static void main(String[] args) {  
          Scanner k = new Scanner(System.in);
        System.out.println("Enter the string");
        String str= k.nextLine();
        int[] freq = new int[str.length()];  //creating an integer array to store frequency
        int i, j;  
         
        char string[] = str.toCharArray();  // character array to store the characters
          
        for(i = 0; i <str.length(); i++) {  
            freq[i] = 1;  
            for(j = i+1; j <str.length(); j++) {  
                if(string[i] == string[j]) {  
                    freq[i]++;  
                      
                    //Set string[j] to 0 to avoid printing visited character  
                    string[j] = '0';  
                }  
            }  
        }  
          
        //Displays the each character and their corresponding frequency  
        System.out.println("Characters and their corresponding frequencies");  
        for(i = 0; i <freq.length; i++) {  
            if(string[i] != ' ' && string[i] != '0')  
                System.out.println(string[i] + "-" + freq[i]);  
        }  
    }  
}  
