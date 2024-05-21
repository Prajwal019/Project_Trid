package Customer;

import org.testng.annotations.Test;

public class testCustomer
{
    @Test
    public void toInterchangeCases()
    {
        String word = "APpLE";
        String temp = "";
        char ch[] = word.toCharArray();
        for (int i = 0; i < ch.length; i++)
        {
            if (ch[i] >= 65 && ch[i] <= 90)
            {
                ch[i] = (char) (ch[i] + 32);
            } else
            {
                ch[i] = (char) (ch[i] - 32);
            }
            temp = temp + ch[i];
        }
        System.out.println(temp);
    }

    @Test
    public void testSecondMax()
    {
        int[] a = {2, 5, 6, 1, 8, 0, 5, 9};
        for (int i = 0; i < a.length - 1; i++)
        {
            for (int j = 0; j < a.length - 1; j++)
            {
                if (a[j] < a[j + 1])
                {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println(a[1]);
    }

    @Test
    public void testOccu()
    {
        String word = "java";
        char ch[] = word.toCharArray();
        for (int i = 0; i < ch.length; i++)
        {
            int count = 0;
            for (int j = 0; j < ch.length; j++)
            {
                if (ch[j] == ch[i])
                {
                    if (j < i)
                    {
                        break;
                    }
                    count++;
                }
            }
            if (count > 0)
            {
                System.out.println(ch[i] + " : " + count);
            }

        }
    }
}
