public class Course implements java.io.Serializable
{
    private String cname;
    private String cid;
    private int chour;
    Course(String cname,String cid,int chour)
    {
        this.cname=cname;
        this.chour=chour;
        this.cid=cid;
    }
    public String getCname()
    {
        return cname;
    }
    public String getCid()
    {
        return cid;
    }
    public int getChour()
    {
        return chour;
    }
    public void setCname(String cname)
    {
        this.cname=cname;
    }
    public void setCid(String cid)
    {
        this.cid=cid;
    }
    public void setChour(int chour)
    {
        this.chour=chour;
    }
    public void display()
    {
        System.out.println("CourseName="+cname);
        System.out.println("CourseId="+cid);
        System.out.println("CourseHour="+chour);
    }
    public static void main(String args[])
    {
        Course C = new Course("Java","01",48);
        C.display();
        String cname;
        C.setCname("C");
        cname=C.getCname();
        String cid;
        C.setCid("02");
        cid=C.getCid();
        int chour;
        C.setChour(64);
        chour=C.getChour();
        System.out.println();
        System.out.println("AfterModify----");
        System.out.println();
        C.display();
    }
}
