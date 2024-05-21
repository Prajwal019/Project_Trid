package Login;

import org.testng.annotations.Test;

public class testApprovalPolicy
{
    @Test
    public void testMerging2Arrays()
    {
        int a[] = {1, 2, 3, 4};
        int b[] = {5, 6, 7, 8, 9};
        int c[] = new int[a.length + b.length];
        int j = 0;
        for (int i = 0; i < c.length; i++)
        {
            if (i < a.length)
            {
                c[i] = a[i];
            } else
            {
                c[i] = b[j];
                j++;
            }
        }
        System.out.print("[");
        for (int i = 0; i < c.length; i++)
        {
            if (i == c.length - 1)
            {
                System.out.print(c[i] + "");
            } else
            {
                System.out.print(c[i] + ",");
            }
        }
        System.out.print("]");
    }
}
