package Login;

import org.testng.annotations.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class testTransactionPage
{
    @Test
    public void testAlphaOccurrence()
    {
        String s = "abcabcddcaddaaa";
        for (int i = 0; i < s.length(); i++)
        {
            int count = 0;
            char ch[] = s.toCharArray();
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
                System.out.print(ch[i] + "" + count);
            }
        }
        System.out.println();
    }

    @Test
    public void testBubbleSort()
    {
        int a[] = {4, 2, 5, 1, 6, 8, 7, 9, 3};

        for (int i = 0; i < a.length; i++)
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
        for (int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }
    }

    @Test
    public void testDate()
    {
        String s = "18-12-2024";
        // Parse the input string to local date

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(s, formatter);

        // Format the LocalDate to desired output format
        String output = date.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
        System.out.println(output);
    }

    @Test
    public void toPrintLocalSystemDate()
    {
        LocalDate currentDate = LocalDate.now();
        String localCurrentDate = currentDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println("The current date of the system is : " + localCurrentDate);

        String newFormat = currentDate.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
        System.out.println(newFormat);
    }
}
