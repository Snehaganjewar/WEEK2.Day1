package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ACMEsystem {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://acme-test.uipath.com/login");
	driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
	driver.findElement(By.id("password")).sendKeys("leaf@12");
	driver.findElement(By.className("btn-primary")).click();
	//5. Get the title of the page and print
	String text = driver.findElement(By.tagName("h1")).getText();
	System.out.println(text);
	driver.findElement(By.className("navbar-collapse")).click();
	driver.close();
}   
}
