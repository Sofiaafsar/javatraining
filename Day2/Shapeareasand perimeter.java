package Abstractclasses;

abstract class Shape {
    protected String name;
    protected String color;

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    abstract double area(double radius);

    abstract double perimeter(double radius);
}
class circle extends Shape{
    public circle(String name, String color) {
        super(name, color);
    }

    @Override
    double area(double radius) {
        double area =3.14*radius*radius;
        System.out.println("The calculated area is :"+area);
        return 0;
    }



    @Override
    double perimeter(double radius) {
    double perimeter=2*3.14*radius;
    System.out.println("the calculated Perimeter is "+perimeter);
    return 0;
    }
}
class square extends Shape{
    public square(String name, String color) {
        super(name, color);
    }

    @Override
    double area(double side) {
        double area =side*side;
        System.out.println("The calculated area is :"+area);
        return 0;
    }



    @Override
    double perimeter(double side) {
        double perimeter=4*side;
        System.out.println("The calculated perimeter is "+perimeter);
        return 0;
    }
}
public class draw{
    public static void main(String[]args){
        circle cir=new circle("Circle","Red");
        cir.area(4);
        square sq=new square("Square","Blue");
        sq.perimeter(4);

    }
}
