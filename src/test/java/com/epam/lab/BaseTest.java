package com.epam.lab;

import com.epam.lab.driver.AndroidDriverSingleton;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterSuite;

public class BaseTest {

    private static final Logger logger = LogManager.getLogger(BaseTest.class);

    @AfterSuite
    public void quitDriver2() {
        logger.info("I'm on after method");
        AndroidDriverSingleton.quitDriver();
    }
}
