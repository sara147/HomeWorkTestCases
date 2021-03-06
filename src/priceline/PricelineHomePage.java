package priceline;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PricelineHomePage {
    public static void main(String[] args) {
         String pricelineUrl = "https://www.priceline.com/";
         String ChromeDriverPath = "windows/chromedriver.exe";
         System.setProperty("webdriver.chrome.driver",ChromeDriverPath);
         WebDriver driver =new ChromeDriver();
         driver.get(pricelineUrl);
         driver.manage().window().maximize();
         driver.manage().deleteAllCookies();
         driver.get("https://www.priceline.com/");

    }
}