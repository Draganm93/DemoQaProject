package demoqa.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTables {
    WebDriver driver;
    WebDriverWait wdwait;

    By addBtn = By.id("addNewRecordButton");
    By searchBox = By.id("searchBox");
    By firstName = By.id("firstName");
    By lastName = By.id("lastName");
    By email = By.id("userEmail");
    By age = By.id("age");
    By salary = By.id("salary");
    By department = By.id("department");
    By submitFormBtn = By.id("submit");
    By editRecord = By.id("edit-record-2");
    By deleteRecord = By.id("delete-record-2");

    By webTablesLink = By.id("item-3");


    public WebTables(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getWebTablesLink() {
        return driver.findElement(webTablesLink);
    }

    public WebElement addBtnEl() {
        return driver.findElement(addBtn);
    }

    public WebElement searchBoxEl() {
        return driver.findElement(searchBox);
    }

    public WebElement firstNameInput() {
        return driver.findElement(firstName);
    }

    public WebElement lastNameInput() {
        return driver.findElement(lastName);
    }

    public WebElement emailInput() {
        return driver.findElement(email);
    }

    public WebElement ageInput() {
        return driver.findElement(age);
    }

    public WebElement salaryInput() {
        return driver.findElement(salary);
    }

    public WebElement departmentInput() {
        return driver.findElement(department);
    }

    public WebElement submitBtn() {
        return driver.findElement(submitFormBtn);
    }

    public WebElement editBtn() {
        return driver.findElement(editRecord);
    }

    public WebElement deleteBtn() {
        return driver.findElement(deleteRecord);
    }

    public void clickAddBtn() {
        addBtnEl().click();
    }

    public void firstNameInput(String fN){
        firstNameInput().sendKeys(fN);
    }

    public void lastNameInput(String lN){
        lastNameInput().sendKeys(lN);
    }

    public void emailInput(String mail){
        emailInput().sendKeys(mail);
    }

    public void ageInput(String age){
        ageInput().sendKeys(age);
    }

    public void salaryInput(String salary){
        salaryInput().sendKeys(salary);
    }

    public void departmentInput(String dep){
        departmentInput().sendKeys(dep);
    }

    public void clickSubmit(){
        submitBtn().click();
    }

    public void clickEdit() {
        editBtn().click();
    }

    public void clickDelete(){
        deleteBtn().click();
    }
}
