package com.epam.lab.capabilitiesFactory;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

public class CapabilitiesFactory {

    private static final Logger logger = LogManager.getLogger(CapabilitiesFactory.class);

    private static final String PLATFORM_NAME_CAPABILITY = "Android";
    private static final String DEVICE_NAME_CAPABILITY = "emulator-5554";
    private static final String APP_PACKAGE_CAPABILITY = "com.google.android.gm";
    private static final String APP_ACTIVITY_CAPABILITY = "com.google.android.gm.GmailActivity";
    private static final String COMMAND_TIME_OUT_CAPABILITY = "60";

    public static DesiredCapabilities getCapabilities() {
        logger.info("I'm on get capabilities");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, PLATFORM_NAME_CAPABILITY);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, DEVICE_NAME_CAPABILITY);
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, APP_PACKAGE_CAPABILITY);
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, APP_ACTIVITY_CAPABILITY);
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, COMMAND_TIME_OUT_CAPABILITY);
        return capabilities;
    }

    public static URL getAppiumServerURL() {
        logger.info("I'm on get appium server URL");
        try {
            return new URL("http://0.0.0.0:4723/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
