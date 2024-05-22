package Customer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

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
    public void testNumberOccurence()
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

    @Test
    public void brokenLinks()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.shopsy.in/");
        List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
        int size = allLinks.size();
        ArrayList<String> links = new ArrayList<>();
        for (int i = 0; i < size; i++)
        {
            URL url = null;
            int statusCode = 0;
            String eachLink = allLinks.get(0).getAttribute("href");
            try
            {
                url = new URL(eachLink);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                if (statusCode > 400)
                {
                    links.add(eachLink + " : " + statusCode);
                }
            } catch (Exception e)
            {
                links.add(eachLink + " : " + statusCode);
            }
        }
        System.out.println(links);
    }

    @Test
    public void testAdvanceDate()
    {
        LocalDate currentDate = LocalDate.now();
        LocalDate futureDate = currentDate.plusDays(20);
        String presentDay = currentDate.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
        String futureDay = futureDate.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
        System.out.println(presentDay);
        System.out.println(futureDay);
    }
}
