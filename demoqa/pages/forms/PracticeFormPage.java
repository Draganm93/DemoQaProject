package demoqa.pages.forms;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class PracticeFormPage {
    WebDriver driver;
    WebDriverWait wdwait;

    By firstName = By.id("firstName");

    By lastName = By.id("lastName");

    By email = By.id("userEmail");

    By genderOptions = By.xpath("//*[contains(@class,\"custom-radio\")]");

    By userNumber = By.id("userNumber");

    By birthDay = By.id("dateOfBirthInput");

    By subjects = By.id("subjectsInput");

    By hobbies = By.xpath("//*[contains(@class,\"custom-checkbox\")]");

    By uploadPicture = By.id("uploadPicture");

    By currAdd = By.id("currentAddress");

    By states = By.id("react-select-3-input");
    By cities = By.id("react-select-4-input");

    By submitBtn = By.id("submit");

    By responseTitle = By.id("example-modal-sizes-title-lg");

    By modalContent = By.className("modal-content");

    By closeModal = By.id("closeLargeModal");

    By formsPage = By.cssSelector("div.body-height:nth-child(2) div.home-content div.home-body div.category-cards div.card.mt-4.top-card:nth-child(2) div:nth-child(1) div.avatar.mx-auto.white > svg:nth-child(1)");
    By practiceLink = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]");

    public PracticeFormPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getFirstName() {
        return driver.findElement(firstName);
    }

    public WebElement getLastName() {
        return driver.findElement(lastName);
    }

    public WebElement getEmail() {
        return driver.findElement(email);
    }

    public List<WebElement> getGenderOptions() {
        return driver.findElements(genderOptions);
    }

    public WebElement getUserNumber() {
        return driver.findElement(userNumber);
    }

    public WebElement getBirthDay() {
        return driver.findElement(birthDay);
    }

    public WebElement getSubjects() {
        return driver.findElement(subjects);
    }

    public List<WebElement> getHobbies() {
        return driver.findElements(hobbies);
    }

    public WebElement getUploadBtn() {
        return driver.findElement(uploadPicture);
    }

    public WebElement getCurrAdd() {
        return driver.findElement(currAdd);
    }

    public WebElement getStates() {
        return driver.findElement(states);
    }

    public WebElement getCities() {
        return driver.findElement(cities);
    }

    public WebElement getSubmitBtn() {
        return driver.findElement(submitBtn);
    }

    public WebElement getResponseTitle() {
        return driver.findElement(responseTitle);
    }

    public WebElement getModalContent() {
        return driver.findElement(modalContent);
    }

    public WebElement getCloseBtn() {
        return driver.findElement(closeModal);
    }

 
    public void enterName(String name) {
        getFirstName().sendKeys(name);
    }

    public void enterLastName(String lastName) {
        getLastName().sendKeys(lastName);
    }

    public void enterEmail(String email) {
        getEmail().sendKeys(email);
    }

    public void clickGenderOption(int i) {
        getGenderOptions().get(i).click();
    }

    public void enterNumber(String number) {
        if (number.length() == 10) {
            getUserNumber().sendKeys(number);
        } else {
            System.out.println("Number must have 10 digits!");
        }
    }

    public void enterBirthDay(String date) {
        getBirthDay().sendKeys(Keys.chord(Keys.CONTROL, "a"), date, Keys.ENTER);
    }

    public void enterSubjects(String subject) {
        getSubjects().sendKeys(subject);
        getSubjects().sendKeys(Keys.ENTER);
    }

    public void chooseHobbiesOption(int i) {
        getHobbies().get(i).click();
    }

    public void sendFile(String file) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView()", driver.findElement(uploadPicture));
        getUploadBtn().sendKeys(file);
    }

    public void enterCurrAdd(String currAdd) {
        getCurrAdd().sendKeys(currAdd);
    }

    public void enterState(String state) {
        getStates().sendKeys(state, Keys.ENTER);
    }

    public void enterCity(String city) {
        getCities().sendKeys(city, Keys.ENTER);
    }

    public void submitForm() {
        getSubmitBtn().submit();
    }

    
    public WebElement getFormsPageEl() {
        return driver.findElement(formsPage);
    }

    public WebElement getPracticeLink() {
        return driver.findElement(practiceLink);
    }

    public void goToFormsPage() {
        driver.navigate().to("https://demoqa.com/");
        getFormsPageEl().click();
        getPracticeLink().click();
    }

}
