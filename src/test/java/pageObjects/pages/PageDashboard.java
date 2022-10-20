package pageObjects.pages;

import configuration.models.WebBrowser;
import library.random.RandomString;
import library.system.Sleep;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.base.PageObjectBase;
import pageObjects.constants.locators.PageCommonLocator;
import pageObjects.constants.locators.PageDashBoardLocator;
import pageObjects.constants.radomdata.RandomEmail;

public class PageDashboard extends PageObjectBase {
    public PageDashboard(WebDriver webDriver, WebBrowser currentBrowser) {
        super(webDriver, currentBrowser);
    }

    public RandomEmail email = new RandomEmail();

    public PageDashboard(WebDriver webDriver, WebBrowser currentBrowser, PageCommon pageCommon) {
        super(webDriver, currentBrowser, pageCommon);
    }

    public void clickOnAdministrationSidebar() {
        Sleep.refreshTime();
        clickElement(PageDashBoardLocator.spanAdministrationDashboard);
    }

    public void clickOnSidebarUsers() {
        Sleep.refreshTime();
        clickElement(PageDashBoardLocator.spanUsersDashboard);
    }

    public void clickOnButtonCreateNewUser() {
        waitElementDisplayed(PageDashBoardLocator.spanCreateNewUser,5);
        Sleep.refreshTime();
        clickElement(PageDashBoardLocator.spanCreateNewUser);
        Sleep.defaultTime();
    }

    public void clickOnButtonCancel() {
        waitElementDisplayed(PageDashBoardLocator.buttonCancelOnPopup,5);
        Sleep.defaultTime();
        clickElement(PageDashBoardLocator.buttonCancelOnPopup);
    }

    public void verifyPopupIsNotDisplay() {
        Sleep.defaultTime();
        waitElementNotDisplayed(PageDashBoardLocator.formVerifyAccountPopupNotDisplay, 5);
    }

    public void verifyNotificationIsDisplay(String expectResult) {
        Sleep.refreshTime();
        String actualResult = getText(PageDashBoardLocator.spanVerifyMessengerPopup);

        Sleep.refreshTime();
        Assert.assertEquals(actualResult, expectResult);
    }

    public void enterFirstName() {
        Sleep.refreshTime();
        String firstName = RandomString.randomAlphabetic(6);

        Sleep.refreshTime();
        enterText(PageDashBoardLocator.inputFirstNameOnPopup, firstName);
    }

    public void enterSurName() {
        Sleep.refreshTime();
        String surName = RandomString.randomAlphabetic(6);

        Sleep.refreshTime();
        enterText(PageDashBoardLocator.inputSurNameOnPopup, surName);
    }

    public void enterEmail() {
        Sleep.refreshTime();
        enterText(PageDashBoardLocator.inputEmailOnPopup, email.getEmail());
    }

    public void enterUserName() {
        Sleep.refreshTime();
        String usernamePopup = RandomString.randomAlphabetic(6);

        Sleep.refreshTime();
        enterText(PageDashBoardLocator.inputUserNameOnPopup, usernamePopup);
        Sleep.defaultTime();
    }
    public void registerAnAccountAndSubmit(){
        enterFirstName();
        enterSurName();
        enterEmail();
        enterUserName();
        clickOnButtonSaveInPopup();
    }
    public void registerAnAccountAndSubmit(String username){
        enterFirstName();
        enterSurName();
        enterEmail();
        enterUserName(username);
        clickOnButtonSaveInPopup();
    }
    public void clickOnButtonSaveInPopup() {
        Sleep.longTime();
        clickElement(PageDashBoardLocator.buttonSaveOnPopup);
    }

    public void searchUser(String user) {
        Sleep.refreshTime();
        enterText(PageDashBoardLocator.inputSearchToolbar, user);
//        Sleep.refreshTime();
//        clickElement(PageDashBoardLocator.searchBtnDashboard);
    }

    public void performDeleteUser(String ignoredUser) {
        waitElementDisplayed(PageCommonLocator.spanUsername.addParams(ignoredUser),5);

        Sleep.longTime();
        clickElement(PageDashBoardLocator.buttonActons);

        Sleep.refreshTime();
        clickElement(PageDashBoardLocator.aDelete);

        Sleep.refreshTime();
        clickElement(PageDashBoardLocator.buttonYes);
    }

    public void enterUserName(String user) {
        Sleep.refreshTime();
        clearText(PageDashBoardLocator.inputUserNameOnPopup);

        Sleep.refreshTime();
        enterText(PageDashBoardLocator.inputUserNameOnPopup, user);
    }

    public void clickOnSortTableColumn() {
        waitElementDisplayed(PageDashBoardLocator.p_sorticonSortSurname,5);
        Sleep.refreshTime();
        clickElement(PageDashBoardLocator.p_sorticonSortSurname);
        Sleep.defaultTime();
    }

    public void verifyDataSortedBySurname() {
        Sleep.longTime();
        Boolean actual = isSortDataAnphabetically(PageDashBoardLocator.tdColumnSurname);

        Sleep.refreshTime();
        Assert.assertTrue(actual);
    }


    public void verifyDatetime(String expectDatetime, String userName) {
        waitElementDisplayed(PageDashBoardLocator.spanVerifyUsername.addParams(userName),5);
        Sleep.refreshTime();
        String actualDatetime = getDateTimeCreation(PageDashBoardLocator.tdCreationTime);

        Sleep.refreshTime();
        Assert.assertEquals(actualDatetime, expectDatetime);
    }

    public void verifySizePage(int expectSize) {
        Sleep.refreshTime();
        int actualSize = countElement(PageDashBoardLocator.tdColumnSurname);

        Sleep.refreshTime();
        Assert.assertEquals(actualSize, expectSize);
    }

    public void clickOnPerPaperIndex(int index) {
        waitElementDisplayed(PageDashBoardLocator.p_dropdownPerPaper,5);

        Sleep.refreshTime();
        clickElement(PageDashBoardLocator.p_dropdownPerPaper);

        Sleep.refreshTime();
        clickElement(PageCommonLocator.perPaperIndex.addIndex(index));
    }
}
