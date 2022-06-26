package com.epam.lab.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class LettersPage extends BasePO {

    @FindBy(id = "com.google.android.gm:id/viewified_conversation_item_view")
    private List<WebElement> listOfLetters;

    @FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"1 deleted\"]/android.widget.LinearLayout")
    private WebElement deletedLabel;

    public boolean isLetterWithSuchSubjectExist(String subject) {
        boolean isLetterWithSuchSubjectExist = false;
        for (WebElement listOfLetter : listOfLetters) {
            if (listOfLetter.getText().contains(subject)) {
                isLetterWithSuchSubjectExist = true;
            }
        }
        return isLetterWithSuchSubjectExist;
    }

    public LettersPage clickFirstLetter() {
        listOfLetters.get(0).click();
        return this;
    }

    public boolean isDeletedLabelDisplayed() {
        return deletedLabel.isDisplayed();
    }
}
