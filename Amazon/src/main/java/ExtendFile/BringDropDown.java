package menu;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class FetchDropDown  extends CommonAPI {

    public void dropDown(){
        List<WebElement> element = getWebElements(".nav-search-dropdown.searchSelect option");
//        List<String> listOfText = getListOfText(List<WebElement> element);
//        List<String> expectedMenu = listOfText;
//        Assert.assertEquals(listOfText,expectedMenu);

    }
}
