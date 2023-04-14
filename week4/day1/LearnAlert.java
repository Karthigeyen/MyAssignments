package week4.day1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException,IOException {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[text() = 'Show']"));
		Thread.sleep(3000);
		Alert simpleAlert = driver.switchTo().alert();
		String simpleAlertText = simpleAlert.getText();
		System.out.println("The Alert is" + simpleAlertText);
		simpleAlert.accept();
		System.out.println(driver.findElement(By.id("simple_result")).getText());
		driver.findElement(By.xpath("//button[@name = 'j_idt88:j_idt93']/span[text() = 'Show']")).click();
		Alert confirmAlert = driver.switchTo().alert();
		String confirmAlertText = confirmAlert.getText();
		System.out.println("Confirm Alert Text" + confirmAlertText);
		confirmAlert.accept();
		String text = driver.findElement(By.id("result")).getText();
		System.out.println(text);
	}

}
