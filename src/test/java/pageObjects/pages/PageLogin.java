package pageObjects.pages;

import configuration.managers.AccountManager;
import configuration.models.Account;
import configuration.models.WebBrowser;
import library.system.Sleep;
import org.openqa.selenium.WebDriver;
import pageObjects.base.PageObjectBase;
import pageObjects.constants.locators.PageLoginLocator;

public class PageLogin extends PageObjectBase {

    private AccountManager accountManager;

    private Account account;

    public PageLogin(WebDriver webDriver, WebBrowser currentBrowser) {
        super(webDriver, currentBrowser);
    }

    public PageLogin(WebDriver webDriver, WebBrowser currentBrowser, PageCommon pageCommon) {
        super(webDriver, currentBrowser, pageCommon);
    }

    public void enterUserNameLogin(String user) {
        Sleep.refreshTime();
        enterText(PageLoginLocator.inputUserNameLocator, user);
    }

    public void enterPasswordLogin(String password) {
        Sleep.refreshTime();
        enterText(PageLoginLocator.inputPasswordLocator, password);
    }

    public void clickOnButtonlogin() {
        Sleep.refreshTime();
        clickElement(PageLoginLocator.buttonLoginButtonLocator);
    }

    public void loginPage(String user, String passsword) {
        enterUserNameLogin(user);
        enterPasswordLogin(passsword);
        clickOnButtonlogin();
    }
}
