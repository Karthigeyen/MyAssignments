package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demoCSR");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'SFA')]")).click();
		//driver.findElement(By.className("inputBox")).sendKeys("demoCSR");
		//driver.findElement(By.className("tabletext")).sendKeys("crmsfa");
		//driver.findElement(By.className("loginButton")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Lead')]")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Company");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Test");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Test");
		driver.findElement(By.className("smallSubmit")).click();

	}

}
