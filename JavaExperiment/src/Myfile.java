import java.awt.*;
import java.io.*;
import java.util.Scanner;

public class Myfile
{
    File opfile ;
    Myfile(File opfile)
    {
        this.opfile=opfile;
    }
    public String getfile()
    {
        return String.valueOf(opfile);
    }
    public String getPath()
    {
        return opfile.getAbsolutePath();
    }
    public void myfile() throws IOException
    {
        Desktop desktop = Desktop.getDesktop();
        if(opfile.exists())
        {
            desktop.open(opfile);
        }
        else
        {
            opfile.createNewFile();
            desktop.open(opfile);
        }
    }
    //读取文件到对象数组中
   public Person[] ReadfilePerson() throws IOException
    {
        Person[] Per= new Person[5];
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(opfile));
            Per = (Person[]) ois.readObject();
            ois.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return Per;
    }

    public Student[] ReadfileStudent() throws IOException
    {
        Student[] Stu = new Student[5];
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(opfile));
            Stu = (Student[])  ois.readObject();
            ois.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return Stu;
    }

    public Teacher[] ReadfileTeacher() throws IOException
    {
        Teacher[] Tea = new Teacher[5];
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(opfile));
            Tea = (Teacher[]) ois.readObject();
            ois.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return Tea;
    }

    public Course[] ReadfileCourse() throws IOException
    {
        Course[] Cou = new Course[5];
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(opfile));
            Cou = (Course[]) ois.readObject();
            ois.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return Cou;
    }
    public Schedule[] ReadfileSchedule() throws IOException
    {
        Schedule[] Sch = new Schedule[5];
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(opfile));
            Sch = (Schedule[]) ois.readObject();
            ois.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return Sch;
    }
    public ElectiveCourse[] ReadfileElectiveCourse() throws IOException
    {
        ElectiveCourse[] Ele = new ElectiveCourse[5];
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(opfile));
            Ele = (ElectiveCourse[]) ois.readObject();
            ois.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return Ele;
    }

    public void Writeflie(Person[] Per) throws IOException {
       try {
           ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(opfile));
           oos.writeObject(Per);
           oos.close();
       }catch (IOException e)
       {
           e.printStackTrace();
       }
    }

    public void Writeflie(Student[] Stu) throws IOException {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(opfile));
            oos.writeObject(Stu);
            oos.close();
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void Writeflie(Teacher[] Tea) throws IOException {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(opfile));
            oos.writeObject(Tea);
            oos.close();
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void Writeflie(Course[] Cou) throws IOException {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(opfile));
            oos.writeObject(Cou);
            oos.close();
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void Writeflie(Schedule[] Sch) throws IOException {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(opfile));
            oos.writeObject(Sch);
            oos.close();
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void Writeflie(ElectiveCourse[] Ele) throws IOException {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(opfile));
            oos.writeObject(Ele);
            oos.close();
        }catch (IOException e)
        {
            e.printStackTrace();
        }

    }


    public static String[] main(String[] args) throws IOException {
        Myfile M = new Myfile(new File("Test1.txt"));
        System.out.println(M.getfile());
        //M.myfile();
        System.out.println(M.getPath());
        Person[] Per1 = new Person[5];
        Per1[0] = new Person("Lin","male",18);
        Per1[1] = new Person("Wang","male",18);
        Per1[2] = new Person("Liu","female",18);
        Per1[3] = new Person("You","male",19);
        Per1[4] = new Person("Yi","female",19);
        Person[] Per2 = new Person[5];
        M.Writeflie(Per1);
        Per2 = M.ReadfilePerson();
       /* System.out.println("Person:");
        for (int i=0 ;i<5;i++)
        {
            System.out.println("Name="+Per2[i].getName()+"  Sex="+Per2[i].getSex()+"    Age="+Per2[i].getAge());
        }*/
        Student[] Stu1 = new Student[5];
        Stu1[0] = new Student("Lin","male",18,"S01","SoftWare1");
        Stu1[1] = new Student("Wang","male",18,"S02","SoftWare2");
        Stu1[2] = new Student("Liu","female",18,"S03","SoftWare3");
        Stu1[3] = new Student("You","male",19,"S04","SoftWare4");
        Stu1[4] = new Student("Yi","female",19,"S05","SoftWare5");
        Student[] Stu2 = new Student[5];
        M.Writeflie(Stu1);
        Stu2=M.ReadfileStudent();
        /*System.out.println("Student:");
        for (int i=0 ;i<5;i++)
        {
            System.out.println("Name="+Stu2[i].getName()+"  Sex="+Stu2[i].getSex()+"    Age="+Stu2[i].getAge()+"    Sid="+Stu2[i].getSid()+"    Major="+Stu2[i].getMajor());
        }*/
        Teacher[] Tea1 = new Teacher[5];
        Tea1[0] = new Teacher("Chen","male",40,"T01","Professor1");
        Tea1[1] = new Teacher("Wu","female",42,"T02","Professor2");
        Tea1[2] = new Teacher("Li","female",48,"T03","Professor3");
        Tea1[3] = new Teacher("Yang","male",43,"T04","Professor4");
        Tea1[4] = new Teacher("Zhang","male",44,"T05","Professor5");
        M.Writeflie(Tea1);
        Teacher[] Tea2 = new  Teacher[5];
        Tea2=M.ReadfileTeacher();
        /*System.out.println("Teacher:");
        for (int i=0 ;i<5;i++)
        {
            System.out.println("Name="+Tea2[i].getName()+"  Sex="+Tea2[i].getSex()+"    Age="+Tea2[i].getAge()+"    Tid="+Tea2[i].getTid()+"    Title="+Tea2[i].getTitle());
        }*/
        Course[] Cou1 =new Course[5];
        Cou1[0] = new Course("ClassName1","C01" ,32);
        Cou1[1] = new Course("ClassName2","C02" ,16);
        Cou1[2] = new Course("ClassName3","C03" ,48);
        Cou1[3] = new Course("ClassName4","C04" ,64);
        Cou1[4] = new Course("ClassName5","C05" ,48);
        M.Writeflie(Cou1);
        Course[] Cou2 = new Course[5];
        Cou2=M.ReadfileCourse();
        /*System.out.println("Course:");
        for (int i=0 ;i<5;i++)
        {
            System.out.println("CName="+Cou2[i].getCname()+"  Cid="+Cou2[i].getCid()+"    CHour="+Cou2[i].getChour());
        }*/
        Schedule[] Sch1 = new Schedule[5];
        Sch1[0] = new Schedule("ClassId1","C01","T01","A101");
        Sch1[1] = new Schedule("ClassId2","C02","T02","A102");
        Sch1[2] = new Schedule("ClassId3","C03","T03","A103");
        Sch1[3] = new Schedule("ClassId4","C04","T04","A104");
        Sch1[4] = new Schedule("ClassId5","C05","T05","A105");
        M.Writeflie(Sch1);
        Schedule[] Sch2 = new Schedule[5];
        Sch2=M.ReadfileSchedule();
        /*System.out.println("Schedule:");
        for (int i=0 ;i<5;i++)
        {
            System.out.println("ClassId="+Sch2[i].getClassid()+"  Cid="+Sch2[i].getCid()+"    Tid="+Sch2[i].getTid()+"  ClassRoom="+Sch2[i].getClassroom());
        }*/
        ElectiveCourse[] Ele1 = new ElectiveCourse[5];
        Ele1[0] = new ElectiveCourse("E01","S01","ClassId1");
        Ele1[1] = new ElectiveCourse("E02","S02","ClassId2");
        Ele1[2] = new ElectiveCourse("E03","S03","ClassId3");
        Ele1[3] = new ElectiveCourse("E04","S04","ClassId4");
        Ele1[4] = new ElectiveCourse("E05","S05","ClassId5");
        M.Writeflie(Ele1);
        ElectiveCourse[] Ele2 = new ElectiveCourse[5];
        Ele2=M.ReadfileElectiveCourse();
       /* System.out.println("ElectiveCourse:");
        for (int i=0 ;i<5;i++)
        {
            System.out.println("Eid="+Ele2[i].getElid()+"  Sid="+Ele2[i].getSid()+"    Classid="+Ele2[i].getClassid());
        }*/
        //System.out.println("请输入您的学号：");
        //Scanner input = new Scanner(System.in);
        //String str = input.nextLine();
        String str = args[0];
        String ClassName = null;
        String TeacherName = null;
        String ClassRoom= null;
        int p=-1;
        for (int i=0;i<5;i++)
        {
            if(str.equals(Ele2[i].getSid()))
            {
                p=i;
                for (int j=0;j<5;j++)
                {
                    if (Ele2[i].getClassid().equals(Sch2[j].getClassid()))
                    {
                        ClassRoom=Sch2[j].getClassroom();
                        for (int k=0;k<5;k++)
                        {
                            if (Cou2[k].getCid().equals(Sch2[j].getCid()))
                            {
                                ClassName=Cou2[k].getCname();
                            }
                        }
                        for (int m=0;m<5;m++)
                        {
                            if(Tea2[m].getTid().equals(Sch2[j].getTid()))
                            {
                                TeacherName=Tea2[m].getName();
                            }
                        }
                    }
                }
            }
        }
       // System.out.println("YourClassName="+ClassName+"     Teacher="+TeacherName+"     ClassRoom="+ClassName);
        if(p==-1)
        {
            //System.out.println("Warning:Wrong Sid!Please try again!");
        }
        String[] Str = new String[3];
        Str[0] = ClassName;
        Str[1] = TeacherName;
        Str[2] = ClassRoom;
        return Str;

     }


}
