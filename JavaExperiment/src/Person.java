public class Person  implements java.io.Serializable
{
    protected String name;
    protected String sex;
    protected int age;
    public String getName()
    {
        return name;
    }
    public String getSex()
    {
        return sex;
    }
    public int getAge()
    {
        return age;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setSex(String sex)
    {
        this.sex=sex;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    Person(String name,String sex,int age)
    {
        this.name=name;
        this.sex=sex;
        this.age=age;
    }
    public void display()
    {
        //System.out.println("Person:");
        System.out.println("Name="+name);
        System.out.println("Sex="+sex);
        System.out.println("Age="+age);
    }
    public static void main(String args[])
    {
        Person P = new Person("Gemini","male",18);
        System.out.println("Person:");
        P.display();
        String name;
        P.setName("Gemini-Lin");
        name=P.getName();
        String sex;
        P.setSex("Hero");
        sex=P.getSex();
        int age;
        P.setAge(19);
        age=P.getAge();
        System.out.println("");
        System.out.println("AfterModify-----");
        System.out.println("");
        System.out.println("Person:");
        System.out.println("Name="+name);
        System.out.println("Sex="+sex);
        System.out.println("Age="+age);
    }
}
