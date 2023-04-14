package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.messages.internal.com.fasterxml.jackson.annotation.OptBoolean;

public class Collections {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		//search mobiles in the searchbox
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles",	Keys.ENTER);
	   List<WebElement> mobilePriceList = driver.findElements(By.className("a-price-whole"));
	 	   for (WebElement each : mobilePriceList) {
	    String text = each.getText();
	    //60,944
	    String replaceAll = text.replaceAll(",", "");//60499
	   // int parseInt = Integer.parseInt(replaceAll);
	   System.out.println(replacedString);
	    //list.add(parseInt);
	}
	//sort it
	   //print the minimum value
	}

}
