public class FormattedTable {
    public static void main(String args[])
    {
        System.out.print("  | ");
        int i=0;
        for (i=1;i<13;i++)
        {
           System.out.printf("  %2d",i);
        }
        System.out.print("\n--+-");
        for (i=1;i<13;i++)
        {
            System.out.print("----");
        }
        for (i=1;i<13;i++)
        {
            int j=i;
            System.out.printf("\n%2d",i);
            System.out.print("| ");
            for (j=1;j<i;j++)
            {
                System.out.print("    ");
            }
            for (j=i;j<13;j++)
            {
                System.out.printf("%4d",i*j);
            }
        }
    }
}
