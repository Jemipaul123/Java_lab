import java.util.*;

abstract class Shape {
	int length, breadth, radius;

	Scanner input = new Scanner(System.in);

	abstract void printArea();

}//abstract class just contains the declarations and the method names



class Rectangle extends Shape {
	void printArea() //here only we are giving the definition of the abstract method mentioned in the abstract class
{
		
System.out.println("*** Finding the Area of Rectangle ***");
System.out.print("Enter length and breadth: ");
length = input.nextInt();
breadth = input.nextInt();
System.out.println("The area of Rectangle is: " + length * breadth);
	}
}

class Triangle extends Shape 
{
	void printArea()
 {
       System.out.println("\n*** Finding the Area of Triangle ***");
    System.out.print("Enter Base And Height: ");
    length = input.nextInt();
    breadth = input.nextInt();
 
System.out.println("The area of Rectangle is: " + (length * breadth) / 2);
  }
}

class Cricle extends Shape
 {
    void printArea() 
    {
	System.out.println("\n*** Finding the Area of Cricle ***");
	System.out.print("Enter Radius: ");
	radius = input.nextInt();

System.out.println("The area of Rectangle is: " + 3.14f * radius * radius);
    }
}

public class AbstractClassExample
 {
public static void main(String[] args)
 {
   Rectangle rec = new Rectangle();
   rec.printArea();// inorder to access the methods of the object we need to create ojects of the class

   Triangle tri = new Triangle();
   tri.printArea();
 		
   Cricle cri = new Cricle();
    cri.printArea();
}
}
