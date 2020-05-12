package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class NewYorkPage {

    HomePage homePage=null;

   // @FindBy(how= How.XPATH, using="//*[@id=\"app-bar\"]/div/div[2]/div/ul/li[1]/a")
   // public static WebElement NewYorkTabWebElement;

    public void readNValidateNewYork(WebDriver driver){
        HomePage homePage= PageFactory.initElements(driver,HomePage.class);
        homePage.clickOnNewYorkTab();


    }
}
