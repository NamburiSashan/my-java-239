package record;
import java.util.Scanner;

//Defining the Interface
interface Employeee {
 void calculateSalary();
 void displaySalaryDetails();
}

//Regular Employee class implementing Employee interface
class RegularEmployeee implements Employeee {
 private double basicPay = 25000;
 private double hra = 15000;
 private double ta = 5000;
 private double totalSalary;

 @Override
 public void calculateSalary() {
     totalSalary = basicPay + hra + ta;
 }

 @Override
 public void displaySalaryDetails() {
     calculateSalary();
     System.out.println("Salary Details:");
     System.out.printf("Basic Pay: %.0f HRA: %.0f T.A: %.0f Total Amount: %.0f%n", 
                       basicPay, hra, ta, totalSalary);
 }
}

//Contract Employee class implementing Employee interface
class ContractEmployeee implements Employeee {
 private double basicPay = 12000;
 private double ta = 3000;
 private double totalSalary;

 @Override
 public void calculateSalary() {
     totalSalary = basicPay + ta;
 }

 @Override
 public void displaySalaryDetails() {
     calculateSalary();
     System.out.println("Salary Details:");
     System.out.printf("Basic Pay: %.0f T.A: %.0f Total Amount: %.0f%n", 
                       basicPay, ta, totalSalary);
 }
}

//Main class to access implementations through interface references
public class PayrollSystem {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
     System.out.print("Enter Employee Id: ");
     String empId = scanner.nextLine().trim();

     // Interface reference variable
     Employeee emp = null;

     // Determine employee type based on ID prefix
     if (empId.toUpperCase().startsWith("R")) {
         emp = new RegularEmployeee(); // Accessing implementation via interface reference
     } else if (empId.toUpperCase().startsWith("C")) {
         emp = new ContractEmployeee(); // Accessing implementation via interface reference
     } else {
         System.out.println("Invalid Employee ID Type.");
         scanner.close();
         return;
     }

     // Display salary details using interface reference
     emp.displaySalaryDetails();

     scanner.close();
 }
}
