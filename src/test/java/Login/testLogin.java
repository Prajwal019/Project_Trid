package Login;

import org.testng.annotations.Test;

public class testLogin
{
    @Test
    public void wordOccurrence()
    {
        String word = "prajwal";
        System.out.println(word.length());
        for (int i = 0; i < word.length(); i++)
        {
            int count = 0;
            char ch[] = word.toCharArray();
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
            if (count > 1)
            {
                System.out.println(ch[i] + " : " + count);
            }
        }
    }

    @Test
    public void testStringArray()
    {
        String[] city = {"mumbai", "banglore", "chennai"};
        String[] cityShort = new String[city.length];
        for (int i = 0; i < city.length; i++)
        {
            cityShort[i] = city[i].substring(0, 3);
        }
        System.out.print("{");
        for (int j = 0; j < cityShort.length; j++)
        {

            System.out.print(cityShort[j]);
            if (cityShort.length - 1 > j)
            {
                System.out.print(",");
            }
        }
        System.out.print("}");
        System.out.println();
    }

    @Test
    public void StringSwapExample()
    {
        String str1 = "Hello";
        String str2 = "Wo";

        System.out.println("Before swapping:");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // Swapping without using a third variable
        str1 = str1 + str2;
        str2 = str1.substring(0, str1.length() - str2.length());
        str1 = str1.substring(str2.length());

        System.out.println("\nAfter swapping:");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
    }
}
