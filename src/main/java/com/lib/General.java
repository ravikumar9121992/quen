package com.lib;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
//import com.excel.utility.Xls_Reader;
import com.utility.Log;
public class General extends Global {
	
	public void build_001() throws Exception{
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Admin\\Desktop\\geckodriver.exe");
		driver = new FirefoxDriver();
		Thread.sleep(3000);
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile, new File("C:\\eclipse-workspace\\MAVEN_PROJECT\\screenshorts\\screenshot1.png"));
		driver.navigate().to(URL);
		driver.getTitle();
		File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile1, new File("C:\\eclipse-workspace\\MAVEN_PROJECT\\screenshorts\\screenshot2.png"));
		//Xls_Reader reader = new Xls_Reader("C:\\eclipse-workspace\\MAVEN_PROJECT\\src\\main\\java\\testdata\\testdata.xlsx");
		//String one = reader.getCellData("testdata", "USERNAME", 2);
		//String two = reader.getCellData("testdata", "PASSWORD", 2);
		driver.findElement(By.xpath(username_textbox_xpath)).sendKeys("rdeo2952@gmail.com");
		driver.findElement(By.xpath(password_textbox_xpath)).sendKeys("9907841379asdfzxcvlkjh");
		File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile2, new File("C:\\eclipse-workspace\\MAVEN_PROJECT\\screenshorts\\screenshot3.png"));
		driver.findElement(By.xpath(login_textbox_xpath)).click();
		Thread.sleep(5000);
		Actions action = new Actions(driver);
		WebElement lable=driver.findElement(By.xpath(mousehover_textbox_xpath));
		action.moveToElement(lable);
		Thread.sleep(3000);
		WebElement lable1=driver.findElement(By.xpath("//*[@id=\"jsc_c_5s\"]/div/div[1]/span"));
		action.moveToElement(lable1);
		action.click().build().perform();
		File scrfile4=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrfile4 , new File("C:\\eclipse-workspace\\MAVEN_PROJECT\\screenshorts\\screenshot4.png")); 
		//driver.quit();
		System.out.println("okay");
		Log.info("title okay-");
		Reporter.log("ravi okay");
		
		
		
		
		}

}
