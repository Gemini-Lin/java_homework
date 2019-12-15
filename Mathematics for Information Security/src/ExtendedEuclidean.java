import java.util.Scanner;

public class ExtendedEuclidean
{
    public int[] ExtendedEuclidean(int f,int g)
    {
        int d=0;
        int u=0;
        int v=0;
        int[] a= new int[3];
        if (g==0)
        {
            d=f;
            u=1;
            v=0;
            a[0]=d;
            a[1]=u;
            a[2]=v;
            return a;
        }
        int u2=1;
        int u1=0;
        int v2=0;
        int v1=1;
        int q=0;
        int r=0;
        while (g!=0)
        {
            q=f/g;
            r=f-g*q;
            u=u2-q*u1;
            v=v2-q*v1;
            f=g;
            g=r;
            u2=u1;
            u1=u;
            v2=v1;
            v1=v;
        }
        d=f;
        u=u2;
        v=v2;
        if (u<0)
        {
            u=u+10;
        }
        if (v<0)
        {
            v=v+10;
        }
        a[0]=d;
        a[1]=u;
        a[2]=v;
        return a;
    }
    public static void main(String args[])
    {
        ExtendedEuclidean E = new ExtendedEuclidean();
        int a[] = new int[3];
        System.out.println("Please enter your aimed polynomial:");
        Scanner sc = new Scanner(System.in);
        String f1 = sc.nextLine();
        String f2 = Integer.valueOf(f1,2).toString();
        int f = Integer.parseInt(f2);
        System.out.println("Please enter your mod polynomial:");
        Scanner sc1 = new Scanner(System.in);
        String g1 = sc1.nextLine();
        String g2 = Integer.valueOf(g1,2).toString();
        int g = Integer.parseInt(g2);
        a=E.ExtendedEuclidean(f,g);
        System.out.println("Inverse element is:"+Integer.toBinaryString(a[1]));
    }
}
