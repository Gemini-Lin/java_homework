import java.util.Scanner;
class User{
    String UserName;
    String PassWord;
    public void setUser(String UserName,String PassWord)
    {
        this.UserName=UserName;
        this.PassWord=PassWord;
    }
}
public class LoginDemo {
    public static void main(String args[])
    {
        int length = 1;
        User[] U = new User[length];
        int j = 0;
        U[0] = new User();
        U[0].setUser("Gemini","06094619");
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入你的用户名：");
        String UserName=sc.nextLine();
        System.out.println("请输入你的密码：");
        String PassWord=sc.nextLine();
        for (int i=0; i<1;i++)
        {
            if(UserName.equals(U[i].UserName))
            {
                 j = i;
            }
        }
        if (PassWord.equals(U[j].PassWord))
        {
            System.out.println("登录成功！");
        }
        else
        {
            System.out.println("登录失败，请重新输入！");
        }
    }
}
