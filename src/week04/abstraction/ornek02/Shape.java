package week04.abstraction.ornek02;

public abstract class Shape {

    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    public void draw(){
        System.out.println("Bu bir Shape");
    }

}
