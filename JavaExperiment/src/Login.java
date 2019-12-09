import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Login extends JFrame
{
    //定义组件
    JFrame frame= new JFrame();
    JPanel jp1,jp2,jp3,jp4,jp5;
    JLabel jlb1,jlb2,jlb3,jlb4,jlb5;
    String ClassName;
    String Teacher;
    String ClassRoom;
    JButton jb1;
    public Login()
    {
        Panel p1,p2,p3,p4;
        JTextField Sid;
        Sid=new JTextField(10);
        //创建面板
        jp1= new JPanel();
        jp2= new JPanel();
        //创建标签
        jlb1= new JLabel("欢迎来到Gemini的课程管理系统");
        jlb2= new JLabel("请输入您的学号");
        //创建按钮
        jb1=new JButton("确定");

        //设置布局管理
        frame.setLayout(new GridLayout(5,1));

        //加入各个组件
        jp1.add(jlb1);
        //jp2.add(jlb2);
        //jp2.add(jb1);
        jp2.add(jlb2,JLabel.CENTER);
        jp2.add(Sid);
        jp2.add(jb1);

        //加入到JFrame
        frame.add(jp1);
        frame.add(jp2);


        //设置窗体
        frame.setTitle("课程管理系统");
        frame.setSize(400,200);
        //frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String str = Sid.getText();
                frame.setVisible(false);
                try {
                    new ShowDetail(str);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });


    }
    public static void main(String args[])
    {
        new Login();

    }

}



