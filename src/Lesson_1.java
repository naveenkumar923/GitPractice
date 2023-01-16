import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lesson_1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\navee\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String u=driver.getCurrentUrl();
		System.out.println(u);
		System.out.print(driver.getTitle());
		driver.close();
		driver.quit();
		
	}

}
