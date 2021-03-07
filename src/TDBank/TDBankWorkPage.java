package TDBank;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TDBankWorkPage extends TDBankHomePage {
    WebDriver driver;
    String TDBankUrl = "https://www.TDBank.com/";
    String ChromeDriverPath = "windows/chromedriver.exe";
    String searchButton = "investement";
    String creditCards;

    @BeforeMethod
    public void setUp() {
        String ChromeDriverPath = "windows/chromedriver.exe";
        String TDBankUrl = "https://www.TDBank.com/";
        System.setProperty("webdriver.chrome.driver", ChromeDriverPath);
        driver = new ChromeDriver();
        driver.get(TDBankUrl);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.TDBank.com/");
        driver.get("navigateToTestPage");
        driver.get("LoanPage");
        driver.get("selectStateAlert");
        driver.get("creditCard");
        driver.get("pageTitle");
        driver.getTitle();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testSearchButton() {
        String expextedSearch = "searchButton";
        String actualSearch = driver.findElement(By.xpath("//div[@class='td-col-xs-12 td-col-sm-10 td-col-sm-offset-1 td-col-md-8 td-col-md-offset-2']']")).getText();
        Assert.assertEquals(actualSearch, expextedSearch, "SearchButton");
    }

    @Test
    public void searchButton() {
        driver.findElement(By.xpath(searchButton)).sendKeys(searchButton);
        driver.findElement(By.xpath(searchButton)).click();
    }

    @Test
    public void verifyingSiteTitleTest() {
        String title = driver.getTitle();
        System.out.println("the page title is: " + "#gh-logo");
        Assert.assertEquals(title, "Online Website Relationship Software");

    }

    @Test
    public void verifyLogoTest() {
        boolean advertisement = driver.findElement(By.cssSelector("#s0-15-6-0-1\\[1\\]-0 > div.title-banner__right > div")).isDisplayed();
        Assert.assertTrue(advertisement);
    }

    @Test
    public void ClickOnContactLinksTest() {

        String login = driver.findElement(By.linkText("Sign in")).getText();
    }

    @Test
    public void setUserName(String userName) {
        driver.findElement(By.tagName("userNameTextBox")).sendKeys(userName);
    }

    @Test
    public void setPassword(String password) {
        driver.findElement(By.tagName("Bleuciel767")).sendKeys(password);
    }

    @Test
    public void clickLogin() {
        driver.findElement(By.className("Sign in")).getText();
    }

    @Test
    public void ValidateUserCanTypeOnSearchBarAndChooseFromDropDown() {
        driver.findElement(By.xpath("//*[@id='gh-ac']")).sendKeys("java books");

        List<WebElement> dropDown = driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
        System.out.println(dropDown.size());
        dropDown.get(4).click();

        driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
        WebElement searchedItem = driver.findElement(By.xpath("//span[text()='chromeBook']"));
        String actualText = searchedItem.getText();
        System.out.println(actualText);
        Assert.assertEquals(actualText, "chromeBook");
        boolean validation = searchedItem.isDisplayed();
        System.out.println(validation);
    }
    @Test
    public void validateDropDown() {

        WebElement element = driver.findElement(By.id("gh-cat"));
        Select select = new Select(element);
        select.selectByVisibleText("TDBank");
    }

    @Test
    public void validateMouseHover() {


        WebElement motors = driver.findElement(By.linkText("investment"));

        Actions actions = new Actions(driver);
        actions.moveToElement(motors).build().perform();
        driver.quit();
        driver.findElement(By.linkText("investement")).click();
    }

    @Test
    public void validateScroll() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
    }

    @Test
    public void validateScrollToElement() {

        WebElement element = driver.findElement(By.linkText("Announcements"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    @Test
    public void contactUsDropDownMenuTest() {
        WebElement element = driver.findElement(By.xpath("header/div[1]/div[1]/button[1]/div[1]/span[2]"));
        driver.findElement(By.cssSelector("#s0-15-6-0-1\\[1\\]-0 > div.title-banner__right > div")).isDisplayed();
    }
    @Test
    public void applyCreditCard() {
        WebElement element= driver.findElement(By.xpath("li.td-nav-mobile-menu-item.td-item-nav-link:nth-child(6) > a"));
        driver.findElement(By.cssSelector("section[id='product0'] button[class='td-button td-button-primary td-product-cta-button']"));

        }
        @Test
      public void checkingAccount(){
        //WebElement element= (By.xpath("//header/div[1]/div[1]/button[1]/div[1]"));
        //driver.findElement((By.xpath("//body/div[3]/div[1]/section[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/p[2]/a[1]");
}



}





