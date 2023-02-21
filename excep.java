import java.util.*;

class AgeException extends Exception{
    AgeException(String message)
    {
        super(message);
    }
}
public class exception{
public static void main(String args[]){


    Scanner sc = new Scanner(System.in);
    System.out.println("enter your age");
    int age=sc.nextInt();
    try{
        checkAge(age);
    }
catch(Exception e){
    System.out.println("You aren't eligible");
}
finally{
    sc.close();

}}
 static void checkAge(int age) throws AgeException{
    if(age<18)
    { throw new AgeException("You are not eligible");}
    
    else
    {
        System.out.println("you are signed up");
    }



 }
}
