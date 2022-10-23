import java.util.Scanner;

abstract class Shapes
{
 abstract void numberOfSides();
}

class Rectangle extends Shapes
{
 void numberOfSides()
 {
  System.out.println("Number of sides of Rectangle : 4");  
 }                  
}

class Triangle extends Shapes
{
 void numberOfSides()
 {
  System.out.println("Number of sides of Triangle : 3");
 }
}

class Hexagon extends Shapes
{
 void numberOfSides()
 {
  System.out.println("Number of sides of Hexagon : 6");
 }
}


class shapes
{
 public static void main(String a[])
 {
  Shapes ob1 = new Rectangle();
  Shapes ob2 = new Triangle();
  Shapes ob3 = new Hexagon();
  ob1.numberOfSides();
  ob2.numberOfSides();
  ob3.numberOfSides();
 } 
}
