package sellliii;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.Test;


public class mozilla {

	public static void main(String[] args) {
		
		
		System.out.println("hai");
		System.setProperty("webdriver.chrome.driver","C:\\Selinium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com/");
		driver.manage().window().maximize();
						
		driver.get("https://mozillabrowser.com/");
		
}
}