package pageObjects.constants.locators;

import com.sun.org.apache.xml.internal.security.utils.XalanXPathAPI;
import selenium.models.XpathLocator;

public class PageLoginKiotvietLocator {
    public static final XpathLocator buttonLogin = XpathLocator.create("//a[normalize-space()='Đăng nhập']");
    public static final XpathLocator inputDomainShop = XpathLocator.create("//input[@id='kvs']");
    public static final XpathLocator buttonEnterTheShop = XpathLocator.create("//button[normalize-space()='Vào Cửa Hàng']");
    public static final XpathLocator inputUsername = XpathLocator.create("//input[@id='UserName']");
    public static final XpathLocator inputPassword = XpathLocator.create("//ipnput[@id='Password']");
    public static final XpathLocator checkboxKeepLogin = XpathLocator.create("//input[@id='RememberMe']");
    public static final XpathLocator buttonManage = XpathLocator.create("//input[@value='Quản lý']");
    public static final XpathLocator verifyTaskbarOverview = XpathLocator.create("//ul[@class='menu']//child::a[normalize-space()='Tổng quan']");
}
