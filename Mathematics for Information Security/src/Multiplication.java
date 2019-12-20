import java.util.Scanner;

public class Multiplication
{
    public String multiplication(int[]FN,int[]SN,int base)
    {
        int c = 0;
        int u = 0;
        int v = 0;
        int digit1=FN.length;
        int digit2=SN.length;
        int digit=0;
        if (digit1>=digit2)
        {
            digit=digit1;
        }
        else
        {
             digit=digit2;
        }
        int[] firstNumber = new int[digit];
        int[] secondNumber = new int[digit];
        if (digit1>=digit2)
        {
            for (int i=digit2;i<digit;i++)
            {
                secondNumber[i]=0;
            }
            for (int i=0;i<digit;i++)
            {
                firstNumber[i]=FN[i];
            }
            for (int i=0;i<digit2;i++)
            {
                secondNumber[i]=SN[i];
            }
        }
        else
        {
            for (int i=digit1;i<digit;i++)
            {
                firstNumber[i]=0;
            }
            for (int i=0;i<digit;i++)
            {
                secondNumber[i]=SN[i];
            }
            for (int i=0;i<digit1;i++)
            {
                firstNumber[i]=FN[i];
            }
        }
        int[] additionNumber = new int[digit1+digit2];
        for (int i=0;i<digit1+digit2;i++)
        {
            additionNumber[i]=0;
        }
        for (int i=0;i<=digit2-1;i++)
        {
            c=0;
            for (int j=0;j<=digit1-1;j++)
            {
                int uv = additionNumber[i+j]+firstNumber[j]*secondNumber[i]+c;
                 v = uv%base;
                 u = uv/base;
                additionNumber[i+j] = v;
                c = u;
            }
                additionNumber[i+digit1]=u;
        }
        StringBuffer str = new StringBuffer();
        for (int i=digit1+digit2-1;i>=0;i--)
        {
            str=str.append(additionNumber[i]);
        }
        String addition = str.toString();
        return addition;
    }
    public static  void main(String args[])
    {
        Multiplication M = new Multiplication();
        System.out.println("Please enter the first number:");
        Scanner FirstNumber = new Scanner(System.in);
        String FirstN = FirstNumber.nextLine();
        System.out.println("Please enter the second number:");
        Scanner SecondNumber = new Scanner(System.in);
        String SecondN = SecondNumber.nextLine();
        System.out.println("Please enter the base:");
        Scanner Base = new Scanner(System.in);
        int base = Base.nextInt();
        int digit1 = FirstN.length();
        int digit2 = SecondN.length();
        int[] firstNumber = new int[digit1];
        int[] firstNumber1 = new int[digit1];
        for (int i=0;i<digit1;i++)
        {
            firstNumber1[i]=Integer.parseInt(FirstN.substring(i,i+1));
        }
        for (int i=0,j=digit1-1;i<digit1;i++,j--)
        {
            firstNumber[i]=firstNumber1[j];
        }
        int[] secondNumber = new int[digit2];
        int[] secondNumber1 = new int[digit2];
        for (int i=0;i<digit2;i++)
        {
            secondNumber1[i]=Integer.parseInt(SecondN.substring(i,i+1));
        }
        for (int i=0,j=digit2-1;i<digit2;i++,j--)
        {
            secondNumber[i]=secondNumber1[j];
        }
        System.out.println("The multiplication number is:"+M.multiplication(firstNumber,secondNumber,base));
    }
}
