package pages.automobile;

import elements.automobile.ElementsEnterProductData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EnterProductData extends ElementsEnterProductData {

    WebDriver driver;

    public EnterProductData(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void preencheFormulario() throws InterruptedException {
        firstName.sendKeys("Guilherme");
        lastName.sendKeys("Pereira");
        birthDate.sendKeys("11/05/1991");
        genderMale.click();
        streetAddress.sendKeys("Rua dos Lopes");
        Select ct = new Select(country);
        ct.selectByVisibleText("Brazil");
        zipCode.sendKeys("25922460");
        city.sendKeys("Magé");
        Select ocupacao = new Select(occupation);
        ocupacao.selectByVisibleText("Employee");
        cliffDiving.click();
        website.sendKeys("www.teste.com.br");
        btnNext.click();
        Thread.sleep(1000);

    }
}
