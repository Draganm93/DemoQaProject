package demoqa.pages.bookstoreapp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BookStorePage {
    WebDriver driver;
    WebDriverWait wdwait;
    Actions actions;

    By bookStoreLink = By.xpath("//span[normalize-space()='Book Store']");
    By searchBox = By.id("searchBox");
    By loginBtn = By.id("login");
    By booksStore = By.cssSelector("#title-wrapper #userName-value");;
    public BookStorePage(WebDriver driver, WebDriverWait wdwait, Actions actions) {
        this.driver = driver;
        this.wdwait = wdwait;
        this.actions = actions;
    }


    public WebElement getBookStorLink() {
        javaExecutorScrollIntoView(bookStoreLink);
        return driver.findElement(bookStoreLink);
    }

    public WebElement getSearchBox() {
        return driver.findElement(searchBox);
    }

    public WebElement getLoginBtn() {
        return driver.findElement(loginBtn);
    }

    public List<WebElement> getBookStore() {
        return driver.findElements(booksStore);
    }

    public void javaExecutorScrollIntoView(By locator) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView()", driver.findElement(locator));
    }

    public void clickOnBookByInt(int i) {
        getBookStore().get(i).click();
    }
}
