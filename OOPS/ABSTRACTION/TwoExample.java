package OOPS.ABSTRACTION;

import java.util.*;
import java.lang.Math;
abstract class Shape{
String color;

    Shape(String color)
    {
        this.color=color;
    }

    //abstract methods
    abstract double getRadius();
    abstract String printallDetails();

    public String getColor(){
        return color;
    }

}

class Circle extends Shape
{

    double radius;
    Circle(String color,double radius)
    {
        super(color);
        this.radius = radius;
    }
    

    double getRadius()
    {
        return Math.PI * Math.pow(radius,2);

    }

    String printallDetails(){
        return "Circle color is"+super.getColor()+" and area is"+getRadius();
    }


}

class Rectangle extends Shape{

    int length;
    int breadth;
    Rectangle(String color,int length,int breadth)
    {
        super(color);
        this.length=length;
        this.breadth=breadth;


    }

    @Override
    double getRadius(){
        return length * breadth;
    }

    String printallDetails()
    {
        return "Circle color is"+super.getColor()+" and area is"+getRadius();

    }

}


public class TwoExample {
    public static void main(String [] args){

        Shape obj1 = new Circle("black",4);
        System.out.println(obj1.getRadius());
        System.out.println(obj1.printallDetails());

        Shape obj2 = new Rectangle("Yellow",4,6);
        System.out.println(obj2.getRadius());
        System.out.println(obj2.printallDetails()); 
    }


}
