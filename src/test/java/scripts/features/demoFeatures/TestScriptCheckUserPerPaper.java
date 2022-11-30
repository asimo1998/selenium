package scripts.features.demoFeatures;

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

@Id(value = "")
@Name(value = "")
@Description(value = "")

public class TestScriptCheckUserPerPaper extends TestScriptBase {
    @Factory(dataProvider = "dataProvider")

    public TestScriptCheckUserPerPaper(String name, String version, String osPlatform) {
        super(name, version, osPlatform);
    }

    private Account account;
    private int index = 25;
    private int expectPaperSize = 25;

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

        pagedashboard.clickOnPerPaperIndex(index);

        pagedashboard.verifySizePage(expectPaperSize);
    }

    @Override
    protected void cleanUp() {

    }
}
