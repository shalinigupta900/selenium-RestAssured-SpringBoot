import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class driver {
    static int count = 0;

    public static void main(String... args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\shalini.gupta\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.fedex.com/en-in/home.html");
        driver.manage().window().maximize();

        driver.findElement(By.className("a.fxg-search-icon.js-fxg-search-btn")).click();


//        System.setProperty("webdriver.gecko.driver","C:\\Users\\shalini.gupta\\Downloads\\geckodriver-v0.35.0-win64\\geckodriver.exe");
//       WebDriver firefoxdriver=new FirefoxDriver();

//        firefoxdriver.get("https://www.fedex.com/en-in/open-account.html");
//        String name= firefoxdriver.getTitle();
//        System.out.println(name);
//        String CurrentUrl=  firefoxdriver.getCurrentUrl();
//        System.out.println(CurrentUrl);
//        firefoxdriver.close();
//        firefoxdriver.quit();

//        System.setProperty("webdriver.edge.driver","C:\\Users\\shalini.gupta\\Downloads\\edgedriver_win64\\msedgedriver.exe");
//        WebDriver edgedriver=new EdgeDriver();
//
//
//        String name= edgedriver.getTitle();
//        System.out.println(name);

        driver.get("https://www.fedex.com/en-in/open-account.html");
        String name = "shalini";
        System.out.println(name);

        char[] value = name.toCharArray();
        int m = value.length;
        System.out.println(m);

        for (int i = 0; i < value.length; i++) {
            for (int j = i + 1; j < value.length; j++) {

                System.out.println(value[i]);

                    System.out.println("----------------");
                    System.out.println(value[j]);

                }

            }
          //  System.out.println(value[i]);
        }

    }












