public class Square extends Rectangle
{
    double side;
    Square(){}
    Square(double side)
    {
        this.side=side;
    }
    Square(double side,String color,boolean filled)
    {
        this.side=side;
        this.color=color;
        this.filled=filled;
    }
    double getSide()
    {
        return side;
    }
    void setSide(double side)
    {
        this.side=side;
    }
    void setWidth(double side)
    {
        width=side;
    }
    void  setLength(double side)
    {
        length=side;
    }
     public String toString()
    {
        return ("Side="+side+"    Color="+color+"    Filled="+filled+"    Width="+width+"    Length="+length);
    }
    public static void  main(String args[])
    {
        Square S = new Square(100,"Orange",false);
        System.out.println(S.toString());
        S.setSide(200);
        S.setLength(200);
        S.setWidth(200);
        S.setColor("Blue");
        S.setFilled(true);
        System.out.println("\nAfterModify----\n");
        System.out.println(S.toString());
    }

}
