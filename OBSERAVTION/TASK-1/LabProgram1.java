package example;

import java.util.Scanner;
class Student{
    String name;
    int rollno;
    int marks1,marks2,marks3;
    int total;
    double percentage;
    Scanner sc= new Scanner(System.in);
    void details() {
        System.out.println("---student detalis---");
        System.out.println("enter student name :");
        System.out.println("enter roll no:");
        System.out.println("ENTER MARKS1");
        System.out.println("ENTER MARKS 2");
        System.out.println("ENTER MARKS 3");
        System.out.println("Total marks:");
        System.out.println("Percentage:");
         name = sc.nextLine();
         rollno=sc.nextInt();
         marks1=sc.nextInt();
         marks2=sc.nextInt();
         marks3=sc.nextInt();
         total=sc.nextInt();
         percentage=sc.nextDouble();
        
    }
void sum() {
    total=marks1+marks2+marks3;
    percentage=total/3.0;
    System.out.println("percentage is:");
    
}
void display() {
    System.out.println("name is:"+ name);
    System.out.println("roll no is :"+ rollno);
    System.out.println("marks1 is:"+ marks1);
    System.out.println("marks2 is:"+ marks2);
    System.out.println("marks3 is:"+ marks3);
    System.out.println("total is :"+total);
    System.out.println("percentage is:"+ percentage);
    
}

public class LabProgram1 {
public static void main(String[] args) {
 Scanner sc =new Scanner(System.in);
 Student st = new Student();
 int choice;
 do{
     System.out.println("--- student utuility program----");
     System.out.println("1.enter student details ");
     System.out.println("2.calc total and percentage");
     System.out.println("3.show result");
     System.out.println("4.exit");
     System.out.println("enter your choice");
 choice = sc.nextInt();

 switch(choice){

 case 1:
     st.details();
     break;
 case 2:
     st.sum();
     break;
 case 3:
     st.display();
     break;
  case 4:
     System.out.println("exited ");    
     break;
  default :
  System.out.println("invalid choice");          
 }
 }

 while (choice != 4) ;

 sc.close();        
     }
 }
}


