package demoqa.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicProperties {
    WebDriver driver;
    WebDriverWait wdwait;
    Actions actions;

    By dynamicLink = By.id("item-8");
    By enableAfter = By.id("enableAfter");
    By colorChange = By.id("colorChange");
    By visibleAfter = By.id("visibleAfter");

    public DynamicProperties(WebDriver driver, WebDriverWait wdwait, Actions actions) {
        this.driver = driver;
        this.wdwait = wdwait;
        this.actions = actions;
    }

    public WebElement getDynamicLink() {
        return  driver.findElement(dynamicLink);
    }

    public WebElement getEnableAfter() {
        return driver.findElement(enableAfter);
    }

    public WebElement getColorChange() {
        return driver.findElement(colorChange);
    }

    public WebElement getVisibleAfter() {
        return driver.findElement(visibleAfter);
    }
}

