package actions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import pages.SPBPage;

public class SPBPageActions extends  BaseActions {
    private static SPBPage page =
            PageFactory.initElements(getDriver(), SPBPage.class);

    public static void checkPageLoad() {
        assert page.pageIsLoaded(getDriver());
    }

    public static void findPAds(boolean photoChBox, String value) {
        if(photoChBox == true) {
            if(!page.getPhotoCheckBox().isSelected()) {
                page.getPhotoCheckBox().click();
            }
        } else {
            if(page.getPhotoCheckBox().isSelected()) {
                page.getPhotoCheckBox().click();
            }
        }
        page.getSearchInput().clear();
        page.getSearchInput().sendKeys(value);
        page.getSearchButton().click();
    }

    public static void checkNotFoundMsg() {
        Assert.assertTrue(page.getNoSearchResultMsg().isDisplayed());
    }

    public static void findAdsWithParametres(String date, int lowestPrice, int highestPrice) {
        int i = 0;
        String dateOfAd = "";
        String priceStr = "";
        String path = "";

        for (i = 3;i < page.getAdList().size(); i++) {
            dateOfAd = page.getPathToAd().concat("[" + i + "]//*[contains(text(),'" + date + "')]");
            priceStr = page.getPathToAd().concat("[" + i + "]//*[@class='about']");
            path = page.getPathToAd().concat("[" + i + "]");
            page.scrollToElement(getDriver(), getDriver().findElement(By.xpath(path)));

            if((page.isElementPresent(getDriver(), getDriver().findElement(By.xpath(dateOfAd))))
                    && (Integer.parseInt(getDriver().findElement(By.xpath(priceStr)).getText().replaceAll("[^0-9]", "")) > lowestPrice)
                    && (Integer.parseInt(getDriver().findElement(By.xpath(priceStr)).getText().replaceAll("[^0-9]", "")) < highestPrice)) {
                String title = priceStr.concat("/../h3");
                getDriver().findElement(By.xpath(title)).click();
                break;
            } else continue;
        }
    }

    public static boolean checkPrice(int lowestPrice, int highestPrice) {
        if((Integer.parseInt(page.getPrice().getText().replaceAll("[^0-9]", "")) > lowestPrice)
                && (Integer.parseInt(page.getPrice().getText().replaceAll("[^0-9]", "")) < highestPrice)) {
            return true;
        } else return false;
    }

}
