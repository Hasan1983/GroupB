package ABC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Locator {

    public static WebDriver driver = null;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/mdislam/develop/GroupB/Generic/Driver/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com");


    }
}
