import actions.BaseActions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import static actions.HomeActions.*;
import static actions.SPBPageActions.*;

public class TestTest {

    @Test(groups = "openSite",
            description = "Открыть сайт и выбрать город СПБ")
    public void openSite() {
        openHomePage();
        clickFieldSPB();
        checkPageLoad();
    }

    @Test(groups = "findNotExistingAd",
            dependsOnGroups = "openSite",
            description = "Найти несуществующий товар с фото")
    public void findWrongAd() {
        findPAds(true, "Рлвдыоа Hjsdfk 124456");
        checkNotFoundMsg();
    }

    @Test(groups = "findExistingAd",
            dependsOnGroups = "findNotExistingAd",
            description = "Найти существующий товар с заданными параметрами поиска")
    public void findRightAd() {
        findPAds(false, "MacBook pro");
        findAdsWithParametres("Вчера", 50000, 100000);
    }

    @AfterClass
    public static void tearDown() throws Exception {
        BaseActions.getDriver().quit();
    }


}
