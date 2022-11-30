package pageObjects.constants.locators;

import selenium.models.XpathLocator;

public class PageNewCreateNewProductsLocator {
    public static final XpathLocator categorySubItem = XpathLocator.create("//ul[contains(@class,'sub ng-scope')]//i[contains(@class,'fa-fw fa fa-th')]");
    public static final XpathLocator productsDropdowTaskbar = XpathLocator.create("//li[@class='ng-scope']//child::i[contains(@class,'fas fa-cube')]");

    public static final XpathLocator addNewProducts = XpathLocator.create("//div[@class='addProductBtn']");

    public static final XpathLocator addProducts = XpathLocator.create("//a[@class='ng-binding']//i[contains(@class,'far fa-fw fa-plus')][1]");

    public static final XpathLocator saveProduct = XpathLocator.create("//a[@ng-click='SaveProduct()']");

    public static final XpathLocator notificationCreateProduct = XpathLocator.create("//div[@class='toast-message']");
}


