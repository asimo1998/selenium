package scripts.features.kiotvietFeatures;

import configuration.models.Account;
import configuration.models.WebBrowser;
import library.random.RandomString;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Factory;
import pageObjects.pages.PageDashboard;
import pageObjects.pages.PageDemoUiComponents;
import pageObjects.pages.PageLogin;
import pageObjects.pages.PageLoginKiotviet;
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
        account = accountManager.getAccount("admin");
        pageLoginKiotviet = new PageLoginKiotviet(webDriver, currentBrowser);
    }

    @Override
    protected void run() {
        pageLoginKiotviet.clickOnButtonLogin();
        pageLoginKiotviet.enterDomainShop("nhagochienthang");
        pageLoginKiotviet.clickOnButtonEnterTheShop();
        pageLoginKiotviet.enterUserName("0854124589");
        pageLoginKiotviet.enterPassword("kiotviet123456");
        pageLoginKiotviet.clickOnButtonManage();
        pageLoginKiotviet.verifyTaskbarOverviewIsDisplay();
    }

    @Override
    protected void cleanUp() {

    }
}
