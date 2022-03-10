package elements.automobile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementsSendQuote {

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
}
