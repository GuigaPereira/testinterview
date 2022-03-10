package pages.automobile;

import elements.automobile.ElementsEnterVehicleData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EnterVehicleData extends ElementsEnterVehicleData {

    WebDriver driver;

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
        Thread.sleep(1000);
        btnNext.click();
        Thread.sleep(1000);
    }
}
