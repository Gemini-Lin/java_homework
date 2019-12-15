import java.util.Scanner;

public class Subtraction
{
    public String subtraction(int[] FN,int[] SN,int base)
    {
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
        int c = 0;
        int[] additionNumber = new int[digit];
        for (int i=0;i<digit;i++)
        {
            if ((firstNumber[i]-secondNumber[i]+c)>=0)
            {
                additionNumber[i]=firstNumber[i]-secondNumber[i]+c;
                c=0;
            }
            else
            {
                additionNumber[i]=firstNumber[i]-secondNumber[i]+c+base;
                c=-1;
            }
        }

        StringBuffer str = new StringBuffer();
        for (int i=digit-1;i>=0;i--)
        {
            str=str.append(additionNumber[i]);
        }
        String addition = str.toString();
        return addition;
    }
    public static void main(String args[])
    {
        Subtraction S = new Subtraction();
        System.out.println("Please enter the first number:");
        Scanner FirstNumber = new Scanner(System.in);
        String FirstN = FirstNumber.nextLine();
        System.out.println("Please enter the second number:");
        Scanner SecondNumber = new Scanner(System.in);
        String SecondN = SecondNumber.nextLine();
        System.out.println("Please enter the base:");
        Scanner Base = new Scanner(System.in);
        int digit1 = FirstN.length();
        int digit2 = SecondN.length();
        int base = Base.nextInt();
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
        int digit;
        if (digit1>=digit2)
        {
            digit=digit1;
        }
        else
        {
            digit=digit2;
        }
        int[] FN = new int[digit];
        int[] SN = new int[digit];
        if (digit1>=digit2)
        {
            for (int i=digit2-1;i<digit1;i++)
            {
                SN[i]=0;
            }
            for (int i=0;i<digit1;i++)
            {
                FN[i]=firstNumber[i];
            }
            for (int i=0;i<digit2;i++)
            {
                SN[i]=secondNumber[i];
            }
        }
        else
        {
            for (int i=digit2-1;i<digit1;i++)
            {
                FN[i]=0;
            }
            for (int i=0;i<digit1;i++)
            {
                SN[i]=secondNumber[i];
            }
            for (int i=0;i<digit2;i++)
            {
                FN[i]=firstNumber[i];
            }
        }
        String subtraction = S.subtraction(FN,SN,base);
        System.out.println("The subtraction number is:"+subtraction);
    }
}
