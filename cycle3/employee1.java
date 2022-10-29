import java.io.*;
import java.util.*;
import java.util.Scanner;

class Employee
{
 String name;
 int age;
 long phoneno;
 String address;
 long salary;
 
 void printsalary()
 {
  System.out.println("Salary : "+salary);
 }
}

class Officer extends Employee
{
 String specialization;
 
}
class Manager extends Employee
{
	
	String department;
}


class employeemain
{
 public static void main(String arg[])
 {
  Scanner sc = new Scanner(System.in);
  
  Officer off = new Officer(); //object creation
  System.out.print("Enter the Details of Officer\n");   //Input details of Officer
  System.out.print("Name : ");
  off.name = sc.nextLine();
  System.out.println("Specialization : ");
  off.specialization = sc.nextLine();
  System.out.print("Age : ");
  off.age = sc.nextInt();
  System.out.print("Phone Number : ");
  off.phoneno = sc.nextLong(); sc.nextLine();
  System.out.print("Address : ");
  off.address = sc.nextLine();
  System.out.print("Salary : ");
  off.salary = sc.nextLong();  
  
  System.out.println("\nDetails Of Officer");           //Print details
  System.out.println("Name : "+off.name);
  System.out.println("Specialization : "+off.specialization);
  System.out.println("Age : "+off.age);
  System.out.println("Phone Number : "+off.phoneno);
  System.out.println("Address : "+off.address);
  System.out.println("Salary : "+off.salary);
  System.out.println("---------------------------------------------------------------------------------------\n\n");


 Manager man = new Manager();
 
 System.out.print("Enter the Details of Manager\n");   //Input details of Manager
  
  System.out.print("Name : ");
  man.name = sc.nextLine();
  System.out.println("Department : ");
  man.department = sc.nextLine();
  System.out.print("Age : ");
  man.age = sc.nextInt();
  System.out.print("Phone Number : ");
  man.phoneno = sc.nextLong(); sc.nextLine();
  System.out.print("Address : ");
  man.address = sc.nextLine();
  System.out.print("Salary : ");
  man.salary = sc.nextLong();
  
  System.out.println("\nDetails Of Manager");           //Print details
  System.out.println("Name : "+man.name);
  System.out.println("Department : "+man.department);
  System.out.println("Age : "+man.age);
  System.out.println("Phone Number : "+man.phoneno);
  System.out.println("Address : "+man.address);
  System.out.println("Salary : "+man.salary);
  }
 }
