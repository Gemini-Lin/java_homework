public class Person{
    String name;
    String address;
    Person(String name,String address)
    {
        this.name=name;
        this.address=address;
    }
    public String getName()
    {
        return name;
    }
    public String getAddress()
    {
        return address;
    }
    public void setAddress(String address)
    {
        this.address=address;
    }
    public String toString()
    {
        return ("Person[name="+name+",address="+address+"]");
    }
    public static void main(String args[])
    {
        Person P = new Person("Gemini","GeminiPlanet");
        String name;
        String address;
        String str;
        name = P.getName();
        address = P.getAddress();
        P.setAddress("GeminiPlanet0609");
        str = P.toString();
        System.out.println(str);
        System.out.println("Name="+name);
        System.out.println("Address="+address);
    }
}
