package actions;

import org.openqa.selenium.support.PageFactory;
import pages.HomePage;

public class HomeActions extends BaseActions {
    private static final String HOME_PAGE_URL = "https://www.avito.ru/";

    private static HomePage page =
            PageFactory.initElements(getDriver(), HomePage.class);

    public static void openHomePage() {
        getDriver().navigate().to(HOME_PAGE_URL);
        page.pageIsLoaded(getDriver());
    }

    public static void clickFieldSPB() {
        page.getButtonSPB().click();
    }

}