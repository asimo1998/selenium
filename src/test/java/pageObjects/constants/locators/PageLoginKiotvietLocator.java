package pageObjects.constants.locators;
import selenium.models.XpathLocator;

public class PageLoginKiotvietLocator {
    public static final XpathLocator buttonLogin = XpathLocator.create("//a[@class='btn btn-primary btn-sm']");
    public static final XpathLocator inputDomainShop = XpathLocator.create("//input[@id='kvs']");
    public static final XpathLocator buttonEnterTheShop = XpathLocator.create("//button[@class='step-login kv-login btn btn-primary']");
    public static final XpathLocator inputUsername = XpathLocator.create("//input[@id='UserName']");
    public static final XpathLocator inputPassword = XpathLocator.create("//input[@id='Password']");
    public static final XpathLocator checkboxKeepLogin = XpathLocator.create("//input[@id='RememberMe']");
    public static final XpathLocator buttonManage = XpathLocator.create("//input[@type='submit']");
    public static final XpathLocator verifyTaskbarOverview = XpathLocator.create("//a[@class='ng-binding active']");

}