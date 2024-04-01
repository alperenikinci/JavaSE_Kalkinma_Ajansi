package week04.abstraction.ornek02;

public class Rectangle extends Shape {

    private double width;
    private double height;

    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width*height;
    }

    @Override
    public double calculatePerimeter() {
        return width*2+height*2;
    }

//    @Override
//    public double calculateArea(){
//       return 0.0;
//    }

//    @Override
//    public double calculateArea() {
//        return 0;
//    } // alt + insert -> implement methods
}
