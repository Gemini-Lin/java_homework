import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;
import java.io.IOException;

public class ShowDetail extends JFrame{
    String[] STR = new String[3];
    String[] Str = new String[3];
    String Sid;
    String ClassName;
    String Teacher;
    String ClassRoom;


    public ShowDetail(String str) throws IOException {
        Str[0]=str;
        STR=Myfile.main(Str);
        Sid=str;
        ClassName=STR[0];
        Teacher=STR[1];
        ClassRoom=STR[2];
         String[][] data = {{Sid,ClassName,Teacher,ClassName}};
         String[] dataTitle = {"Sid","ClassName","Teacher","ClassRoom"};
         JTable jtable = new JTable(data, dataTitle);
        DefaultTableCellRenderer r=new DefaultTableCellRenderer();
        r.setHorizontalAlignment(JLabel.CENTER);
        jtable.setDefaultRenderer(Object.class,r);

         JScrollPane jscrollpane = new JScrollPane(jtable);
        setTitle("查询结果");
        setBounds(300,400,400,150);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(jscrollpane,BorderLayout.CENTER);
    }

}