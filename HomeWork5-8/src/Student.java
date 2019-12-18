public class Student extends Person {
    String program;
    int year;
    double fee;
    Student(String name, String address,String program,int year,double fee)
    {
        super(name, address);
        this.program=program;
        this.fee=fee;
        this.year=year;
    }
    public String getProgram()
    {
        return program;
    }
    public void setProgram(String program)
    {
        this.program=program;
    }
    public int getYear()
    {
        return year;
    }
    public void setYear(int year)
    {
        this.year=year;
    }
    public double getFee()
    {
        return fee;
    }
    public void setFee(double fee)
    {
        this.fee=fee;
    }
    public String toString()
    {
        return ("Student[Person[name="+name+",address="+address+"],program="+program+",year="+year+",fee="+fee+"]");
    }
    public static void main(String args[])
    {
        Student S = new Student("Gemini","GeminiPlanet","SearchGemini",2019,2000.0);
        String str;
        String name;
        String address;
        String program;
        int year;
        double fee;
        name=S.getName();
        address=S.getAddress();
        S.setAddress("GeminiPlanet0609");
        program=S.getProgram();
        S.setProgram("SearchGeminiPlanet");
        year=S.getYear();
        S.setYear(2020);
        fee=S.getFee();
        S.setFee(10000);
        str=S.toString();
        System.out.println(str);
        System.out.println("Name="+name);
        System.out.println("Address="+address);
        System.out.println("Program="+program);
        System.out.println("Year="+year);
        System.out.println("Fee="+fee);
    }
}
