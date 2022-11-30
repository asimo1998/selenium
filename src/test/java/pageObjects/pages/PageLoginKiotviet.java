package pageObjects.pages;

import configuration.models.Account;
import configuration.models.WebBrowser;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.base.PageObjectBase;
import pageObjects.constants.locators.PageLoginKiotvietLocator;

public class PageLoginKiotviet extends PageObjectBase {

    public PageLoginKiotviet(WebDriver webDriver, WebBrowser currentBrowser) {
        super(webDriver, currentBrowser);
    }

    private Account account;

    /*==============Click==================*/

    public void clickOnButtonLogin() {
        waitElementDisplayed(PageLoginKiotvietLocator.buttonLogin, 10);
        clickElement(PageLoginKiotvietLocator.buttonLogin);
    }

    public void clickOnButtonEnterTheShop() {
        waitElementDisplayed(PageLoginKiotvietLocator.buttonEnterTheShop, 10);
        clickElement(PageLoginKiotvietLocator.buttonEnterTheShop);
    }

    public void clickOnCheckbox() {
        waitElementDisplayed(PageLoginKiotvietLocator.checkboxKeepLogin, 10);
        boolean check = isElementClickable(PageLoginKiotvietLocator.checkboxKeepLogin);
        if (check == true) {
            clickElement(PageLoginKiotvietLocator.checkboxKeepLogin);
        }
    }

    public void clickOnButtonManage() {
        waitElementDisplayed(PageLoginKiotvietLocator.buttonManage, 10);
        clickElement(PageLoginKiotvietLocator.buttonManage);
    }
    /*==============EnterText============*/

    public void enterDomainShop(String domain) {
        waitElementDisplayed(PageLoginKiotvietLocator.inputDomainShop, 10);
        clearText(PageLoginKiotvietLocator.inputDomainShop);
        enterText(PageLoginKiotvietLocator.inputDomainShop, domain);
    }

    public void enterUserName(String userName) {
        waitElementDisplayed(PageLoginKiotvietLocator.inputUsername, 10);
        clearText(PageLoginKiotvietLocator.inputUsername);
        enterText(PageLoginKiotvietLocator.inputUsername, userName);
    }

    public void enterPassword(String password) {
        waitElementDisplayed(PageLoginKiotvietLocator.inputPassword, 10);
        clearText(PageLoginKiotvietLocator.inputPassword);
        enterText(PageLoginKiotvietLocator.inputPassword, password);
    }

    /*==========VERIFY=========*/
    public void verifyTaskbarOverviewIsDisplay() {
        waitElementDisplayed(PageLoginKiotvietLocator.verifyTaskbarOverview, 10);
    }

    public void loginKiotviet(String domain, String userName, String password){
        this.clickOnButtonLogin();
        this.enterDomainShop(domain);
        this.clickOnButtonEnterTheShop();
        this.enterUserName(userName);
        this.enterPassword(password);
        this.clickOnButtonManage();
    }
}
