// . Write a Java program to create a class called "Employee" with a name, job title, 
// and salary attributes, and methods to calculate and update salary.
//Implement ArrayList in it 

import java.util.ArrayList;
class Employee{
    String name;
    double salary;
    String jobTitle;
    public static ArrayList<Employee> empList = new ArrayList<Employee>();  // this is not part of code I am just exploring something
    public Employee(String name , double salary , String jobTitle){   //constructer of Employee class
        this.name = name;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }
    // getter and setter method
    public void setName(String name){
        this.name = name;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public void setJob(String jobTitle){
        this.jobTitle = jobTitle;
    }
    
    public String getName(){
        return name;
    }
    
    public String getjobTitle(){
        return jobTitle;
    }
    public double getSalary(){
        return salary;
    }
    
    public static void addEmployee(Employee emp){
        empList.add(emp);
    }
    
    public static void removeEmployee(Employee emp){
        empList.remove(emp);
    }
    
    public void UpdateSalary(double percent){      //update salary method
        this.salary = salary+(salary*percent)/100;
    }
    public void display(){
        System.out.println("Name : "+name);
        System.out.println("Salary : "+salary);
        System.out.println("Job Role : "+jobTitle);
        System.out.println(">>--------------------------------<<");
    }
    
}

public class Main{
    public static void main(String[] args){
        Employee e = new Employee("Akash" , 300000.0 ,"ML Developer");
        Employee e1 = new Employee("Dilhon Harper",28293666,"Porn Star");
        Employee e2 = new Employee("Ava Adams" , 99999999,"Porn Star");
        e.display();
        e1.display();
        e2.display();
    }
}
























