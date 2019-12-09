public class Schedule implements java.io.Serializable
{
    private String classid;
    private String cid;
    private String tid;
    private String classroom;
    Schedule(String classid,String cid,String tid,String classroom)
    {
        this.classid=classid;
        this.cid=cid;
        this.tid=tid;
        this.classroom=classroom;
    }
    public String getClassid()
    {
        return classid;
    }
    public String getCid()
    {
        return cid;
    }
    public String getTid()
    {
        return tid;
    }
    public String getClassroom()
    {
        return classroom;
    }
    public void setClassid(String classid)
    {
        this.classid=classid;
    }
    public void setCid(String cid)
    {
        this.cid=cid;
    }
    public void setTid(String tid)
    {
        this.tid=tid;
    }
    public void setClassroom(String classroom)
    {
        this.classroom=classroom;
    }
    public void display()
    {
        System.out.println("ClassId="+classid);
        System.out.println("Cid="+cid);
        System.out.println("Tid="+tid);
        System.out.println("ClassRoom="+classroom);
    }
    public static void main(String args[])
    {
        Schedule S = new Schedule("01","C01","T01","A01");
        S.display();
        S.setCid("02");
        S.setClassid("C02");
        S.setTid("T02");
        S.setClassroom("A02");
        System.out.println();
        System.out.println("AfterModify----");
        System.out.println();
        S.display();
    }
}
