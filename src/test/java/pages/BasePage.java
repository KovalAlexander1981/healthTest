package pages;

import drivers.DriverFactory;
import org.openqa.selenium.support.PageFactory;

public class BasePage extends DriverFactory {

    public BasePage() {
        {
            PageFactory.initElements(driver, this);
        }
    }
}


