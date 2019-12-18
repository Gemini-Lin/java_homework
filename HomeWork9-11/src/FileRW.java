import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Date;

public class FileRW {
    public StringBuffer ReadFile(String file) throws IOException
    {
        File newFile = new File(file);
        BufferedReader reader = new BufferedReader(new FileReader(newFile));
        StringBuffer sb = new StringBuffer();
        String line = null;
        while ((line=reader.readLine())!=null)
        {
            sb.append(line);
        }
        reader.close();
        return sb;
    }
    public int Count(StringBuffer sb)
    {
        int CountChar = 0;
        CountChar +=sb.length();
        return CountChar;
    }
    public long CopyFile(String file) throws IOException {
        long time = new Date().getTime();
        int length=2097152;
        File f1= new File(file);
        File f2= new File("CopyFile.txt");
        FileInputStream in = new FileInputStream(f1);
        FileOutputStream out = new FileOutputStream(f2);
        FileChannel inC = in.getChannel();
        FileChannel outC= out.getChannel();
        ByteBuffer b = null;
        while (true)
        {
            if(inC.position()==inC.size())
            {
                inC.close();
                outC.close();
                return new Date().getTime()-time;
            }
            if (inC.size()-inC.position()<length)
            {
                length=(int)(inC.size()-inC.position());
            }
            else
                length=2097152;
            b=ByteBuffer.allocateDirect(length);
            inC.read(b);
            b.flip();
            outC.write(b);
            outC.force(false);
        }

    }
    public static void main(String args[]) throws IOException {
        FileRW f = new FileRW();
        StringBuffer sb;
        int Count;
        sb=f.ReadFile("D:\\CODES\\HomeWork9-11\\src\\FileTest.txt");
        Count=f.Count(sb);
        f.CopyFile("D:\\CODES\\HomeWork9-11\\src\\FileTest.txt");
        System.out.println("The number of characters in file is:"+Count);
        System.out.println("Successfully copy file in CopyFile.txt");
    }



}
