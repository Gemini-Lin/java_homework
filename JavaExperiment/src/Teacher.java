public class Teacher extends Person
{
    private String tid;
    private String title;
    Teacher(String name, String sex, int age,String tid,String title)
    {
        super(name, sex, age);
        this.tid=tid;
        this.title=title;
    }
    public String getTid()
    {
        return tid;
    }
    public String getTitle()
    {
        return title;
    }
    public void setTid(String tid)
    {
        this.tid=tid;
    }
    public void setTitle(String title)
    {
        this.title=title;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Tid="+tid);
        System.out.println("Title="+title);
    }
    public static void main(String args[])
    {
        Teacher T = new Teacher("Gemini","male",18,"201801","AssociateProfessor");
        System.out.println("Teacher:");
        T.display();
        String name;
        T.setName("Gemini-Lin");
        name=T.getName();
        String sex;
        T.setSex("Hero");
        sex=T.getSex();
        int age;
        T.setAge(19);
        age=T.getAge();
        String tid;
        T.setTid("201901");
        tid=T.getTid();
        String title;
        T.setTitle("Professor");
        title=T.getTitle();
        System.out.println("");
        System.out.println("AfterModify-----");
        System.out.println("");
        System.out.println("Teacher:");
        System.out.println("Name="+name);
        System.out.println("Sex="+sex);
        System.out.println("Age="+age);
        System.out.println("Tid="+tid);
        System.out.println("Title="+title);
    }
}
