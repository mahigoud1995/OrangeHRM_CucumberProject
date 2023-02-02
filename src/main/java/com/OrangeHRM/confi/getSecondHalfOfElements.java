package com.OrangeHRM.confi;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getSecondHalfOfElements {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.html-code-generator.com/html/drop-down/country-names");
		List<WebElement> options = driver.findElements(By.xpath("//select[@id='lang']/option"));
		for(int i=0; i<options.size(); i++) {
			if((options.size()/2)<=i) {
				System.out.println(i+" ==== "+options.get(i).getText());
				
			}
			
		}
		
	}

}
