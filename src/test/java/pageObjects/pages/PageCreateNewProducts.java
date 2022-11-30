package pageObjects.pages;

import configuration.models.WebBrowser;
import org.openqa.selenium.WebDriver;
import pageObjects.base.PageObjectBase;
import pageObjects.constants.locators.PageNewCreateNewProductsLocator;

public class PageCreateNewProducts extends PageObjectBase {
    public PageCreateNewProducts(WebDriver webDriver, WebBrowser currentBrowser) {
        super(webDriver, currentBrowser);
    }

    public void clickOnDropdowMenuCategory() {
        waitElementDisplayed(PageNewCreateNewProductsLocator.productsDropdowTaskbar, 10);
        clickElement(PageNewCreateNewProductsLocator.productsDropdowTaskbar);

        waitElementDisplayed(PageNewCreateNewProductsLocator.categorySubItem, 10);
        clickElement(PageNewCreateNewProductsLocator.categorySubItem);
    }
}
