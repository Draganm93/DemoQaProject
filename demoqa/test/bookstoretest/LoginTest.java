package demoqa.test.bookstoretest;

import demoqa.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BasePage {


    @Test(priority = 1)
    public void goToLogInPage() {
        goToBookPage();
        javaExecutorScrollIntoView(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[6]/div[1]/ul[1]/li[1]"));
        actions.sendKeys(Keys.PAGE_DOWN);
        logBookPage.getLoginLink().click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/login");
    }

    @Test(priority = 2)
    public void testLogIn() {
        goToLogInPage();
        logBookPage.inputUserName("draganmm23");
        logBookPage.inputPassword("Karmatop123!");
        logBookPage.clickLoginBtn();
        waitFor(2);
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/profile");
    }
}
