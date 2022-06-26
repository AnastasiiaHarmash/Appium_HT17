package com.epam.lab.pageObjects;

import com.epam.lab.driver.AndroidDriverSingleton;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BasePO {

    public BasePO() {
        PageFactory.initElements(AndroidDriverSingleton.getDriver(), this);
    }

    public void waitVisibilityOfElement(long timeToWait, WebElement element) {
        WebDriverWait wait = new WebDriverWait(AndroidDriverSingleton.getDriver(), Duration.ofSeconds(timeToWait));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
