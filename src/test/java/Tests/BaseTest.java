package Tests;

import Pages.Pages;
import org.testng.annotations.AfterSuite;

import static Helpers.Utils.stopApp;

public class BaseTest {
    public ThreadLocal<Pages> pages = ThreadLocal.withInitial(() -> new Pages());

    public Pages getPages() { return pages.get();}

    @AfterSuite
    public void tearDownSuite() {
        stopApp();
    }
}
