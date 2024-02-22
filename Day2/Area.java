package Inheritance;
import java.util.*;
 class Shape {
     protected String shapeName;
     public double calcaulatearea(){
         return 0;
     }

     public Shape(String shapeName) {
         this.shapeName = shapeName;
     }
 }
 class square extends Shape{
     protected int length_side;

     public square(String shapeName, int length_side) {
         super(shapeName);
         this.length_side = length_side;
     }


     public double calculatearea(){
         System.out.println("the area is "+  length_side*length_side);
         return 0;
     }


 }
class rectangle extends Shape{
    protected int length;
    protected int breadth;

    public rectangle(String shapeName, int length, int breadth) {
        super(shapeName);
        this.length = length;
        this.breadth = breadth;
    }

    public double calculatearea(){
        System.out.println("The area is :"+length*breadth);
        return 0;
    }
}
class circle extends Shape{
    protected float radius;

    public circle(String shapeName, float radius) {
        super(shapeName);
        this.radius = radius;
    }

    public double calculatearea(double pi){
        System.out.println("The area is:"+pi*radius*radius);
        return 0;
    }
}
public class Area{
     public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the shape name");
         String shape=sc.next();
         Shape sh=new Shape(shape);
         System.out.println("Enter a number between 1 and 3\n"+
                 "1.Rectangle\n"+
                 "2.Square\n"+
                 "3.Circle\n");
         int choice_shape=sc.nextInt();
         switch(choice_shape){
             case 1:
                 System.out.println("Enter the length");
                 int len=sc.nextInt();
                 System.out.println("Enter the breadth");
                 int bre=sc.nextInt();
                 rectangle rec= new rectangle(shape,len,bre);
                 rec.calculatearea();
                 break;
             case 2:
                 System.out.println("Enter the side length");
                 int side_len=sc.nextInt();
                 square sq= new square(shape,side_len);
                 sq.calculatearea();
                 break;
             case 3:
                 System.out.println("Enter the radius");
                 int radius=sc.nextInt();
                 circle cr= new circle(shape,radius);
                 cr.calculatearea(3.14);
                 break;

         }


     }
}
