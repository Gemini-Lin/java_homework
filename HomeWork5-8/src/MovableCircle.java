public class MovableCircle extends MovablePoint
{
    int radius;
    MovablePoint center;
    MovableCircle(int x, int y, int xSpeed, int ySpeed,int radius) {
        super(x, y, xSpeed, ySpeed);
        this.radius=radius;
    }

    public String toString()
    {
        return ("X="+x+"    Y="+y+"    xSpeed="+xSpeed+"    ySpeed="+ySpeed+"    Radius="+radius);
    }
    public static void main(String args[])
    {
        MovableCircle M =new MovableCircle(5,10,2,3,2);
        System.out.println(M.toString());
        M.moveDown();
        // M.moveLeft();
        M.moveRight();
        //M.moveUp();
        System.out.println("\nAfterModify----\n");
        System.out.println(M.toString());
    }
}
