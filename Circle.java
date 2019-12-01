import java.awt.event.MouseAdapter;

public class Circle extends Shape
{
    double radius;
    Circle(){}
    Circle(double radius)
    {
        this.radius=radius;
    }
    Circle(double radius,String color,boolean filled)
    {
        this.radius=radius;
        this.color=color;
        this.filled=filled;
    }
    double getRadius()
    {
        return radius;
    }
    void setRadius(double radius)
    {
        this.radius=radius;
    }
    double getArea()
    {
        return Math.PI*radius*radius;
    }
    double getPerimeter()
    {
        return Math.PI*2*radius;
    }
    public String toString()
    {
        return ("Radius="+radius+"     Color="+color+"     Filled="+filled);
    }
    public static void main(String args[])
    {
        Circle C =new Circle(5.0,"Red",true);
        System.out.println(C.toString());
        C.setRadius(6.0);
        C.setColor("White");
        C.setFilled(false);
        System.out.println("\nAfterModify----\n");
        System.out.println(C.toString());
    }
}
