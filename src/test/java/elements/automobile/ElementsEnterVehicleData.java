package elements.automobile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementsEnterVehicleData {

    @FindBy(id = "startdate")
    protected WebElement startDate;
    @FindBy(id = "insurancesum")
    protected WebElement insuranceSum;
    @FindBy(id = "meritrating")
    protected WebElement meritRating;
    @FindBy(id = "damageinsurance")
    protected WebElement damageInsurance;

    //Pegando diretamente o elemento que será usado
    @FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]/span")
    protected WebElement optionalProducts;

    @FindBy(id = "courtesycar")
    protected WebElement courtesyCar;
    @FindBy(id = "nextselectpriceoption")
    protected WebElement btnNext;
}
