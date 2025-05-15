import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	System.setProperty("webdriver.chrome.driver",  "E:/Itrade OMS Integration/Akshay/Selenium Automation/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new  ChromeDriver();
	//	driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		String title = driver.getTitle();
		System.out.println("title of the web: " + title);
		
		String CurrentUrl = driver.getCurrentUrl();
		System.out.println("Current url is: " + CurrentUrl);
		
		
	
		

	}

}
