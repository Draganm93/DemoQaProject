package demoqa.test.elementstests;

import demoqa.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Set;

public class BrokenLinksTest extends BasePage {
    @Test
    public void goToBrokenLinksPage() {
        navigateHomePage(0);
        waitFor(1);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        waitFor(1);
        brokenlinksPage.getBrokenLinksLink().click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/broken");
        Assert.assertTrue(brokenlinksPage.getMainHeader().isDisplayed());
    }

    @Test
    public void isBrokenImgDisplayed() {
        goToBrokenLinksPage();
        Assert.assertTrue(brokenlinksPage.getBrokenImg().getAttribute("src").contains("/images/Toolsqa_1.jpg"));
        Assert.assertTrue(brokenlinksPage.isBrokenImgDisplayed());
    }

    @Test
    public void clickValidLink() {
        goToBrokenLinksPage();
        brokenlinksPage.clickOnValidLink();
        waitFor(1);
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/");
    }

    @Test
    public void clickInvalidLink() {
        goToBrokenLinksPage();
        brokenlinksPage.clickOnBrokenLink();
        waitFor(1);
        Assert.assertEquals(driver.getCurrentUrl(), "http://the-internet.herokuapp.com/status_codes/500");
    }
}
