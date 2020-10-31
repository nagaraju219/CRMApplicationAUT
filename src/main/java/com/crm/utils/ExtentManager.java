package com.crm.utils;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.cucumber.core.api.Scenario;

public class ExtentManager {
	public static ExtentManager manager;
	public static ExtentReports extentReports;
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentTest test;
	
	public static void ReportInitialization(String reportLocation)
	{
		extentReports = new ExtentReports();
		htmlReporter = new ExtentHtmlReporter(new File(reportLocation));
		htmlReporter.config().setDocumentTitle("CRM Application AUT");
		htmlReporter.config().setReportName("Cucumber Automation Report");
		htmlReporter.config().setTheme(Theme.DARK);
		extentReports.setSystemInfo("Authot", "Madupu Nagaraju");
		extentReports.setSystemInfo("Browser", "Chrome");
		extentReports.attachReporter(htmlReporter);		
	}
	
	public static void createTest(Scenario scenario,String screenshotFileName)
	{
		if(scenario!=null)
		{
			String testName=getScenarioName(scenario);
			switch(scenario.getStatus())
			{
			case PASSED:
				extentReports.createTest(testName).pass("Test PASSED");
				break;
			case FAILED:
				extentReports.createTest(testName).fail("Test FAILED");
				break;
			default:
				extentReports.createTest(testName).skip("Test SKIPPED");
				break;
			}
		}
		
	}
	
	public static String getScenarioName(Scenario scenario)
	{
		return scenario.getName().replace(" ", "");
	}
	public static void extentreportFlusher()
	{
		if(extentReports!=null)
		{
			extentReports.flush();
		}
	}
}
