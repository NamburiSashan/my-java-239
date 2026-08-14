package task1;

class person{
String name;
int age;
void getperson(String name , int age){
    this.name = name;
    this.age = age;
}
}

class student extends person{
int rollno;
void getstudent(int rollno){
    this.rollno = rollno;
}
void show(){
    System.out.println("---student details---");
    System.out.println("name is:" + name);
    System.out.println("age is:" + age);
    System.out.println("rollno is:" + rollno);

}
}
class faculty extends person{
String subject;
void getfaculty(String subject){
    this.subject = subject;
}

void show(){
System.out.println("--- faculty details---");
System.out.println("name of faculty is:" + name);
System.out.println(" age of:" + age);
System.out.println("subject is:" + subject);
    }
}
public class Inheritance{
public static void main(String[] args) {
    student s= new student();
    s.getperson("REVANTH REDDY", 18);
    s.getstudent(221);
    faculty f= new faculty();
    f.getperson("SANTOSH", 33);
    f.getfaculty(" JAVA PROGRAMMING");
    s.show();
    f.show();
   }
}

