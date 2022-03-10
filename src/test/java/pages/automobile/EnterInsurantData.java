package pages.automobile;

import elements.automobile.ElementsEnterInsurantData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EnterInsurantData extends ElementsEnterInsurantData {

    WebDriver driver;

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
