import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction {

    public static void main(String[] args) {
        // Setting up the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "E:/Itrade OMS Integration/Akshay/Selenium Automation/chrome-win64/chrome.exe");

        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open a website to validate the driver
        driver.get("https://www.google.com");

        // Maximize the browser window
        driver.manage().window().maximize();

        // Print the title of the page
        System.out.println("Page title is: " + driver.getTitle());

        // Close the driver after the test
        driver.quit();
    }
}
