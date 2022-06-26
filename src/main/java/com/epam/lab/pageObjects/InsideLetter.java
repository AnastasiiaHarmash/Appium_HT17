package com.epam.lab.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InsideLetter extends BasePO {

    @FindBy(id = "com.google.android.gm:id/delete")
    private WebElement deleteButton;

    public InsideLetter clickDeleteButton() {
        deleteButton.click();
        return this;
    }
}
