package Collections;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

class Employee{
    private String name;
    private Integer emp_ID;
    private SortedMap<Integer,String>mp;

    public Employee(String name, Integer emp_ID, SortedMap<Integer, String> mp) {
        this.name = name;
        this.emp_ID = emp_ID;
        this.mp = mp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEmp_ID() {
        return emp_ID;
    }

    public void setEmp_ID(Integer emp_ID) {
        this.emp_ID = emp_ID;
    }

    public SortedMap<Integer, String> getMp() {
        return mp;
    }

    public void setMp(SortedMap<Integer, String> mp) {
        this.mp = mp;
    }

    public void addemployee(){
        mp.put(1005,"Riya");
        mp.put(1002,"Sneha");
        mp.put(1003,"SUGA");
        mp.put(this.getEmp_ID(),this.getName());


    }
    public void removeemployee(int ID){
        mp.remove(ID);
    }

    public void display(){
        System.out.println(mp.entrySet());
    }
}

public class EmployeeDatabase {
    public static void main(String[]args){
        Employee emp=new Employee("Sofia",1001,new TreeMap<>());
        emp.addemployee();
        emp.removeemployee(1002);
        emp.display();
    }
}
