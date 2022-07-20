package demoqa.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrokenLinks {
    WebDriver driver;
    WebDriverWait wdwait;
    Actions actions;

    By mainHeader = By.className("main-header");
    By brokenImg = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/img[2]");
    By validLink = By.linkText("Click Here for Valid Link");
    By brokenLink = By.linkText("Click Here for Broken Link");

    By brokenLinksLink = By.id("item-6");

    public BrokenLinks(WebDriver driver, WebDriverWait wdwait, Actions actions) {
        this.driver = driver;
        this.wdwait = wdwait;
        this.actions = actions;
    }


    public WebElement getBrokenLinksLink() {
        return driver.findElement(brokenLinksLink);
    }
    public WebElement getMainHeader() {
        return driver.findElement(mainHeader);
    }

    public WebElement getBrokenImg() {
        return driver.findElement(brokenImg);
    }

    public WebElement getValidLink() {
        return driver.findElement(validLink);
    }

    public WebElement getBrokenLink() {
        return driver.findElement(brokenLink);
    }

    public boolean isBrokenImgDisplayed() {
        return getBrokenImg().isDisplayed();
    }

    public void clickOnValidLink() {
        getValidLink().click();
    }

    public void clickOnBrokenLink() {
        getBrokenLink().click();
    }
}
