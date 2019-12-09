public class ElectiveCourse implements java.io.Serializable
{
    private String elid;
    private String sid;
    private String classid;
    ElectiveCourse(String elid,String sid,String classid)
    {
        this.elid=elid;
        this.classid=classid;
        this.sid=sid;
    }
    public String getElid()
    {
        return elid;
    }
    public String getSid()
    {
        return sid;
    }
    public String getClassid()
    {
        return classid;
    }
    public void setElid(String elid)
    {
        this.elid=elid;
    }
    public void setSid(String sid)
    {
        this.sid=sid;
    }
    public void setClassid(String classid)
    {
        this.classid=classid;
    }
    public void display()
    {
        System.out.println("ElId="+elid);
        System.out.println("SId="+sid);
        System.out.println("ClassId="+classid);
    }
    public static void main(String args[])
    {
        ElectiveCourse E = new ElectiveCourse("E01","S01","C01");
        E.display();
        System.out.println();
        System.out.println("AfterModify----");
        System.out.println();
        E.setClassid("C02");
        E.setElid("E02");
        E.setSid("S02");
        E.display();
    }
}
