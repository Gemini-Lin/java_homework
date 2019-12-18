class Rectangle{
    private float length;
    private float width;
    Rectangle(float length,float width)
    {
        this.length=length;
        this.width=width;
    }
    public float getLength()
    {
        return length;
    }
    public void setLength(float length)
    {
        this.length=length;
    }
    public float getWidth()
    {
        return width;
    }
    public void setWidth(float width)
    {
        this.width = width;
    }
    public double getArea()
    {
        return length*width;
    }
    public double getPerimeter()
    {
        return 2*(length+width);
    }
    public String toString() {
        return ("Rectangle[length="+length+",width="+width+"]");
    }
}
public class TestRectangle {
    public static void main(String args[])
    {
        Rectangle R =new Rectangle(2,1);
        float length;
        float width;
        double area;
        double peri;
        String str;
        length=R.getLength();
        width=R.getWidth();
        area=R.getArea();
        peri=R.getPerimeter();
        str=R.toString();
        System.out.println("length="+length);
        System.out.println("width="+width);
        System.out.println("area="+area);
        System.out.println("perimeter="+peri);
        System.out.println(str);
    }
}
