import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class driver
{
    public static void main(String...args)
    {
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\shalini.gupta\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//        WebDriver driver=new ChromeDriver();

//        System.setProperty("webdriver.gecko.driver","C:\\Users\\shalini.gupta\\Downloads\\geckodriver-v0.35.0-win64\\geckodriver.exe");
//       WebDriver firefoxdriver=new FirefoxDriver();

//        firefoxdriver.get("https://www.fedex.com/en-in/open-account.html");
//        String name= firefoxdriver.getTitle();
//        System.out.println(name);
//        String CurrentUrl=  firefoxdriver.getCurrentUrl();
//        System.out.println(CurrentUrl);
//        firefoxdriver.close();
//        firefoxdriver.quit();

        System.setProperty("webdriver.edge.driver","C:\\Users\\shalini.gupta\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        WebDriver edgedriver=new EdgeDriver();


        String name= edgedriver.getTitle();
        System.out.println(name);

    }
}
