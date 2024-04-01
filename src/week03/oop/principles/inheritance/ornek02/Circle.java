package week03.oop.principles.inheritance.ornek02;

public class Circle extends Shape{
    double radius;

    Circle(String color,double radius){
//        this.color= color;
        super(color);
        this.radius = radius;
    }



    @Override
    void draw(){
        System.out.println("Drawing a circle");
    }

    @Override
    double calculateArea(){
//        return Math.PI*radius*radius;
        return Math.PI*Math.pow(radius,2);
    }
}
