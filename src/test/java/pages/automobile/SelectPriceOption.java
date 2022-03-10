package pages.automobile;

import elements.automobile.ElementsSelectPriceOption;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SelectPriceOption extends ElementsSelectPriceOption {

    WebDriver driver;

    public SelectPriceOption(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void selecionarPreco() throws InterruptedException {
        platinum.isDisplayed();
        option.click();
        btnNext.click();
        Thread.sleep(1000);
    }
}
