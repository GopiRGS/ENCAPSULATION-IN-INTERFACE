
interface Shape {
    double getArea(); 
}

class Rectangle implements Shape {
    private double len;
    private double wid;

    public Rectangle(double len, double wid) {
        this.len = len;
        this.wid = wid;
    }

    public double getArea() { 
        return len * wid; 
    }
}
class circle implements Shape{
    private double radius;
    public circle (double radius){
        this.radius = radius;
    }
    public double getArea(){
        return 3.14*radius*radius;
    }
}
class triangle implements Shape{
    private double bri;
    private double hei;
    public triangle(double bri,double hei){
        this.bri = bri;
        this.hei = hei;
    }
    public double getArea(){
        return 0.5*bri*hei;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2.5, 2.5); 
        System.out.println("Area of Rectangle: " + rectangle.getArea());
        Shape circle = new circle(2.5); 
        System.out.println("Area of circle: " + circle.getArea());
        Shape triangle = new triangle(2.5, 2.5); 
        System.out.println("Area of triangle: " + triangle.getArea());
    }
}
