package demoqa.test.formstests;

import demoqa.pages.base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeFormsPageTest extends BasePage {
    @Test(priority = 1)
    public void navigateToPracticeFormPage() {
        practiceFormPage.goToFormsPage();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/automation-practice-form");
    }

    @Test(priority = 2)
    public void inputFormFillingOut() {
        navigateToPracticeFormPage();
        practiceFormPage.enterName("Dragan ");
        practiceFormPage.enterLastName("Milanov");
        practiceFormPage.enterEmail("draganm@test.com");
        practiceFormPage.clickGenderOption(0);
        practiceFormPage.enterNumber("0654841550");
        practiceFormPage.enterBirthDay("18 Dec 1993");
        practiceFormPage.enterSubjects("Math");
        practiceFormPage.enterSubjects("English");
        practiceFormPage.chooseHobbiesOption(0);
        practiceFormPage.chooseHobbiesOption(1);
        changeHeight();
        waitFor(2);
        practiceFormPage.enterCurrAdd("Zarka Zrenjanina 23");
        practiceFormPage.enterState("NCR");
        practiceFormPage.enterCity("Delhi");
        practiceFormPage.submitForm();

        Assert.assertTrue(practiceFormPage.getResponseTitle().isDisplayed());
        Assert.assertTrue(practiceFormPage.getModalContent().isDisplayed());
        Assert.assertEquals(practiceFormPage.getFirstName().getAttribute("value"), "Dragan");
        Assert.assertEquals(practiceFormPage.getLastName().getAttribute("value"), "Milanov");
        Assert.assertEquals(practiceFormPage.getEmail().getAttribute("value"), "draganm@test.com");
        Assert.assertEquals(practiceFormPage.getUserNumber().getAttribute("value"), "0654841550");
        Assert.assertEquals(practiceFormPage.getBirthDay().getAttribute("value"), "18 Dec 1993");
        Assert.assertEquals(practiceFormPage.getCurrAdd().getAttribute("value"), "Zarka Zrenjanina 23");
        Assert.assertTrue(practiceFormPage.getSubmitBtn().isEnabled());

        practiceFormPage.getCloseBtn().click();
    }
}
