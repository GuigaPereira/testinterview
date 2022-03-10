package tests.automabile;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.automobile.*;

import java.util.concurrent.TimeUnit;

public class StepsAutomobile {
    String driverPath = "src\\main\\resources\\drives\\chromedriver.exe";

    WebDriver driver;

    @Before
    public void setup() {

        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://sampleapp.tricentis.com/101/app.php");
    }

    @Given("que preencho o formulario da aba Enter Vehicle Data")
    public void preencherFormularioEnterVehicleDataAut() throws InterruptedException {
        EnterInsurantData enterInsurantData = new EnterInsurantData(driver);
        enterInsurantData.preencheFormulario();
    }
    
    @And ("preencho o formulario da aba Enter Insurant Data")
    public void preencherFormularioEnterInsurantDataAut() throws InterruptedException {
        EnterProductData enterProductData = new EnterProductData(driver);
        enterProductData.preencheFormulario();
    }
    
    @And ("preencho o formulario da aba Enter Product Data")
    public void preencherFormularioEnterProductDataAut() throws InterruptedException {
        EnterVehicleData enterVehicleData = new EnterVehicleData(driver);
        enterVehicleData.preencheFormulario();
    }
    
    @And ("preencho o formulario da aba Select Price Option")
    public void preencherFormularioSelectPriceOptionAut() throws InterruptedException {
        SelectPriceOption selectPriceOption = new SelectPriceOption(driver);
        selectPriceOption.selecionarPreco();
    }
    
    @And ("preencho o formulario da aba Send Quote")
    public void preencherFormularioSendQuoteAut() throws InterruptedException {
        SendQuote sendQuote = new SendQuote(driver);
        sendQuote.preencherFormulario();

    }
    
    @Then("verifico a mensagem de sucesso")
    public void verificarMensagemDeSucessoAut() throws InterruptedException {
        SendQuote sendQuote = new SendQuote(driver);
        sendQuote.validaMensagem();
    }

    @After
    public void close() {
        driver.close();
    }
}
