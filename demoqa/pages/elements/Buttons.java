package demoqa.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Buttons {
    WebDriver driver;
    WebDriverWait wdwait;

    Actions actions;

    By buttonsLink = By.cssSelector("#item-4");
    By doubleClick = By.id("doubleClickBtn");
    By rightClick = By.id("rightClickBtn");
    By normalClick = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]/button[1]");

    By doubleClickMsg = By.id("doubleClickMessage");
    By rightClickMsg = By.id("rightClickMessage");
    By dynamicClickMsg = By.id("dynamicClickMessage");

    public Buttons(WebDriver driver, WebDriverWait wdwait, Actions actions) {
        this.driver = driver;
        this.wdwait = wdwait;
        this.actions = actions;
    }

    public WebElement getDoubleClickEl() {
        return driver.findElement(doubleClick);
    }

    public WebElement getRightClick() {
        return driver.findElement(rightClick);
    }

    public WebElement getNormalClickBtn() {
        return driver.findElement(normalClick);
    }

    public WebElement getButtonsLink() {
        return driver.findElement(buttonsLink);
    }

    public WebElement getDoubleMsg() {
        return driver.findElement(doubleClickMsg);
    }

    public WebElement getRightMsg() {
        return driver.findElement(rightClickMsg);
    }

    public WebElement getDynamicMsg() {
        return driver.findElement(dynamicClickMsg);
    }

    public void clickDoubleClickButton() {
        actions.doubleClick(getDoubleClickEl()).perform();
    }

    public void rightClickButtonAction() {
        actions.contextClick(getRightClick()).perform();
    }

    public void normalBtnAction() {
        getNormalClickBtn().click();
    }


}
