package com.epam.lab.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PrimaryGmailPage extends BasePO {

    @FindBy(id = "compose_button")
    private WebElement composeButton;

    @FindBy(id = "dialog_rounded_corner_wrapper")
    private WebElement labelGoogleMeet;

    @FindBy(id = "dismiss_button")
    private WebElement closeLabelButton;

    public PrimaryGmailPage closeLabelGoogleMeet() {
        if(labelGoogleMeet.isDisplayed()) {
            closeLabelButton.click();
        }
        return this;
    }

    public PrimaryGmailPage clickComposeButton() {
        composeButton.click();
        return this;
    }
}
