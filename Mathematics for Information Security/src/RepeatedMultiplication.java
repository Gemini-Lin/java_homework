import java.util.Scanner;

public class RepeatedMultiplication
{
    public int RepeatedMultiplication(int a,int k,int m)
    {
        String k1 =Integer.toBinaryString(k);
        int digit = k1.length();
        int[] k2 =transfer(k1);
        int b=1;
        if (k==0)
        {
            return b;
        }
        int A=a;
        if (k2[0]==1)
        {
            b=a;
        }
        for (int i=1;i<digit;i++)
        {
            A=(A*A)%m;
            if (k2[i]==1)
            {
                b=(A*b)%m;
            }
        }
        return b;
    }
    public static int[] transfer(String a)
    {
        int[] arr = new int[a.length()];
        for(int i=arr.length-1; i>=0; i--){
            char c = a.charAt(i);
            String s = String.valueOf(c);
            int num = Integer.parseInt(s);
            arr[i] = num;
        }
        for (int start = 0, end = a.length() - 1; start < end; start++, end--) {
           int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
        }
        return arr;
    }
    public static void main(String args[])
    {
        RepeatedMultiplication R = new RepeatedMultiplication();
        System.out.println("Please enter the a:");
        Scanner a1 = new Scanner(System.in);
        int a = a1.nextInt();
        System.out.println("Please enter the k:");
        Scanner k1 = new Scanner(System.in);
        int k = k1.nextInt();
        System.out.println("Please enter the m:");
        Scanner m1 = new Scanner(System.in);
        int m =m1.nextInt();
        System.out.println("The b is:"+R.RepeatedMultiplication(a,k,m));


    }
}
