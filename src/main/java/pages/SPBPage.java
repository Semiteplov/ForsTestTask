package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SPBPage extends BasePage {
    @FindBy(xpath = "//*[contains(text(),'только с фото')]")
    private WebElement photoCheckBox;

    @FindBy(xpath = "//*[@class='search button button-origin']")
    private WebElement searchButton;

    @FindBy(id = "search")
    private WebElement searchInput;

    @FindBy(xpath = "//*[contains(text(),'По вашему запросу ничего не найдено')]")
    private WebElement noSearchResultMsg;

    @FindBy(xpath = "//*[@class='js-catalog_after-ads']/div")
    private List<WebElement> adList;

    final static String pathToAd = "//*[@class='js-catalog_after-ads']/div";

    public WebElement getPhotoCheckBox() {
        return photoCheckBox;
    }

    public WebElement getSearchInput() {
        return searchInput;
    }

    public WebElement getNoSearchResultMsg() {
        return noSearchResultMsg;
    }

    public List<WebElement> getAdList() {
        return adList;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public String getPathToAd() { return pathToAd; }
}
