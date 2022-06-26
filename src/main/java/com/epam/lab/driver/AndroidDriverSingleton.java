package com.epam.lab.driver;
import com.epam.lab.capabilitiesFactory.CapabilitiesFactory;
import io.appium.java_client.android.AndroidDriver;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import java.time.Duration;

public class AndroidDriverSingleton {

    private static final Logger logger = LogManager.getLogger(AndroidDriverSingleton.class);
    private static AndroidDriver driver;

    private AndroidDriverSingleton() {}

    public static AndroidDriver getDriver() {
        logger.info("I'm on get driver");
        if(driver == null) {
            driver = new AndroidDriver(CapabilitiesFactory.getAppiumServerURL(), CapabilitiesFactory.getCapabilities());
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        }
        return driver;
    }

    public static void quitDriver() {
        logger.info("I'm on quite driver");
        getDriver().quit();
    }
}
