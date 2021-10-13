package Week2.Day2;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InteractWithImages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//label[contains(text(),'Click on this')]/following-sibling::img")).click();
		driver.navigate().to("http://leafground.com/pages/Image.html");
		driver.findElement(By.xpath("//label[contains(text(),'Broken')]/following-sibling::img")).click();
		System.out.println(driver.getTitle());

		WebElement Ele = driver.findElement(By.xpath("//label[contains(text(),'Keyboard')]/following-sibling::img"));
		Actions act = new Actions(driver);
		act.click(Ele);

	}

}
