import java.util.Scanner;
 class frequency     
{    
     public static void main(String[] args) {   
        Scanner s = new Scanner(System.in);
          System.out.println("Enter the string");
         n = s.nextInt();
        int[] freq = new int[str.length()];    
        int i, j;       
        char string[] = str.toCharArray();    
            
        for(i = 0; i <str.length(); i++) {    
            freq[i] = 1;    
            for(j = i+1; j <str.length(); j++) {    
                if(string[i] == string[j]) {    
                    freq[i]++;        
                    string[j] = '0';    
                }    
            }    
        }        
        System.out.println("Characters and their corresponding frequencies");    
        for(i = 0; i <freq.length; i++) {    
            if(string[i] != ' ' && string[i] != '0')    
                System.out.println(string[i] + "-" + freq[i]);    
        }    
    }    
}
