package com.crm.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;

import com.crm.utils.LoggingManager;
import com.crm.utils.TestUtil;


public class TestBase {
	public static TestBase testbase;
	public static WebDriver driver;
	public static Properties prop;
	static FileInputStream fis = null;
	static String UserDir = System.getProperty("user.dir");
	public static String url;
	public int count=0;
	public TestBase() {
		prop = new Properties();

		try {
			fis = new FileInputStream(UserDir + "\\src\\main\\resources\\config\\config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String browserName = prop.getProperty("browsername");
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					UserDir + "\\src\\main\\resources\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			SessionId sessionid = ((RemoteWebDriver) driver).getSessionId();
			System.out.println("SessionID" + sessionid);

		}
		LoggingManager.log = LoggingManager.LoggingManager(TestBase.class.getName());
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		if(count==0)
		{
		    Date date = new Date();      
		    String LogDate= new SimpleDateFormat("yyyyMMddHHmmss").format(date);
		    System.setProperty("bySecond", LogDate);
		    count++;
		}
	}

	public static WebDriver getDriver() {

		return driver;
	}

	public static void setDriver() {

		testbase = new TestBase();
		LoggingManager.log.info("Driver has been initialized");

	}

	public static void tearDown() {
		if (driver != null) {
			
			driver.close();
			driver.quit();
			LoggingManager.log.info("Driver instance has been closed");
		}
		testbase = null;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void openPage() {
		String url = prop.getProperty("url");
		driver.get(url);
		System.out.println(url);
		LoggingManager.log.info("The URl "+url+" has been opened on browser");
	}

	public static String getReportConfigPath() {
		String reportConfigPath = prop.getProperty("reportConfigPath");
		if (reportConfigPath != null)
			return reportConfigPath;
		else
			throw new RuntimeException(
					"Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");
	}
}
