package com.epam.lab.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComposePage extends BasePO {

    @FindBy(id = "customPanel")
    private WebElement customPanel;

    @FindBy(id = "android:id/button1")
    private WebElement gotItButton;

    @FindBy(xpath = "//android.view.ViewGroup[@resource-id='com.google.android.gm:id/peoplekit_autocomplete_chip_group']//android.widget.EditText")
    private WebElement recipientTextField;

    @FindBy(id = "peoplekit_listview_flattened_row")
    private WebElement choseRecipient;

    @FindBy(id = "subject")
    private WebElement subjectTextField;

    @FindBy(xpath = "//android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.widget.EditText")
    private WebElement letterBody;

    @FindBy(id = "send")
    private WebElement sendButton;

    public ComposePage closeGotItLabel() {
        if(customPanel.isDisplayed()) {
            gotItButton.click();
        } else {
            return this;
        }
        return this;
    }

    public ComposePage typeRecipient(String recipient) {
        recipientTextField.sendKeys(recipient);
        choseRecipient.click();
        return this;
    }

    public ComposePage typeSubject(String subject) {
        subjectTextField.clear();
        subjectTextField.sendKeys(subject);
        return this;
    }

    public ComposePage typeLetterBody(String letter) {
        letterBody.clear();
        letterBody.sendKeys(letter);
        return this;
    }

    public ComposePage clickSendButton() {
        sendButton.click();
        return this;
    }
}
