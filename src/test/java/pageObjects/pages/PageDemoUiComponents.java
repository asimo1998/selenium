package pageObjects.pages;

import configuration.models.WebBrowser;
import library.system.Sleep;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.base.PageObjectBase;
import pageObjects.constants.locators.PageDemoUiComponentsLocator;


public class PageDemoUiComponents extends PageObjectBase {

    public PageDemoUiComponents(WebDriver webDriver, WebBrowser currentBrowser) {
        super(webDriver, currentBrowser);
    }

    public PageDemoUiComponents(WebDriver webDriver, WebBrowser currentBrowser, PageCommon pageCommon) {
        super(webDriver, currentBrowser, pageCommon);
    }

    public void clickOnDemoUiComponentSidebar() {
        Sleep.refreshTime();
        clickElement(PageDemoUiComponentsLocator.spanDemoUiComponentsSidebar);
    }

    public void enterDateTimePicker(String datetime) {
        Sleep.refreshTime();
        enterText(PageDemoUiComponentsLocator.inputDefaultDateAndTimePicker, datetime);
    }

    public void clickOnDateTimePickerSubmit() {
        Sleep.refreshTime();
        clickElement(PageDemoUiComponentsLocator.buttonSubmitDefaultDateAndTimePicker);
    }

    public void clickOnButtonOkInPopup() {
        Sleep.refreshTime();
        clickElement(PageDemoUiComponentsLocator.buttonOkOnPopup);
    }

    public void clickOnButtonChoose() {
        waitElementDisplayed(PageDemoUiComponentsLocator.buttonChoose, 5);
        clickElement(PageDemoUiComponentsLocator.buttonChoose);
    }

    public void uploadFile(String url) {
        importFile(url);
    }

    public void clickOnButtonUpload() {
        waitElementDisplayed(PageDemoUiComponentsLocator.spanUpload, 5);
        clickElement(PageDemoUiComponentsLocator.spanUpload);
    }

    public void verifyFileUploadSuccessfully(String expectResult) {
        waitElementDisplayed(PageDemoUiComponentsLocator.liFileUpdateContent,10);
        String actualResult = getText(PageDemoUiComponentsLocator.liFileUpdateContent);
        Assert.assertEquals(actualResult, expectResult);
    }
}
