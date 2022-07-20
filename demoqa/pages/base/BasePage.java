package demoqa.pages.base;

import demoqa.pages.bookstoreapp.BookStorePage;
import demoqa.pages.bookstoreapp.LoginPage;
import demoqa.pages.bookstoreapp.ProfilePage;
import demoqa.pages.elements.*;
import demoqa.pages.forms.PracticeFormPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;


import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class BasePage {
    public WebDriverManager wdm;
    public WebDriver driver;
    public WebDriverWait wdwait;
    public Actions actions;
    public TextBox textBox;
    public CheckBox checkBox;
    public RadioBtn radioBtn;
    public WebTables webTables;
    public Buttons buttonPage;

    public Links linkPage;

    public BrokenLinks brokenlinksPage;
    public UploadAndDownload upDownPage;
    public DynamicProperties dynamicPage;

    public PracticeFormPage practiceFormPage;

    public LoginPage logBookPage;

    public ProfilePage profilePage;

    public BookStorePage bookStorePage;


    @BeforeClass
    public void setUp() {
        wdm = new ChromeDriverManager();
        wdm.setup();
        ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File("src/main/resources/addblockplus.crx"));
        driver = new ChromeDriver(options);
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(5));
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        wdwait.until(ExpectedConditions.visibilityOf(driver.findElement(By.tagName("h1"))));
        driver.close();
        driver.switchTo().window(tabs.get(0));
//        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(15));
        actions = new Actions(driver);
        textBox = new TextBox(driver, wdwait);
        checkBox = new CheckBox(driver, wdwait);
        radioBtn = new RadioBtn(driver, wdwait);
        webTables = new WebTables(driver, wdwait);
        buttonPage = new Buttons(driver, wdwait, actions);
        linkPage = new Links(driver, wdwait, actions);
        brokenlinksPage = new BrokenLinks(driver, wdwait, actions);
        upDownPage = new UploadAndDownload(driver, wdwait, actions);
        dynamicPage = new DynamicProperties(driver, wdwait, actions);
        practiceFormPage = new PracticeFormPage(driver, wdwait);
        logBookPage = new LoginPage(driver, wdwait, actions);
        profilePage = new ProfilePage(driver, wdwait, actions);
        bookStorePage = new BookStorePage(driver,wdwait,actions);
    }


   
    public List<WebElement> homePageNavigation() {
        List<WebElement> cards = driver.findElements(By.className("card-up"));
        return cards;
    }

    public void navigateHomePage(int i) {
        driver.navigate().to("https://demoqa.com/");
        homePageNavigation().get(i).click();
    }

    public List<WebElement> getMenuLinks() {
        List<WebElement> menuLinks = driver.findElements(By.className("header-wrapper"));
        return menuLinks;
    }

    public List<WebElement> getMenuList() {
        List<WebElement> menuList = driver.findElements(By.className("menu-list"));
        return menuList;
    }


    public static void waitFor(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void javaExecutorScrollIntoView(By locator) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView()", driver.findElement(locator));
    }

    public void scroll() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("javascript:window.scrollBy(0,440)");
    }

    public void changeHeight() {
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("document.querySelector('.body-height').style.height = '400vh'");
    }

    public void goToBookPage() {
        driver.navigate().to("https://demoqa.com/");
        javaExecutorScrollIntoView((By.xpath("//div[6]//div[1]//div[2]//*[name()='svg']")));
        driver.findElement(By.xpath("//div[6]//div[1]//div[2]//*[name()='svg']")).click();
    }

//    @AfterTest
//    public void afterTest() {
//        driver.quit();
//    }
}
