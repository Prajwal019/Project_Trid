package Customer;

import org.testng.annotations.Test;

public class testBulkTransfer
{
    @Test
    public void wordOccurrence()
    {
        String word = "pneumonoultramicroscopicsilicovolcanoconiosis";
        for (int i = 0; i < word.length(); i++)
        {
            char ch[] = word.toCharArray();
            int count = 0;
            for (int j = 0; j < word.length(); j++)
            {
                if (ch[i] == ch[j])
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

    @Test
    public void testNumberOcc()
    {
        int[] s = {1, 2, 3, 1, 2, 3, 4, 5, 5, 4, 4, 9, 0};
        for (int i = 0; i < s.length; i++)
        {
            int count = 0;

            for (int j = 0; j < s.length; j++)
            {
                if (s[i] == s[j])
                {
                    if (j < i)
                    {
                        break;
                    }
                    count++;
                }
            }
            if (count >= 1)
            {
                System.out.println(s[i] + " : " + count);
            }
        }
    }

    @Test
    public void reverseArray()
    {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int startIndex = 7;
        int endIndex = array.length - 1;
        for (int i = 0; i < (endIndex - startIndex + 1) / 2; i++)
        {
            int temp = array[startIndex + i];
            array[startIndex + i] = array[endIndex - i];
            array[endIndex - i] = temp;
        }
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i]);
        }
    }
}
