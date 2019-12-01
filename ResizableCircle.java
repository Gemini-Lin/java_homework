public class ResizableCircle extends Circle6 implements Resizable
{
    ResizableCircle(double radius)
    {
        this.radius=radius;
    }
    public  void resize(int percent)
    {
        radius=radius*percent;
    }
    public static void main(String args[])
    {
        ResizableCircle R = new ResizableCircle(5.0);
        System.out.println("Perimeter="+R.getPerimeter());
        System.out.println("Area="+R.getArea());
        System.out.println("\nAfterResize----\n");
        R.resize(2);
        System.out.println("Perimeter="+R.getPerimeter());
        System.out.println("Area="+R.getArea());

    }
}

