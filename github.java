package sellllli;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class github {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selinium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://github.com/praveenganesh123/softwareTestingCSA3737");
		driver.quit();
	}

}
