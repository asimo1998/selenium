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

@Id(value = "")
@Name(value =  "")
@Description(value = "")

public class LoginKiotviet extends TestScriptBase {
    @Factory(dataProvider = "dataProvider")
    public LoginKiotviet(String name, String version, String osPlatform) {
        super(name, version, osPlatform);
    }

    private Account account;

    @Override
    protected void setup(WebDriver webDriver, WebBrowser currentBrowser) {
        pageLogin = new PageLogin(webDriver, currentBrowser, this.pageCommon);
        pagedashboard = new PageDashboard(webDriver, currentBrowser, this.pageCommon);
        pageDemoUiComponents = new PageDemoUiComponents(webDriver, currentBrowser, this.pageCommon);
        account = accountManager.getAccount("admin");
    }

    @Override
    protected void run() {

    }

    @Override
    protected void cleanUp() {

    }
}
