package pages.automobile;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SendQuote {

    WebDriver driver;

    @FindBy(id = "email")
    protected WebElement email;
    @FindBy(id = "phone")
    protected WebElement phone;
    @FindBy(id = "username")
    protected WebElement username;
    @FindBy(id = "password")
    protected WebElement password;
    @FindBy(id = "confirmpassword")
    protected WebElement confirmPassword;
    @FindBy(id = "Comments")
    protected WebElement comments;
    @FindBy(id = "sendemail")
    protected WebElement btnSendEmail;
    @FindBy(xpath = "/html/body/*/h2")
    protected WebElement mensagem;
    @FindBy(xpath = "//button[text()=\"OK\"]")
    protected WebElement btnOk;

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
        btnSendEmail.click();
        Thread.sleep(1000);
    }

    public void validaMensagem() throws InterruptedException {
        mensagem.isDisplayed();
        String message = mensagem.getText();
        Thread.sleep(1000);
        Assert.assertEquals("Sending e-mail success!", message);
        btnOk.click();
    }
}
