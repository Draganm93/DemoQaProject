package demoqa.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Links {
    WebDriver driver;
    WebDriverWait wdwait;

    Actions actions;

    By linksLink = By.id("item-5");
    By mainHeader = By.className("main-header");
    By simpleLink = By.id("simpleLink");
    By dynamicLink = By.id("dynamicLink");
    By created = By.id("created");
    By noContent = By.id("no-content");
    By moved = By.id("moved");
    By badRequest = By.id("bad-request");
    By unauthorized = By.id("unauthorized");
    By forbidden = By.id("forbidden");
    By invalidUrl = By.id("invalid-url");
    By linkResponse = By.cssSelector("#linkResponse");

    public Links(WebDriver driver, WebDriverWait wdwait, Actions actions) {
        this.driver = driver;
        this.wdwait = wdwait;
        this.actions = actions;
    }

    public WebElement getLinksLink() {
        return driver.findElement(linksLink);
    }

    public WebElement getmainHeader() {
        return driver.findElement(mainHeader);
    }

    public WebElement getSimpleLink() {
        return driver.findElement(simpleLink);
    }

    public WebElement getDynamicLink() {
        return driver.findElement(dynamicLink);
    }

    public WebElement getCreated() {
        return driver.findElement(created);
    }

    public WebElement getNoContent() {
        return driver.findElement(noContent);
    }

    public WebElement getMoved() {
        return driver.findElement(moved);
    }

    public WebElement getBadRequest() {
        return driver.findElement(badRequest);
    }

    public WebElement getUnauthorized() {
        return driver.findElement(unauthorized);
    }

    public WebElement getForbidden() {
        return driver.findElement(forbidden);
    }

    public WebElement getInvalidUrl() {
        return driver.findElement(invalidUrl);
    }

    public WebElement getLinkResponse() {
        return  driver.findElement(linkResponse);
    }

    public boolean isLinkHeaderDisplayed() {
        return getmainHeader().isDisplayed();
    };

    public void clickOnSimpleLink() {
        getSimpleLink().click();
    }

    public void clickOnDynamicLink() {
        getDynamicLink().click();
    }

    public void clickOnCreatedLink() {
        getCreated().click();
    }

    public void clickOnNoContentLink() {
        getNoContent().click();
    }

    public void clickOnMovedLink() {
        getMoved().click();
    }

    public void clickOnBadRequest() {
        getBadRequest().click();
    }

    public void clickOnUnauthorizedLink() {
        getUnauthorized().click();
    }

    public void clickOnForbiddenLink() {
        getForbidden().click();
    }

    public void clickOnInvalidUrl() {
        getInvalidUrl().click();
    }
}
