package Tests;

import org.testng.annotations.Test;

public class CheckUserInformationTest extends BaseTest {
    @Test(description = "Create new chat, topic add users to  them and leave chat")
    public void checkCreateNewChatWithUsers () {
        String userNames = "Chris Heavener";

        getPages().contactPage()
                .fillSearchField(userNames)
                .clickUserNamesByNumber(1)
                .checkUserNamesIsEqualsToExpected(userNames)
                .checkPhoneNumberIsDisplayed()
                .printPhoneNumber();


    }

}
