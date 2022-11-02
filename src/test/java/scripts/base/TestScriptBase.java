package scripts.base;

import configuration.models.WebBrowser;
import org.testng.annotations.Test;
import pageObjects.pages.*;
import testng.TestRunner;
import org.openqa.selenium.WebDriver;

public abstract class TestScriptBase extends TestRunner {
    public TestScriptBase(String name, String version, String osPlatform) {
        super(name, version, osPlatform);
    }

    protected PageCommon pageCommon;
    protected PageTestLesson7 pageTestLesson7;

    protected PageLogin pageLogin;

    protected PageDashboard pagedashboard;

    protected PageDemoUiComponents pageDemoUiComponents;

    protected PageLoginKiotviet pageLoginKiotviet;

    @Override
    protected final void beforeSetup(WebDriver webDriver, WebBrowser currentBrowser) {
        // Only create instance for page common here
        pageCommon = new PageCommon(webDriver, currentBrowser);
    }
}
