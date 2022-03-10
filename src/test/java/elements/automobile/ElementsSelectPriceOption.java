package elements.automobile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementsSelectPriceOption {

    @FindBy(xpath = "//*[text()=\"Platinum\"]")
    protected WebElement platinum;

    //Pegando diretamente o elemento que será marcado
    @FindBy(xpath = "//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[3]/span")
    protected WebElement option;

    @FindBy(id = "nextsendquote")
    protected WebElement btnNext;
}
