package scripts.features;

import configuration.models.Account;
import configuration.models.WebBrowser;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Factory;
import pageObjects.pages.PageDashboard;
import pageObjects.pages.PageDemoUiComponents;
import pageObjects.pages.PageLogin;
import scripts.base.TestScriptBase;
import testng.annotations.Description;
import testng.annotations.Id;
import testng.annotations.Name;

@Id(value = "Testcase-02")
@Name(value = "")
@Description(value = "")
public class TestScriptCreateNewUser extends TestScriptBase {
    @Factory(dataProvider = "dataProvider")

    public TestScriptCreateNewUser(String name, String version, String osPlatform) {
        super(name, version, osPlatform);
    }

    private String verifyCreateNewUser = "Saved successfully.";

    @Override
    protected void setup(WebDriver webDriver, WebBrowser currentBrowser) {
        pageLogin = new PageLogin(webDriver, currentBrowser, this.pageCommon);
        pagedashboard = new PageDashboard(webDriver, currentBrowser, this.pageCommon);
        pageDemoUiComponents = new PageDemoUiComponents(webDriver, currentBrowser, this.pageCommon);
    }

    @Override
    protected void run() {
        Account account = accountManager.getAccount("admin");

        String userAccount = account.getUsername();

        String passwordAccount = account.getPassword();

        pageLogin.loginPage(userAccount, passwordAccount);

        pagedashboard.clickOnAdministrationSidebar();

        pagedashboard.clickOnSidebarUsers();

        pagedashboard.clickOnButtonCreateNewUser();

        pagedashboard.registerAnAccountAndSubmit();

        pagedashboard.verifyNotificationIsDisplay(verifyCreateNewUser);
    }

    @Override
    protected void cleanUp() {

    }
}
