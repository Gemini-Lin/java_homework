import java.util.Scanner;

public class Division {
    public String[] multiplication(String FirstN,String SecondN,int base) {
        String x = FirstN;
        int digit1 = FirstN.length();
        String y = SecondN;
        int digit2 = SecondN.length();
        int[] firstNumber = new int[digit1];
        int[] firstNumber1 = new int[digit1];
        for (int i = 0; i < digit1; i++) {
            firstNumber1[i] = Integer.parseInt(x.substring(i, i + 1));
        }
        for (int i = 0, j = digit1 - 1; i < digit1; i++, j--) {
            firstNumber[i] = firstNumber1[j];
        }
        int[] secondNumber = new int[digit2];
        int[] secondNumber1 = new int[digit2];
        int n = digit1 - 1;
        int t = digit2 - 1;
        for (int i = 0; i < digit2; i++) {
            secondNumber1[i] = Integer.parseInt(y.substring(i, i + 1));
        }
        for (int i = 0, j = digit2 - 1; i < digit2; i++, j--) {
            secondNumber[i] = secondNumber1[j];
        }
        int[] q = new int[digit1 - digit2 + 1];
        for (int j = 0; j < n - t; j++) {
            q[j] = 0;
        }
        int[] bn = transfer((int) Math.pow(base, n - t));
        String yb = new Multiplication().multiplication(secondNumber, bn, base);
        int[] yb1 = transfer(yb);
        String sub = new Subtraction().subtraction(firstNumber, yb1, base);
        if (Integer.parseInt(sub) > 0) {
            q[n - t] = q[n - t] + 1;
            x = sub;
            for (int i = 0; i < digit1; i++) {
                firstNumber1[i] = Integer.parseInt(x.substring(i, i + 1));
            }
            for (int i = 0, j = digit1 - 1; i < digit1; i++, j--) {
                firstNumber[i] = firstNumber1[j];
            }
        }
        for (int i = n; i > t + 1; i--) {
            if (firstNumber[i] == secondNumber[t]) {
                q[i - t - 1] = base - 1;
            } else {
                q[i - t - 1] = ((firstNumber[i] * base + firstNumber[i - 1]) / secondNumber[t]);
            }
            if ((q[i - t - 1] * (secondNumber[t] * base + secondNumber[t - 1])) > (firstNumber[i] * base * base + firstNumber[i - 1] * base + firstNumber[i - 2])) {
                q[i - t - 1] = q[i - t - 1] - 1;
            }
            int[] bit = transfer((int) Math.pow(base, i - t - 1) * q[i - t - 1]);
            String yb2 = new Multiplication().multiplication(secondNumber, bit, base);
            int[] yb3 = transfer(yb2);
            String sub1 = new Subtraction().subtraction(firstNumber, yb3, base);
            if (Integer.parseInt(sub1) < 0) {
                int[] bit1 = transfer((int) Math.pow(base, i - t - 1));
                String yb4 = new Multiplication().multiplication(secondNumber, bit1, base);
                int[] yb5 = transfer(yb4);
                x = new Addition().addition(firstNumber, yb5, base);
                for (int j = 0; j < digit1; j++) {
                    firstNumber1[j] = Integer.parseInt(x.substring(j, j + 1));
                }
                for (int j = 0, k = digit1 - 1; j < digit1; j++, k--) {
                    firstNumber[j] = firstNumber1[k];
                }
            }
            q[i - t - 1] = q[i - t - 1] - 1;
        }

        int r = Integer.parseInt(x);
        StringBuffer str = new StringBuffer();
        for (int i=n-t;i>=0;i--)
        {
            str=str.append(q[i]);
        }
        String addition = str.toString();
        String[] d = new String[2];
        d[0] = addition;
        //d[1] = Double.toString(r);
        return d;
    }
    public static int[] transfer(int a ){
        String str =null;
        str = Integer.toString(a);
        int[] arr = new int[str.length()];
        for(int i=0; i<arr.length; i++){
            char c = str.charAt(i);
            String s = String.valueOf(c);
            int num = Integer.parseInt(s);
            arr[i] = num;
        }
        return arr;
    }
    public static int[] transfer(String a)
    {
        int[] arr = new int[a.length()];
        for(int i=0; i<arr.length; i++){
            char c = a.charAt(i);
            String s = String.valueOf(c);
            int num = Integer.parseInt(s);
            arr[i] = num;
        }
        return arr;
    }

    public static void main(String args[])
    {
        Division D = new Division();
        System.out.println("Please enter the first number:");
        Scanner FirstNumber = new Scanner(System.in);
        String FirstN = FirstNumber.nextLine();
        String x = FirstN;
        System.out.println("Please enter the second number:");
        Scanner SecondNumber = new Scanner(System.in);
        String SecondN = SecondNumber.nextLine();
        String y = SecondN;
        System.out.println("Please enter the base:");
        Scanner Base = new Scanner(System.in);
        int base = Base.nextInt();
        String[] d = new  String[2];
        d=D.multiplication(x,y,base);
        System.out.println("The q is:"+d[0]);
        System.out.println("The r is:"+d[1]);
    }
}
