package pages.automobile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectPriceOption {

    WebDriver driver;

    @FindBy(xpath = "//*[text()=\"Platinum\"]")
    protected WebElement platinum;

    //Pegando diretamente o elemento que será marcado
    @FindBy(xpath = "//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[3]/span")
    protected WebElement option;

    @FindBy(id = "nextsendquote")
    protected WebElement btnNext;

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
