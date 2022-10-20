package pageObjects.constants.locators;

import selenium.models.XpathLocator;

public class PageLoginLocator {
    public static final XpathLocator inputUserNameLocator = XpathLocator.create("//input[@placeholder='User name or email *']");
    public static final XpathLocator inputPasswordLocator = XpathLocator.create("//input[@placeholder='Password *']");
    public static final XpathLocator buttonLoginButtonLocator = XpathLocator.create("//button[@type='submit']");
}
