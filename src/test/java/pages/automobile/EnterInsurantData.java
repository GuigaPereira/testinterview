package pages.automobile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EnterInsurantData {

    WebDriver driver;

    @FindBy(id = "nav_automobile")
    protected  WebElement menuAuto;
    @FindBy(id = "make")
    protected WebElement make;
    @FindBy(id = "engineperformance")
    protected WebElement enginePerformance;
    @FindBy(id = "dateofmanufacture")
    protected WebElement dateOfManufacture;
    @FindBy(id = "numberofseats")
    protected WebElement numberOfSeats;
    @FindBy(id = "fuel")
    protected WebElement fuelType;
    @FindBy(id = "listprice")
    protected WebElement listPrice;
    @FindBy(id = "licenseplatenumber")
    protected WebElement licensePlateNumber;
    @FindBy(id = "annualmileage")
    protected WebElement annualMileage;
    @FindBy(id = "nextenterinsurantdata")
    protected  WebElement btnNext;

    public EnterInsurantData(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void preencheFormulario() throws InterruptedException {
        menuAuto.click();
        Thread.sleep(1000);
        Select mk = new Select(make);
        mk.selectByVisibleText("Audi");
        enginePerformance.sendKeys("100");
        dateOfManufacture.sendKeys("03/04/2022");
        Select numOfSea = new Select(numberOfSeats);
        numOfSea.selectByVisibleText("5");
        Select ft = new Select(fuelType);
        ft.selectByVisibleText("Gas");
        listPrice.sendKeys("10000");
        licensePlateNumber.sendKeys("Teste");
        annualMileage.sendKeys("1000");
        btnNext.click();
        Thread.sleep(1000);
    }
}
