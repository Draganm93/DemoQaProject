package demoqa.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CheckBox {
    public WebDriver driver;
    public WebDriverWait wdwait;
    By homeBtn = By.cssSelector("img[src='/images/Toolsqa.jpg']");
    By checkBox = By.className("rct-checkbox");

    By checkBoxes = By.cssSelector("div.body-height:nth-child(2) div.container.playgound-body div.row div.col-12.mt-4.col-md-6:nth-child(2) div.check-box-tree-wrapper:nth-child(2) div.react-checkbox-tree.rct-icons-fa4 ol:nth-child(2) li.rct-node.rct-node-parent.rct-node-expanded span.rct-text:nth-child(1) label:nth-child(2) > span.rct-checkbox:nth-child(2)");

    By checkBoxLink = By.id("item-1");

    By expandBtn = By.xpath("//button[@title='Expand all']");
    By collapseBtn = By.xpath("//*[@id=\"tree-node\"]/div/button[2]");
    By responseMsg = By.className("text-success");
    By message = By.id("result");

    public CheckBox(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getHome(){
        return driver.findElement(homeBtn);
    }

    public WebElement getCheckBoxLink() {return driver.findElement(checkBoxLink);}

    public WebElement getCheckBox(){
        return driver.findElement(checkBox);
    }

    public WebElement getExpandBtn(){
        return driver.findElement(expandBtn);
    }

    public WebElement getCollapseBtn(){
        return driver.findElement(collapseBtn);
    }

    public WebElement getMessageEl(){
        return  driver.findElement(message);
    }

    public List<WebElement> getAllCheckBoxes() {
        return driver.findElements(checkBoxes);
    }

    public void clickHomeBtn() {
        getHome().click();
    }
    public void clickCheckBox(){
        getCheckBox().click();
    }

    public void clickCheckBoxInt(int i) {
        getAllCheckBoxes().get(i).click();
    }

    public void expandBtn() {
        getExpandBtn().click();
    }

    public void collapseBtn() {
        getCollapseBtn().click();
    }

    public String getMessage() {
        return getMessageEl().getText();
    }

    public List<WebElement> allSuccesText() {
        return driver.findElements(responseMsg);
    }
}
