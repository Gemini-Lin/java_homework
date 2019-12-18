class Circle {
    static double radius;

    Circle() {
    }

    Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius()//求半径
    {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;//this代表的是成员变量
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return ("Circle[radius="+radius+"]");
    }
}

public class TestCircle{
    public static void main(String args[])
    {
        Circle C = new Circle();
        C.setRadius(2.0);
        double area;
        double radius1;
        double Cir;
        String Str;
        area=C.getArea();
        radius1=C.getRadius();
        Cir=C.getCircumference();
        Str=C.toString();
        System.out.println("radius="+radius1);
        System.out.println("Circumference="+Cir);
        System.out.println("area="+area);
        System.out.println("String="+ Str);
    }
}




