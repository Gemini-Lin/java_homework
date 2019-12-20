import java.lang.reflect.Array;
import java.util.ArrayList;

public class Table{

    public int function(int a[])
    {
        int i;
        int j=0;
        for (i=255;i>=0;i--)
        {
            if (a[i]!=0)
            {
                j=i;
                break;
            }
        }
        return j;
    }
    int decimal(int r[])
    {
        int result=0;
        if(r[0]==1)	result+=1;
        if(r[1]==1)	result+=2;
        if(r[2]==1)	result+=4;
        if(r[3]==1)	result+=8;
        if(r[4]==1)	result+=16;
        if(r[5]==1)	result+=32;
        if(r[6]==1)	result+=64;
        if(r[7]==1)	result+=128;
        return result;

    }
    public void table()
    {
        int[] a= new int[256];
        for (int i=0;i<256;i++)
        {
            a[i]=0;
        }
        a[8]=1;a[6]=1;a[5]=1;a[1]=1;a[0]=1;
        int[] r = new int[256];
        int[] t = new int[256];
        t[8]=1;t[6]=1;t[5]=1;t[1]=1;t[0]=1;
        int i,j;
        int sub;
        int [][]table=new int[2][256];
        for (i=0;i<=255;i++)
        {
            table[0][i]=i;
        }
        for (i=0;i<=254;i++)
        {
            for (j=255;j>=0;j--)
            {
                r[j]=0;
            }
            r[i]=1;
            while (function(r)>=8)
            {
                for (j=255;j>=0;j--)
                {
                    t[j]=0;
                }
                t[8]=1;t[6]=1;t[5]=1;t[1]=1;t[0]=1;
                sub=function(r)-8;
                if (sub>0)//左移
                {
                    for (j=255;j>=sub;j--)
                    {
                        t[j]=t[j-sub];
                    }
                    for (j=sub-1;j>=0;j--)
                    {
                        t[j]=0;
                    }
                }
                for (j=255;j>=0;j--)//精髓，求余
                {
                    if (t[j]==r[j])
                        r[j]=0;
                    else if (t[j]!=r[j])
                        r[j]=1;
                }
            }
            table[1][i]=decimal(r);
        }
        table[1][255]=0;
        int temp,temp2;
        Boolean isSorted=false;
        for(i=0; i<256-1; i++)
        {
            isSorted = true; //假设剩下的元素已经排序好了
            for(j=0; j<256-1-i; j++)
            {
                if(table[1][j] > table[1][j+1])
                {
                    temp = table[1][j];
                    temp2 = table[0][j];
                    table[1][j] = table[1][j+1];
                    table[0][j] = table[0][j+1];
                    table[1][j+1] = temp;
                    table[0][j+1] = temp2;
                    isSorted = false; //一旦需要交换数组元素，就说明剩下的元素没有排序好
                }
            }
            if(isSorted) break; //如果没有发生交换，说明剩下的元素已经排序好了
        }
        System.out.println("指数对数表如下：");
        for (i=0;i<255;i++)
        {
            for (j=0;j<1;j++)
            {
                System.out.print(i+"      "+table[j][i]);
            }
            System.out.println();
        }

    }
    public static void main(String args[])
    {
        Table T = new Table();
        T.table();
    }
}