package Abstractclasses;
import java.util.*;

abstract class Animal{
    private String Name;
    private int age;

    public Animal(String name, int age) {
        Name = name;
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    void makesound(){
        System.out.println("The sound "+Name+" makes is ");
    }
}
class Lion extends Animal{
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    void makesound() {
        super.makesound();
        System.out.println(" Roar ");
    }
}
class Elephant extends Animal{
    public Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    void makesound() {
        super.makesound();
        System.out.println(" trumpet");
    }
}
public class Animalhierarchy {
    public static void main(String[]args){
        Lion leo=new Lion("Simba",5);
        Elephant ele=new Elephant("Kumki",6);
        ele.makesound();
        leo.makesound();
    }

}

