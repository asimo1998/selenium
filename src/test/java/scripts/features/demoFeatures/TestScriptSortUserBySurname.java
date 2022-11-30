package scripts.features.demoFeatures;

import configuration.models.Account;
import configuration.models.WebBrowser;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Factory;
import pageObjects.pages.PageDashboard;
import pageObjects.pages.PageDemoUiComponents;
import pageObjects.pages.PageLogin;
import scripts.base.TestScriptBase;
import sun.management.counter.AbstractCounter;
import testng.annotations.Description;
import testng.annotations.Id;
import testng.annotations.Name;

@Id(value = "Testcase-08")
@Name(value = "")
@Description(value = "")
public class TestScriptSortUserBySurname extends TestScriptBase {
    @Factory(dataProvider = "dataProvider")

    public TestScriptSortUserBySurname(String name, String version, String osPlatform) {
        super(name, version, osPlatform);
    }

    private Account account;

    @Override
    protected void setup(WebDriver webDriver, WebBrowser currentBrowser) {
        pageLogin = new PageLogin(webDriver, currentBrowser, this.pageCommon);
        pagedashboard = new PageDashboard(webDriver, currentBrowser, this.pageCommon);
        pageDemoUiComponents = new PageDemoUiComponents(webDriver, currentBrowser, this.pageCommon);
    }

    @Override
    protected void run() {
        account = accountManager.getAccount("admin");

        pageLogin.loginPage(account.getUsername(), account.getPassword());

        pagedashboard.clickOnAdministrationSidebar();

        pagedashboard.clickOnSidebarUsers();

        pagedashboard.clickOnSortTableColumn();

        pagedashboard.verifyDataSortedBySurname();
    }

    @Override
    protected void cleanUp() {

    }
}
