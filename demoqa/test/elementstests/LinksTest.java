package demoqa.test.elementstests;

import demoqa.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Set;

public class LinksTest extends BasePage {
    @Test
    public void openLinksPage() {
        navigateHomePage(0);
        waitFor(2);
        scroll();
        waitFor(1);
        linkPage.getLinksLink().click();
        Assert.assertTrue(linkPage.isLinkHeaderDisplayed());
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/links");
    }

    @Test
    public void clickOnSimpleLink() {
        openLinksPage();
        linkPage.clickOnSimpleLink();
        Set<String> tabs = driver.getWindowHandles();
        ArrayList<String> allTabs = new ArrayList<>(tabs);
        driver.switchTo().window(allTabs.get(1));
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/");
    }

    @Test
    public void clickOnDynamicLink() {
        openLinksPage();
        linkPage.clickOnDynamicLink();
        Set<String> tabovi = driver.getWindowHandles();
        ArrayList<String> sviTabovi = new ArrayList<>(tabovi);
        driver.switchTo().window(sviTabovi.get(1));
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/");
    }

    @Test
    public void clickOnCreatedLink() {
        openLinksPage();
        linkPage.clickOnCreatedLink();
        waitFor(1);
        Assert.assertEquals(linkPage.getLinkResponse().getText(), "Link has responded with staus 201 and status text Created");
    }

    @Test
    public void clickOnNoContentLink() {
        openLinksPage();
        linkPage.clickOnNoContentLink();
        waitFor(1);
        Assert.assertEquals(linkPage.getLinkResponse().getText(), "Link has responded with staus 204 and status text No Content");
    }

    @Test
    public void clickOnMovedLink() {
        openLinksPage();
        linkPage.clickOnMovedLink();
        waitFor(1);
        Assert.assertEquals(linkPage.getLinkResponse().getText(), "Link has responded with staus 301 and status text Moved Permanently");
    }

    @Test
    public void clickOnBadRequesLink() {
        openLinksPage();
        linkPage.clickOnBadRequest();
        waitFor(1);
        Assert.assertEquals(linkPage.getLinkResponse().getText(), "Link has responded with staus 400 and status text Bad Request");
    }

    @Test
    public void clickOnUnauthorizedLink() {
        openLinksPage();
        linkPage.clickOnUnauthorizedLink();
        waitFor(1);
        Assert.assertEquals(linkPage.getLinkResponse().getText(), "Link has responded with staus 401 and status text Unauthorized");
    }

    @Test
    public void clickOnForbiddenLink() {
        openLinksPage();
        linkPage.clickOnForbiddenLink();
        waitFor(1);
        Assert.assertEquals(linkPage.getLinkResponse().getText(), "Link has responded with staus 403 and status text Forbidden");
    }

    @Test
    public void clickOnInvalidUrlLink() {
        openLinksPage();
        linkPage.clickOnInvalidUrl();
        waitFor(1);
        Assert.assertEquals(linkPage.getLinkResponse().getText(), "Link has responded with staus 404 and status text Not Found");
    }
}
