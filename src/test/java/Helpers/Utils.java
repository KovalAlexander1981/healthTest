package Helpers;

import Drivers.DriverFactory;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;

import java.time.Duration;


public class Utils extends DriverFactory {

    public static void stopApp() {
        driver.quit();
    }

    public static void backButton() {
        ((AndroidDriver) driver).pressKeyCode(AndroidKeyCode.BACK);
    }

    public static void scroll() {
        Dimension size = driver.manage().window().getSize();
        int x = (int) (size.width * 0.5);
        int y = (int) (size.height * 0.6);
        int endY = (int) (size.height * 0.1);

        new TouchAction(driver)
                .press(new PointOption().withCoordinates(x, y))
                .waitAction(new WaitOptions().withDuration(Duration.ofMillis(2500)))
                .moveTo(new PointOption().withCoordinates(x, endY))
                .release()
                .perform();

    }

    public static void tap(double a, double b) {
        Dimension size = driver.manage().window().getSize();
        int x = (int) (size.width * a);
        int y = (int) (size.height * b);
        new TouchAction(driver)
                .press(new PointOption().withCoordinates(x, y))
                .waitAction(new WaitOptions().withDuration(Duration.ofMillis(1000)))
                .release()
                .perform();
    }
    public  static void findElementByXPath(String name){
        driver.findElementByXPath("//android.widget.CheckedTextView[@text='" + name + "']").click();
    }
}

