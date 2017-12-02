package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    @FindBy(xpath = "//*[contains(text(),'Санкт-Петербург')]")
    private WebElement buttonSPB;

    public WebElement getButtonSPB() {
        return buttonSPB;
    }

}
