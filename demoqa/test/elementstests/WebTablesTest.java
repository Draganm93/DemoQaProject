package demoqa.test.elementstests;

import demoqa.pages.base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTablesTest extends BasePage {
    @Test
    public void openWebTablesPage() {
        navigateHomePage(0);
        webTables.getWebTablesLink().click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/webtables");
    }

    @Test
    public void isAddBtnDisplayed() {
        openWebTablesPage();
        Assert.assertTrue(webTables.addBtnEl().isDisplayed());
    }

    @Test
    public void areFormInputsEnabled() {
        openWebTablesPage();
        webTables.clickAddBtn();
        Assert.assertTrue(webTables.firstNameInput().isEnabled());
        Assert.assertTrue(webTables.lastNameInput().isEnabled());
        Assert.assertTrue(webTables.emailInput().isEnabled());
        Assert.assertTrue(webTables.ageInput().isEnabled());
        Assert.assertTrue(webTables.salaryInput().isEnabled());
        Assert.assertTrue(webTables.departmentInput().isEnabled());
    }

    @Test
    public void isSubmitFormEnabled() {
        openWebTablesPage();
        webTables.clickAddBtn();
        Assert.assertTrue(webTables.submitBtn().isEnabled());
        Assert.assertTrue(webTables.submitBtn().isDisplayed());
    }

    @Test
    public void insertNewUser() {
        openWebTablesPage();
        webTables.clickAddBtn();
        webTables.firstNameInput("Dragan");
        webTables.lastNameInput("Milanov");
        webTables.emailInput("draganm@gmail.com");
        webTables.ageInput("29");
        webTables.salaryInput("100000");
        webTables.departmentInput("QA Tester");
        Assert.assertEquals(webTables.firstNameInput().getAttribute("value"), "Dragan");
        Assert.assertEquals(webTables.lastNameInput().getAttribute("value"), "Milanov");
        Assert.assertEquals(webTables.emailInput().getAttribute("value"), "draganm@gmail.com");
        Assert.assertEquals(webTables.ageInput().getAttribute("value"), "29");
        Assert.assertEquals(webTables.salaryInput().getAttribute("value"), "100000");
        Assert.assertEquals(webTables.departmentInput().getAttribute("value"), "QA Tester");
        webTables.clickSubmit();
    }
}
