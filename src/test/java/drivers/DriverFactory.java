package drivers;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;

public  class DriverFactory {
    protected static AndroidDriver<AndroidElement> driver;
    protected static WebDriverWait wait;
    public static String userName = String.valueOf(ResourceBundle.getBundle("user.name"));
    public static String accessKey = String.valueOf(ResourceBundle.getBundle("access.key"));

       static {
           /* DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("deviceName", "Galaxy 7");
            caps.setCapability("udid", "5203ec13e8b1a3f7");
            caps.setCapability("platformName", "Android");
            caps.setCapability("platformVersion", "8.1");
            caps.setCapability("appPackage", "com.jayway.contacts");
            caps.setCapability("appActivity", "com.jayway.contacts.MainActivity");*/

           DesiredCapabilities caps = new DesiredCapabilities();
           caps.setCapability("device", "Samsung Galaxy S10e");
           caps.setCapability("os_version", "9.0");
           caps.setCapability("project", "My First Project");
           caps.setCapability("build", "My First Build");
           caps.setCapability("name", "Bstack-[Java] Sample Test");
           caps.setCapability("app", "bs://e6abd66170e1164e32e2850edf1c2f4450573dc0");
            try {
               // driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
                 driver = new AndroidDriver<>(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), caps);

            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            wait = new WebDriverWait(driver, 10);
        }

    }








