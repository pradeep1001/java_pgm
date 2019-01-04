import java.util.Scanner;

public class answer2 {
public static void main(String[] args) {
  HourlyWorker h1=new HourlyWorker("Hourly Worker",30);
  SalariedWorker s1=new SalariedWorker("Salaried Worker",50);
  h1.computePay(h1);
  s1.computePay(s1);
 }
}

class Worker {
 String name;
 int salaryRate;
 Worker(){}
 Worker(String n,int s) {
  this.name=n;
  this.salaryRate=s;
 }
}

class HourlyWorker extends Worker { 
 public HourlyWorker(String s,int n) {
   super(s,n);
 }
 
 static void computePay(Worker a) {
  System.out.println("name: "+a.name);
  System.out.print("Enter hours worked:");
  Scanner input=new Scanner(System.in);
  int hourWorked=input.nextInt();
  if(hourWorked<40)
   System.out.println("Salary: "+(hourWorked*a.salaryRate));
  else {
   int sum=40*a.salaryRate;
   sum += 1.5 * (hourWorked-40) * a.salaryRate;
   System.out.println("Salary: "+sum);
  }
 }
}

class SalariedWorker extends Worker {
 public SalariedWorker(String s,int n) {
  super(s,n);
 }
 
 static void computePay(Worker b) {
  System.out.println("name: "+b.name);
  System.out.println("Salary: "+(40*b.salaryRate));
 }
}