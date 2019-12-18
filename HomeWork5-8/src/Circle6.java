public class Circle6 implements GeometricObject
{
    double radius=1.0;
    Circle6(double radius)
    {
        this.radius=radius;
    }

    public Circle6() {
    }

    public double getPerimeter()
    {
        return 2*Math.PI*radius;
    }
    public double getArea()
    {
        return Math.PI*radius*radius;
    }
    public static void main(String args[])
    {
        Circle6 C = new Circle6(5);
        System.out.println("Perimeter="+C.getPerimeter());
        System.out.println("Area="+C.getArea());
    }
}
