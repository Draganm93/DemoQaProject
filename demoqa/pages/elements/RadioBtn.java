package demoqa.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class RadioBtn {
    WebDriver driver;
    WebDriverWait wdwait;
    By yesRadio = By.cssSelector("label[for='yesRadio']");
    By impressiveRadio = By.cssSelector("label[for='impressiveRadio']");
    By noRadio = By.cssSelector("#noRadio");
    By message = By.className("mt-3");
    By successTxt = By.className("text-success");

    By radioBtnLink = By.id("item-2");

    public RadioBtn(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getYesRadio() {
        return driver.findElement(yesRadio);
    }

    public WebElement getImepressiveRadio() {
        return driver.findElement(impressiveRadio);
    }

    public WebElement getNoRadio() {
        return driver.findElement(noRadio);
    }

    public WebElement getMessageEl() {
        return driver.findElement(message);
    }

    public WebElement getSuccessEl() {
        return driver.findElement(successTxt);
    }

    public WebElement getRadioBtnLink(){
        return driver.findElement(radioBtnLink);
    }

    public List<WebElement> allEnabledRadioBtns() {
        List<WebElement> allRadioBtns = new ArrayList<>();
        allRadioBtns.add(driver.findElement(yesRadio));
        allRadioBtns.add(driver.findElement(impressiveRadio));
        return allRadioBtns;
    }

    public void clickYes() {
        getYesRadio().click();
    }

    public void clickImpressive() {
        getImepressiveRadio().click();
    }

    public boolean checkIsNoDisabled() {
        return getNoRadio().isEnabled();
    }


    public String getMessage() {
        return getMessageEl().getText();
    }

    public String getSuccessTxt() {
        return getSuccessEl().getText();
    }


}
