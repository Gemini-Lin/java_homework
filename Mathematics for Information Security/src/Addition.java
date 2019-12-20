import java.lang.reflect.Array;
import java.util.Scanner;

public class Addition
{
    public String addition(int[] FN,int[] SN,int base)
    {
        int c = 0;
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
        int[] additionNumber = new int[digit+1];
        for (int i=digit-1;i>=0;i--)
        {
            if ((firstNumber[i]+secondNumber[i]+c)<base)
            {
                additionNumber[i+1]=firstNumber[i]+secondNumber[i]+c;
            }
            else
            {
                additionNumber[i+1]=firstNumber[i]+secondNumber[i]+c-base;
                c=1;
            }
        }
        additionNumber[0]=c;
        StringBuffer str = new StringBuffer();
        for (int i=digit;i>0;i--)
        {
            str=str.append(additionNumber[i]);
        }
        String addition = str.toString();
        return addition;
    }
    public static  void main(String args[])
    {
        Addition A = new Addition();
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
        String addition = A.addition(FN,SN,base);
        System.out.println("The addition number is:"+addition);
    }


}
