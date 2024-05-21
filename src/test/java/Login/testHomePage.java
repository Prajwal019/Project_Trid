package Login;

import org.testng.annotations.Test;

public class testHomePage
{
    @Test
    public void testWithoutSemi()
    {
        for (int i = 0; i < 5; System.out.println("Hello"))
        {
            i++;
        }
    }

    @Test
    public void testStringProg()
    {
        String s = "Its Simple";
        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            System.out.println(ch);
        }
    }
}
