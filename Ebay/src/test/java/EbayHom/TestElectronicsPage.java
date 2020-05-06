package EbayHom;

import Base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.ElectronicsPage;


public class TestElectronicsPage extends CommonApi {
    @Test
    public void lookingElectronics(){
        ElectronicsPage electronicsPage = PageFactory.initElements(driver,ElectronicsPage.class);
        electronicsPage.readNValidateElectronics(driver);
    }
}
