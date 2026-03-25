package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

	public class ExtentReportUtility {

		// ExtentSparkReporter and ExtentReports are 2 classes for generating Extent Report
		public static final ExtentReports extentReports = new ExtentReports();// static instance of ExtentReports class that
																				// can be shared across the application

		public synchronized static ExtentReports createExtentReports() {// Return type ExtentReports

			ExtentSparkReporter reporter = new ExtentSparkReporter("./extent-reports/extent-report.html");// ./current path of the project
			reporter.config().setReportName("ShipArcProject");// Report Name is set as ShipArcProject
			extentReports.attachReporter(reporter);// attach reporter to extentReports

			extentReports.setSystemInfo("Organization", "GreenfieldMarineTechnologies");// Add Organisation Name
			extentReports.setSystemInfo("Name", " Amitha"); // Add your name. provides context of the report
			return extentReports;
		}

	}
