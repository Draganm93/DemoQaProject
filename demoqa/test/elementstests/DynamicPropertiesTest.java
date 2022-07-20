package demoqa.test.elementstests;

import demoqa.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.AssertJUnit.*;

public class DynamicPropertiesTest extends BasePage {
    @Test
    public void openDynamicPage() {
        navigateHomePage(0);
        waitFor(1);
        scroll();
        dynamicPage.getDynamicLink().click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/dynamic-properties");
    }

    @Test
    public void isVisibleAfterClick() {
        openDynamicPage();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("visibleAfter")));
        dynamicPage.getVisibleAfter().click();
    }

    @Test
    public void isVisibleAfterClickableAfter4Seconds() throws InterruptedException {
        openDynamicPage();
        Thread.sleep(4000);
        List<WebElement> al = driver.findElements(By.id("visibleAfter"));
        if (al.size() != 0){
            fail();
        }
    }

    @Test()
    public void isEnabledAfterClickable(){
        openDynamicPage();
        wdwait.until(ExpectedConditions.elementToBeClickable(By.id("enableAfter")));
        assertTrue(dynamicPage.getEnableAfter().isEnabled());
        dynamicPage.getEnableAfter().click();
    }

    @Test ()
    public void isEnableAfterClickableAfter4Seconds() throws InterruptedException {
        openDynamicPage();
        Thread.sleep(4000);
        assertFalse(dynamicPage.getEnableAfter().isEnabled());
    }
}
