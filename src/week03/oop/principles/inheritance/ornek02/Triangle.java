package week03.oop.principles.inheritance.ornek02;

public class Triangle extends Shape{

    double base;
    double height;

    public Triangle(String color,double base,double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    void draw() {
        System.out.println("Drawing a Triangle");
    }

    @Override
    double calculateArea() {
        return base*height/2;
    }
}
