import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {



    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","E:\\Skola\\WebDrivers\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com/");
        System.out.println(driver.getTitle());
        driver.quit();


    }

}
