package demoqa.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UploadAndDownload {
    WebDriver driver;
    WebDriverWait wdwait;
    Actions actions;

    By mainHeader = By.className("main-header");
    By downloadBtn = By.id("downloadButton");
    By uploadFile = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/form[1]/div[1]/input[1]");
    By uploadedFilePath = By.id("uploadedFilePath");

    By downloadAndUploadLink = By.id("item-7");
    public UploadAndDownload(WebDriver driver, WebDriverWait wdwait, Actions actions) {
        this.driver = driver;
        this.wdwait = wdwait;
        this.actions = actions;
    }

    public WebElement getMainHeader() {
        return driver.findElement(mainHeader);
    }

    public WebElement getDownloadBtn() {
        return driver.findElement(downloadBtn);
    }

    public WebElement getUploadFile() {
        return driver.findElement(uploadFile);
    }

    public WebElement getUploadedFilePath() {
        return driver.findElement(uploadedFilePath);
    }

    public WebElement getUpAndDowLink() {
        return driver.findElement(downloadAndUploadLink);
    }

    public void clickDownloadBtn() {
        getDownloadBtn().click();
    }

    public void clickUploadBtn() {
        getUploadFile().click();
    }

}
