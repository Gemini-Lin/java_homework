public class Student extends Person {
    private String sid;
    private String major;
    Student(String name, String sex, int age,String sid,String major) {
        super(name, sex, age);
        this.sid=sid;
        this.major=major;
    }
    public String getSid()
    {
        return sid;
    }
    public String getMajor()
    {
        return major;
    }
    public void setSid(String sid)
    {
        this.sid=sid;
    }
    public void setMajor(String major)
    {
        this.major=major;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Sid="+sid);
        System.out.println("Major="+major);
    }
    public static void main(String args[])
    {
        Student S = new Student("Gemini","male",18,"2018091601001","SoftWare");
        System.out.println("Student:");
        S.display();
        String name;
        S.setName("Gemini-Lin");
        name=S.getName();
        String sex;
        S.setSex("Hero");
        sex=S.getSex();
        int age;
        S.setAge(19);
        age=S.getAge();
        String sid;
        S.setSid("2018091601004");
        sid=S.getSid();
        String major;
        S.setMajor("InternetSecurity");
        major=S.getMajor();
        System.out.println("");
        System.out.println("AfterModify-----");
        System.out.println("");
        System.out.println("Student:");
        System.out.println("Name="+name);
        System.out.println("Sex="+sex);
        System.out.println("Age="+age);
        System.out.println("Sid="+sid);
        System.out.println("Major="+major);
    }
}
