package scripts.features.kiotvietFeatures;

import configuration.models.WebBrowser;
import net.bytebuddy.utility.nullability.MaybeNull;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Factory;
import pageObjects.pages.PageCreateNewProducts;
import pageObjects.pages.PageLogin;
import pageObjects.pages.PageLoginKiotviet;
import scripts.base.TestScriptBase;
import testng.annotations.Description;
import testng.annotations.Id;
import testng.annotations.Name;

@Id(value = "")
@Name(value = "")
@Description(value = "")
public class CreateNewProducts extends TestScriptBase {
    private String domain ="nhagochienthang";
    private String userName ="0854124589";
    private String password = "kiotviet123456";
    @Factory(dataProvider = "dataProvider")
    public CreateNewProducts(String name, String version, String osPlatform){
        super(name, version, osPlatform);
    }
    @Override
    protected void setup(WebDriver webDriver, WebBrowser currentBrowser) {
        pageLoginKiotviet = new PageLoginKiotviet(webDriver,currentBrowser);
        pageCreateNewProducts = new PageCreateNewProducts(webDriver, currentBrowser);
    }

    @Override
    protected void run() {
        pageLoginKiotviet.loginKiotviet(domain, userName, password);
        pageCreateNewProducts.clickOnDropdowMenuCategory();
        pageCreateNewProducts.clickOnAddProducts();
    }

    @Override
    protected void cleanUp() {

    }
}
