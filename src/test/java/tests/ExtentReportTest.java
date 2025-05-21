package tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import listeners.ExtentManager;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class ExtentReportTest {

    @Test
    public void testGenerateExtentReport() {
        // Step 1: Get the ExtentReports instance
        ExtentReports extent = ExtentManager.getInstance();

        // Step 2: Create a test case in the report
        ExtentTest test = extent.createTest("Sample Test Case");
        test.info("This is a sample log message.");
        test.pass("Test passed successfully!");

        // Step 3: Flush the report (writes the report file)
        extent.flush();

        // Step 4: Verify the report file exists
        String reportPath = System.getProperty("user.dir") + "/TestReports/" + ExtentManager.rname;
        File reportFile = new File(reportPath);

        Assert.assertTrue(reportFile.exists(), "Extent report file should exist after flushing.");
    }
}
