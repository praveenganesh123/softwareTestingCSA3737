package selli;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.Test;


public class seli1 {

	public static void main(String[] args) {
		
		
		System.out.println("hai");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\praveen ganesh\\Downloads\\Selinium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com/");
		driver.manage().window().maximize();
						
		driver.get("https://arms.sse.saveetha.com");
		WebElement username=driver.findElement(By.id("txtusername"));
		
		System.out.println(username);
	
		WebElement password=driver.findElement(By.id("txtpassword"));
		System.out.println(password);
		WebElement login=driver.findElement(By.name("btnlogin"));
		
		System.out.println(login);
		username.sendKeys("192011218");
		
		password.sendKeys("Praveenganesh@607");
		login.click();
}
}

