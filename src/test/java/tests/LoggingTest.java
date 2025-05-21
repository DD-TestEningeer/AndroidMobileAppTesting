package tests;


import org.testng.annotations.Test;
import utils.LogUtil;

public class LoggingTest {

    @Test
    public void sampleTestWithLogging() {
        LogUtil.info("Test started: sampleTestWithLogging");

        try {
            int result = 10 / 0;
            LogUtil.info("Computation result: " + result);
        } catch (Exception e) {
            LogUtil.error("Exception occurred: " + e.getMessage());
        }

        LogUtil.info("Test finished: sampleTestWithLogging");
    }
}
