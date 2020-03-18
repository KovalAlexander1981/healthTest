package Pages;

import Drivers.DriverFactory;
import org.openqa.selenium.support.PageFactory;

public class BasePage extends DriverFactory {

    public BasePage() {
        {
            PageFactory.initElements(driver, this);
        }
    }
}


