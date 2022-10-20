package scripts.features;

import configuration.models.Account;
import configuration.models.WebBrowser;
import library.random.RandomString;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Factory;
import pageObjects.pages.PageDashboard;
import pageObjects.pages.PageDemoUiComponents;
import pageObjects.pages.PageLogin;
import scripts.base.TestScriptBase;
import testng.annotations.Description;
import testng.annotations.Id;
import testng.annotations.Name;

import static pageObjects.constants.datetime.currentDate.formattedCurrentDate;
@Id(value = "")
@Name(value = "")
@Description(value="")

public class TestScriptCheckCreationTime extends TestScriptBase {
    @Factory(dataProvider = "dataProvider")

    public TestScriptCheckCreationTime(String name, String version, String osPlatform) {
        super(name, version, osPlatform);
    }
    private  Account account;
    private String userName = RandomString.randomAlphabetic(5);

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

        pagedashboard.clickOnButtonCreateNewUser();

        pagedashboard.registerAnAccountAndSubmit(userName);

        pagedashboard.searchUser(userName);

        pagedashboard.verifyDatetime(formattedCurrentDate, userName);
    }

    @Override
    protected void cleanUp() {

    }
}
