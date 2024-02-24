package Abstractclasses;
import java.util.*;

abstract class Employee{
    private int id;
    private double monthlysalary;

    public Employee(int id, double monthlysalary) {
        this.id = id;
        this.monthlysalary = monthlysalary;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMonthlysalary() {
        return monthlysalary;
    }

    public void setMonthlysalary(double monthlysalary) {
        this.monthlysalary = monthlysalary;
    }

    abstract double calculatannualsalary();
}
class Manager extends Employee{

    public Manager(int id, double monthlysalary) {
        super(id, monthlysalary);

    }

    @Override
    double calculatannualsalary() {
        double annual_salary=this.getMonthlysalary()*12;
        System.out.println("The annual salary of Developer is :"+annual_salary);
        return annual_salary;
    }
}

class Developer extends Employee{

    public Developer(int id, double monthlysalary) {
        super(id, monthlysalary);
    }

    @Override
    double calculatannualsalary() {
        double annual_salary=this.getMonthlysalary()*12;
        System.out.println("The annual salary of Developer is :"+annual_salary);
        return annual_salary;
    }
}
public class employeemanagement {
    public static void main(String[]args){
        Developer dev=new Developer(12345,50000.45);
        Manager mgr=new Manager(1002,100000);

        dev.calculatannualsalary();
        mgr.calculatannualsalary();

    }
}

