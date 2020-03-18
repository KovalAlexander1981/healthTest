package Pages;

import io.qameta.allure.Description;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.testng.Assert.assertTrue;

public class ContactPage extends BasePage {
    @FindBy(xpath = "//android.view.ViewGroup/android.widget.TextView")
    private WebElement pageTitle;

    @FindBy(id = "com.jayway.contacts:id/main_search")
    private WebElement searchField;

    @FindBy(id = "com.jayway.contacts:id/name")
    List<WebElement> userNames;

    public ContactPage() {
        checkIsOpened();
    }

    @Description("Check that page is open")
    private ContactPage checkIsOpened(){
        assertTrue(pageTitle.isDisplayed(), "Is open element is not displayed");
        assertTrue(searchField.isDisplayed(), "Is open element is not displayed");

        return this;
    }

    @Description("Fill search field {0}")
    public ContactPage fillSearchField(String userNames){
        searchField.click();
        searchField.sendKeys(userNames);

        return this;
    }

    @Description("Click on user name {0}")
    public ContactFullUserInfoPage clickUserNamesByNumber(int userName){
        userNames.get(userName - 1).click();

        return new ContactFullUserInfoPage();
    }




}
