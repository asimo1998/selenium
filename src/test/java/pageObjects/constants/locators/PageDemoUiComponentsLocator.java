package pageObjects.constants.locators;

import selenium.models.XpathLocator;

public class PageDemoUiComponentsLocator {
    public static final XpathLocator spanDemoUiComponentsSidebar = XpathLocator.create("//span[normalize-space()='Demo UI Components']");

    public static final XpathLocator inputDefaultDateAndTimePicker = XpathLocator.create("//input[@id='SampleDatePicker']");

    public static final XpathLocator buttonOkOnPopup = XpathLocator.create("//button[normalize-space()='Ok']");
    public static final XpathLocator buttonSubmitDefaultDateAndTimePicker = XpathLocator.create("//div[contains(@class,\"col-md-9\")]//following-sibling::div[contains(@class,\"col-md-3\")]/button");
    public static final XpathLocator buttonChoose = XpathLocator.create("//span[contains(text(),'Choose')]");

    public static final XpathLocator spanUpload = XpathLocator.create("//div[@class=\"p-fileupload-buttonbar\"]//child::button/span[text()[normalize-space()=\"Upload\"]]");

    public static final XpathLocator liFileUpdateContent = XpathLocator.create("//p-fileupload[@id=\"DefaultFileUploadFileInput\"]//child::li");
}
