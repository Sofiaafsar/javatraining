package Collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student{
    private String Name;
    private Long Id;
    private double GPA;

    public Student(String name, Long id, double GPA) {
        Name = name;
        Id = id;
        this.GPA = GPA;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", Id=" + Id +
                ", GPA=" + GPA +
                '}';
    }
}
 class Sort {

    List<Student> list = new ArrayList<>();

    public void addstud(Student student) {
        list.add(student);
    }

    public void sortstudent() {

        list.sort(Comparator.comparing(Student::getGPA));
        System.out.println(list);

    }
}

public class SortingStudents
{
    public static void main(String[]args){
        Sort sorting=new Sort();

        Student student=new Student("Sofia", 1001L,9.0);
        Student student1=new Student("Riya", 1002L,8.0);
        Student student2=new Student("Asmi", 1003L,8.5);

      sorting.addstud(student);
      sorting.addstud(student1);
      sorting.addstud(student2);

      sorting.sortstudent();
    }


}
