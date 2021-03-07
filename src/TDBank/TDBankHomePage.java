package TDBank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TDBankHomePage {
    public static void main(String[] args) {

        String TDBankUrl = "https://www.TDBank.com/";
        String ChromeDriverPath = "windows/chromedriver.exe";
        String searchButton = "//div[@class='td-col-xs-12 td-col-sm-10 td-col-sm-offset-1 td-col-md-8 td-col-md-offset-2']']";
        String clickSearchButton= "//a[@class='td-desktop-search-show-btn']//span[@class='td-icon']";
        System.setProperty("webdriver.chrome.driver", ChromeDriverPath);
        WebDriver driver = new ChromeDriver();
        driver.get(TDBankUrl);
        driver.get("https://www.TDBank.com/");
        driver.get("navigateToTestPage");
        driver.get("LoanPage");
        driver.get("selectStateAlert");
        driver.findElement(By.xpath(searchButton)).sendKeys(searchButton);
        driver.findElement(By.xpath(clickSearchButton)).click();

    }
}