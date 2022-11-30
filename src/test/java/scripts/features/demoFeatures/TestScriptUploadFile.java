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

import static pageObjects.constants.url.UrlPath.urlFile;


@Id(value = "Testcase-08")
@Name(value = "Test Upload file")
@Description(value = "Test upload file and check the screen")

public class TestScriptUploadFile extends TestScriptBase {
    @Factory(dataProvider = "dataProvider")

    public TestScriptUploadFile(String name, String version, String osPlatform) {
        super(name, version, osPlatform);
    }

    private Account account;
    private String expectResult = "32-1-sao-ch-p.jpg - 117294 bytes";
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

        pageDemoUiComponents.clickOnDemoUiComponentSidebar();

        pageDemoUiComponents.clickOnButtonChoose();

        pageDemoUiComponents.uploadFile(urlFile);

        pageDemoUiComponents.clickOnButtonUpload();

        pageDemoUiComponents.verifyFileUploadSuccessfully(expectResult);
    }

    @Override
    protected void cleanUp() {

    }
}
