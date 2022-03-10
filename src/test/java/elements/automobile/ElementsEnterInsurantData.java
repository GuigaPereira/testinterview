package elements.automobile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementsEnterInsurantData {

    @FindBy(id = "nav_automobile")
    protected WebElement menuAuto;
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
}
