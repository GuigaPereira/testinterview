package pages.automobile;

import elements.automobile.ElementsSendQuote;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SendQuote extends ElementsSendQuote {

    WebDriver driver;

    public SendQuote(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void preencherFormulario() throws InterruptedException {
        email.sendKeys("guig4byte@gmail.com");
        phone.sendKeys("21984429982");
        username.sendKeys("Guilherme");
        password.sendKeys("1Asdfg");
        confirmPassword.sendKeys("1Asdfg");
        comments.sendKeys("Teste");
        Thread.sleep(1000);
        btnSendEmail.click();
    }

    public void validaMensagem() throws InterruptedException {
        mensagem.isDisplayed();
        String message = mensagem.getText();
        Thread.sleep(1000);
        Assert.assertEquals("Sending e-mail success!", message);
        btnOk.click();
    }
}
