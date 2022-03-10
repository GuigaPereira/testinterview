package elements.automobile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementsEnterProductData {

    @FindBy(id = "firstname")
    protected WebElement firstName;
    @FindBy(id = "lastname")
    protected WebElement lastName;
    @FindBy(id = "birthdate")
    protected WebElement birthDate;

    // Pegando somente o elemento que será marcado
    @FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span")
    protected WebElement genderMale;

    @FindBy(id = "streetaddress")
    protected WebElement streetAddress;
    @FindBy(id = "country")
    protected WebElement country;
    @FindBy(id = "zipcode")
    protected WebElement zipCode;
    @FindBy(id = "city")
    protected WebElement city;
    @FindBy(id = "occupation")
    protected WebElement occupation;

    // Pegando somente o elemento que será marcado
    @FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[3]/span")
    protected  WebElement cliffDiving;

    @FindBy(id = "website")
    protected  WebElement website;

    /*Obs.: Pra automatizar a inclusão de um arquivo no campo seria necessario a inclusão de uma ferramenta
    de script que manipulasse a GUI do windows como o AutoIt*/
    @FindBy(id = "picture")
    protected  WebElement picture;
    @FindBy(id = "open")
    protected  WebElement btnOpen;

    @FindBy(id = "nextenterproductdata")
    protected  WebElement btnNext;

}
