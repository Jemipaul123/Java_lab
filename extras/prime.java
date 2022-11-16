import java.util.Scanner;

public class prime {

 public static void main(String[] args) {
int count;
  Scanner sc= new Scanner(System.in);
  System.out.println("enter the max");
  int num =sc.nextInt();
System.out.println("The prime numbers btw 1 and "+num +" are");
  for (int i = 2; i <= num; i++) {
   count = 0;
   for (int j = 2; j <= i / 2; j++) {
    if (i % j == 0) {
     count++;
     break;
    }
   }
  

   if (count == 0) {

    System.out.println(i);
   }

  }
 }
}
