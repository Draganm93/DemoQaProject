package demoqa.pages.bookstoreapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfilePage {
    WebDriver driver;
    WebDriverWait wdwait;
    Actions actions;

    By bookStoreBtn = By.id("gotoStore");
    By deleteAccBtn = By.id("submit");
    By delAllBooks = By.cssSelector("body > div:nth-child(7) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(4) > div:nth-child(3) > button:nth-child(1)");
    By searchBox = By.id("searchBox");
    By logoutBtn = By.xpath("//div[@class='text-right col-md-5 col-sm-12']//button[@id='submit']");

    By loginPageLink = By.cssSelector("body > div:nth-child(6) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(6) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(1)");

    By profilePageLink = By.xpath("//div[@class='element-list collapse show']//li[@id='item-3']");

    public ProfilePage(WebDriver driver, WebDriverWait wdwait, Actions actions) {
        this.driver = driver;
        this.wdwait = wdwait;
        this.actions = actions;
    }

    public WebElement getbookStoreBtn() {
        return driver.findElement(bookStoreBtn);
    }

    public WebElement getDeleteAccBtn() {
        return driver.findElement(deleteAccBtn);
    }

    public WebElement getDeleteAllBooksBtn() {
        return driver.findElement(delAllBooks);
    }

    public WebElement getSearchBox() {
        return driver.findElement(searchBox);
    }

    public WebElement getLogOutBtn() {
        return driver.findElement(logoutBtn);
    }

    public WebElement getLoginLink() {
        return driver.findElement(loginPageLink);
    }

    public WebElement getProfileLink() {
        return driver.findElement(profilePageLink);
    }

    public void clickBookStoreBtn() {
        getbookStoreBtn().click();
    }

    public void clickDeleteAccBtn() {
        getDeleteAccBtn().click();
    }

    public void clickOnDeleteAllBooksBtn() {
        getDeleteAllBooksBtn().click();
    }

    public void inputInSearchBox(String input) {
        getSearchBox().sendKeys(input);
    }

    public void clickOnLogOutBtn() {
        getLogOutBtn().click();
    }
}
