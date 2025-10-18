import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest {
    public static void main(String[] args) {
        // Use double backslashes for Windows paths
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tharun.n\\Downloads\\chromedriver-win64\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        
        System.out.println("Selenium Automation with Java setup successful!");
        driver.quit();
    }
}
