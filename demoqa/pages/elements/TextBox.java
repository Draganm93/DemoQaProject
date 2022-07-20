package demoqa.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TextBox {
    public final String url = "https://demoqa.com/text-box";
    public WebDriver driver;
    public WebDriverWait wdwait;

    By fullName = By.id("userName");
    By email = By.id("userEmail");
    By currAddress = By.id("currentAddress");
    By permAddress = By.id("permanentAddress");
    By submitBtn = By.id("submit");

    By textBoxLink = By.id("item-0");

    public TextBox(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getTextBoxLink() {return driver.findElement(textBoxLink);}
    public WebElement getFullName() {
        return driver.findElement(fullName);
    }

    public WebElement getEmail() {
        return driver.findElement(email);
    }

    public WebElement getCurrAddress() {
        return driver.findElement(currAddress);
    }

    public WebElement getPerrAddress() {
        return driver.findElement(permAddress);
    }

    public WebElement getSubmitBtn() {
        return driver.findElement(submitBtn);
    }

    public void enterfullName(String fullname) {
        getFullName().sendKeys(fullname);
    }

    public void enterEmail(String mail) {
        getEmail().sendKeys(mail);
    }

    public void enterCurrAddress(String address) {
        getCurrAddress().sendKeys(address);
    }

    public void enterPerrAddress(String address) {
        getPerrAddress().sendKeys(address);
    }

    public void clickSubmit() {
        getSubmitBtn().submit();
    }
}
