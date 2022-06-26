package com.epam.lab.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InitialPage extends BasePO {

    private final static int TIME_TO_WAIT = 30;

    @FindBy(id = "welcome_tour_got_it")
    private WebElement gotItButton;

    @FindBy(id = "action_done")
    private WebElement takeMeToGmailButton;

    @FindBy(id = "account_address")
    private WebElement accountAddress;

    public InitialPage clickGotItButton() {
        gotItButton.click();
        waitVisibilityOfElement(TIME_TO_WAIT, accountAddress);
        return this;
    }

    public InitialPage clickTakeMeToGmailButton() {
        takeMeToGmailButton.click();
        return this;
    }
}
