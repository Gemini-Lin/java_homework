import java.security.PublicKey;

public class Staff extends Person {
    String school;
    double pay;
    Staff(String name, String address,String school,double pay)
    {
        super(name, address);
        this.school=school;
        this.pay=pay;
    }
    public String getSchool()
    {
        return school;
    }
    public void setSchool(String school)
    {
        this.school=school;
    }
    public double getPay()
    {
        return pay;
    }
    public void setPay(double pay)
    {
        this.pay=pay;
    }
    public String toString()
    {
        return ("Staff[Person[name="+name+",address="+address+"],school="+school+",pay="+pay+"]");
    }
    public static void main(String args[])
    {
        Staff S = new Staff("Gemini","GeminiPlanet","UESTC",9800);
        String str =S.toString();
        String name;
        name = S.getName();
        String address;
        S.setAddress("GeminiPlanet0609");
        address = S.getAddress();
        String school;
        S.setSchool("PKU");
        school = S.getSchool();
        double pay;
        S.setPay(4800);
        pay = S.getPay();
        System.out.println(str);
        System.out.println("Name="+name);
        System.out.println("Address="+address);
        System.out.println("School="+school);
        System.out.println("Pay="+pay);
    }
}
