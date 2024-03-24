package encapsulation;

class Student {
    private String name;
    private int ID;
    private int[] grades;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name, int ID, int[] grades) {
        this.name = name;
        this.ID = ID;
        this.grades = grades;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public double avgGrade() {
        double avg;
        double sum = 0;
        for(int i : grades) {
            if(i >= 0 && i <= 100) {
                sum += i;
            } else {
                System.out.println(i + " is not in the range of 0 to 100");
            }
        }
        avg = sum / grades.length;
        System.out.println("The average of " + name + " is " + avg);
        return avg;
    }
}

public class Main {
    public static void main(String[] args) {
        Student stud = new Student("Riya", 1001, new int[]{85, 89, 100, 34, 76});
        stud.avgGrade();
    }
}
