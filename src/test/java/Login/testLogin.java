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
}
