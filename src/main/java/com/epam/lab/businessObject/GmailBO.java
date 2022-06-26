package com.epam.lab.businessObject;

import com.epam.lab.pageObjects.*;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class GmailBO {

    private static final Logger logger = LogManager.getLogger(GmailBO.class);

    private final InitialPage initialPage;
    private final PrimaryGmailPage primaryGmailPage;
    private final ComposePage composePage;
    private final LettersPage lettersPage;
    private final InsideLetter insideLetter;

    public GmailBO() {
        initialPage = new InitialPage();
        primaryGmailPage = new PrimaryGmailPage();
        composePage = new ComposePage();
        lettersPage = new LettersPage();
        insideLetter = new InsideLetter();
    }

    public GmailBO skipInitialPage() {
        logger.info("I`m on skip initial page");
        initialPage
                .clickGotItButton()
                .clickTakeMeToGmailButton();
        return this;
    }

    public GmailBO clickCreateNewLetter() {
        logger.info("I`m on click create new letter");
        primaryGmailPage
                .closeLabelGoogleMeet()
                .clickComposeButton();
        return this;
    }

    public GmailBO closeLabelComposePage() {
        logger.info("I`m on close label compose page");
        composePage
                .closeGotItLabel();
        return this;
    }

    public GmailBO sendLetter(String recipient, String subject, String body) {
        logger.info("I`m on send letter");
        composePage
                .typeRecipient(recipient)
                .typeSubject(subject)
                .typeLetterBody(body)
                .clickSendButton();
        return this;
    }

    public boolean checkThatLetterWithSuchSubjectExist(String subject) {
        logger.info("I`m on check the letter");
        return lettersPage
                .isLetterWithSuchSubjectExist(subject);
    }

    public GmailBO deleteLetter() {
        logger.info("I`m on delete the letter");
        lettersPage
                .clickFirstLetter();
        insideLetter
                .clickDeleteButton();
        return this;
    }

    public boolean isDeletedLabelDisplayed() {
        logger.info("I`m on is deleted label displayed");
        return lettersPage
                .isDeletedLabelDisplayed();
    }
}
