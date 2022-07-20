package demoqa.pages.bookstoreapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    WebDriver driver;
    WebDriverWait wdwait;
    Actions actions;
    By userName = By.cssSelector("#userName");
    By password = By.id("password");
    By loginBtn = By.id("login");
    By loginPageLink = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[6]/div[1]/ul[1]/li[1]");

    public LoginPage(WebDriver driver, WebDriverWait wdwait, Actions actions) {
        this.driver = driver;
        this.wdwait = wdwait;
        this.actions = actions;
    }

    public WebElement getLoginLink() {
        return driver.findElement(loginPageLink);
    }

    public WebElement getUserName() {
        return driver.findElement(userName);
    }

    public WebElement getPassword() {
        return driver.findElement(password);
    }

    public WebElement getLoginBtn() {
        return driver.findElement(loginBtn);
    }

    public void inputUserName(String username) {
        getUserName().sendKeys(username);
    }

    public void inputPassword(String password) {
        getPassword().sendKeys(password);
    }

    public void clickLoginBtn() {
        getLoginBtn().click();
    }
}
