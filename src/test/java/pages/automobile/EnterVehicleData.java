package pages.automobile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EnterVehicleData {

    WebDriver driver;

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

    public EnterVehicleData(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void preencheFormulario() throws InterruptedException {
        startDate.sendKeys("12/05/2022");
        Select somaSeguro = new Select(insuranceSum);
        somaSeguro.selectByVisibleText("5.000.000,00");
        Select avaliacaoMerito = new Select(meritRating);
        avaliacaoMerito.selectByVisibleText("Bonus 2");
        Select seguroDanos = new Select(damageInsurance);
        seguroDanos.selectByVisibleText("No Coverage");
        optionalProducts.click();
        Select carroCortesia = new Select(courtesyCar);
        carroCortesia.selectByVisibleText("Yes");
        btnNext.click();
        Thread.sleep(1000);
    }
}
