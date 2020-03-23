package pages;

import io.qameta.allure.Description;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ContactFullUserInfoPage extends BasePage {

    @FindBy(xpath = "//android.view.ViewGroup/android.widget.TextView")
    private WebElement pageTitle;

    @FindBy(id = "com.jayway.contacts:id/detail_name")
    private WebElement userDetailName;

    @FindBy(id = "com.jayway.contacts:id/phonenumber_tag")
    private WebElement phoneNumberLabel;

    @FindBy(id = "com.jayway.contacts:id/phonenumber")
    private WebElement phoneNumberText;

    public ContactFullUserInfoPage() {
        checkIsOpened();
    }

    @Description("Check that page is open")
    private ContactFullUserInfoPage checkIsOpened(){
        assertTrue(pageTitle.isDisplayed(), "Is open element is not displayed");
        assertTrue(userDetailName.isDisplayed(), "Is open element is not displayed");

        return this;
    }

    @Description("Check user names is equals to specific {0}")
    public ContactFullUserInfoPage checkUserNamesIsEqualsToExpected(String expectedUserName){
        assertEquals(userDetailName.getText(), expectedUserName, "User names are not equal to expected or were changed");

        return this;
    }

    @Description("Check phone number is displayed")
    public ContactFullUserInfoPage checkPhoneNumberIsDisplayed(){
        assertTrue(phoneNumberLabel.isDisplayed(), "Phone number label is not displayed");
        assertTrue(phoneNumberText.isDisplayed(), "Phone number text is not displayed");

        return this;
    }
    @Description("Print phone number")
    public ContactFullUserInfoPage printPhoneNumber(){
        System.out.printf("Phone Number: " + phoneNumberText.getText());

        return this;
    }
}
