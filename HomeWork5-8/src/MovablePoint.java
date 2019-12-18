public  class MovablePoint implements Movable
{
    int x;
    int y;
    int xSpeed;
    int ySpeed;
    MovablePoint(int x,int y,int xSpeed,int ySpeed)
    {
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public String toString()
    {
        return ("X="+x+"    Y="+y+"    xSpeed="+xSpeed+"    ySpeed="+ySpeed);
    }
    public void moveUp()
    {
        y=y+ySpeed;
    }
    public void moveDown()
    {
        y=y-ySpeed;
    }
    public void moveLeft()
    {
        x=x-xSpeed;
    }
    public void moveRight()
    {
        x=x+xSpeed;
    }
    public static void main(String args[])
    {
        MovablePoint M =new MovablePoint(5,10,2,3);
        System.out.println(M.toString());
        M.moveDown();
       // M.moveLeft();
        M.moveRight();
        //M.moveUp();
        System.out.println("\nAfterModify----\n");
        System.out.println(M.toString());
    }
}
