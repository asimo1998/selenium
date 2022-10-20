package pageObjects.constants.locators;

import selenium.models.XpathLocator;

public class PageDashBoardLocator {
    public static final XpathLocator spanAdministrationDashboard = XpathLocator.create("//span[normalize-space()='Administration']");
    public static final XpathLocator spanUsersDashboard = XpathLocator.create("//span[@class='menu-title ng-star-inserted'][normalize-space()='Users']");
    public static final XpathLocator spanCreateNewUser = XpathLocator.create("//span[normalize-space()='Create new user']");
    public static final XpathLocator buttonCancelOnPopup = XpathLocator.create("//div[@class=\"modal-footer\"]//child::button[text()[normalize-space()=\"Cancel\"]]");

    public static final XpathLocator inputFirstNameOnPopup = XpathLocator.create("//input[@id='Name']");

    public static final XpathLocator inputSurNameOnPopup = XpathLocator.create("//input[@id='Surname']");

    public static final XpathLocator inputEmailOnPopup = XpathLocator.create("//input[@id='EmailAddress']");

    public static final XpathLocator inputUserNameOnPopup = XpathLocator.create("//input[@id='UserName']");

    public static final XpathLocator buttonSaveOnPopup = XpathLocator.create("//div[@class=\"modal-body\"]//following-sibling::div[@class=\"modal-footer\" and count(button)=2]/child::button[@type=\"submit\"]");

    public static final XpathLocator formVerifyAccountPopupIsDisplay = XpathLocator.create("//div[@style=\"display: grid;\"]");
    public static final XpathLocator formVerifyAccountPopupNotDisplay = XpathLocator.create("//div[@aria-labelledby=\"createOrEditModal\"]//child::form[count(div)=3]");

    public static final XpathLocator spanVerifyMessengerPopup = XpathLocator.create("//span[@class='text-white']");

    //tc3
    public static final XpathLocator inputSearchToolbar = XpathLocator.create("//div/div/input[@placeholder='Search...']");


    public static final XpathLocator buttonSubmitSearchToolbar = XpathLocator.create("//i[@aria-label=\"Search\"]//ancestor::button[@type=\"submit\"]");

    public static final XpathLocator buttonActons = XpathLocator.create("//button[@id=\"dropdownButton\" and normalize-space(text())=\"Actions\"]");

    public static final XpathLocator aDelete = XpathLocator.create("//a[normalize-space()='Delete']");

    public static final XpathLocator buttonYes = XpathLocator.create("//button[normalize-space()='Yes']");

    public static final XpathLocator p_sorticonSortSurname = XpathLocator.create("//p-sorticon[@field='surname']");

    public static final XpathLocator tdColumnSurname = XpathLocator.create("//tbody/tr/td[4]");

    public static final XpathLocator tdCreationTime = XpathLocator.create("//tbody/tr/td[9]");

    public static final XpathLocator spanVerifyUsername = XpathLocator.create("//a//ancestor::span[text()[normalize-space()=\"%s\"]]");

    public static final XpathLocator p_dropdownPerPaper = XpathLocator.create("//span[@id=\"pr_id_6_label\"]//ancestor::p-dropdown[@styleclass=\"p-paginator-rpp-options\"]");

    public static final XpathLocator spanPerPaperIndex = XpathLocator.create("//span[@class='ng-star-inserted'][normalize-space()= \"%s\"]");

}
