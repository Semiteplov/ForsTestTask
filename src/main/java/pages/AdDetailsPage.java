package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdDetailsPage extends BasePage {
    @FindBy(xpath = "//*[@class='item-view']/div[2]//*[@id='price-value']")
    private WebElement adValue;

    public void setAdValue(WebElement adValue) {
        this.adValue = adValue;
    }


}
