public class Rectangle extends Shape
{
    double width;
    double length;
    Rectangle(){}
    Rectangle(double width,double length,String color,boolean filled)
    {
        this.width=width;
        this.length=length;
        this.color=color;
        this.filled=filled;
    }
    Rectangle(double width,double length)
    {
        this.width=width;
        this.length=length;
    }
    double getWidth()
    {
        return width;
    }
    double getLength()
    {
        return  length;
    }
    void setWidth(double width)
    {
        this.width=width;
    }
    void setLength(double length)
    {
        this.length=length;
    }
    double getArea()
    {
        return length*width;
    }
    double getPerimeter()
    {
        return  2*(length+width);
    }
    public String toString()
    {
        return ("Width="+width+"    Length="+length+"    Color="+color+"    Filled="+filled);
    }
    public static  void  main(String args[])
    {
        Rectangle R = new Rectangle(50,100,"Red",false);
        System.out.println(R.toString());
        R.setLength(500);
        R.setWidth(100);
        R.setColor("Black");
        R.setFilled(true);
        System.out.println("\nAfterModify----\n");
        System.out.println(R.toString());

    }
}
