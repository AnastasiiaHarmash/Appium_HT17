package com.epam.lab;

import com.epam.lab.businessObject.GmailBO;
import com.epam.lab.utils.CurrentDate;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestGmailLetter extends BaseTest {

    private static final Logger logger = LogManager.getLogger(TestGmailLetter.class);

    private final GmailBO gmailBO = new GmailBO();
    CurrentDate currentDate = new CurrentDate();

    private final String recipient = "alist972@gmail.com";
    private final String subject = "Test " + currentDate.getCurrentDateAndTime();
    private final String body = "Hello from test automation!";

    @Test
    public void isLetterSentTest() {
        logger.info("I'm on is letter sent test");
        gmailBO.skipInitialPage()
                .clickCreateNewLetter()
                .closeLabelComposePage()
                .sendLetter(recipient, subject, body);
        Assert.assertTrue(gmailBO.checkThatLetterWithSuchSubjectExist(subject));
    }

    @Test
    public void isLetterDeletedTest() {
        logger.info("I'm on is letter deleted test");
        gmailBO.skipInitialPage()
                .clickCreateNewLetter()
                .closeLabelComposePage()
                .sendLetter(recipient, subject, body);
        Assert.assertTrue(gmailBO.checkThatLetterWithSuchSubjectExist(subject));
        gmailBO.deleteLetter();
        Assert.assertTrue(gmailBO.isDeletedLabelDisplayed());
        Assert.assertFalse(gmailBO.checkThatLetterWithSuchSubjectExist(subject));
    }
}
