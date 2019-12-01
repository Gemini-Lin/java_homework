abstract class Shape {
    String color;
    boolean filled;
    Shape(){}
    Shape(String color,boolean filled)
    {
        this.color=color;
        this.filled=filled;
    }
    String getColor()
    {
        return color;
    }
    void setColor(String color)
    {
        this.color=color;
    }
    boolean isFilled()
    {
        return filled;
    }
    void setFilled(boolean filled)
    {
        this.filled=filled;
    }
    abstract double getArea();
    abstract double getPerimeter();
    public abstract String toString();
}
