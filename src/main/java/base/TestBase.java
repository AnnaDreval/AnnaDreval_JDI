package base;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.testng.testRunner.TestNGBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import sites.JdiSite;

import static sites.JdiSite.homePage;

public class TestBase extends TestNGBase {

    @BeforeSuite(alwaysRun = true)
    public static void setUp() {
        WebSite.init(JdiSite.class);
    }

    @AfterMethod
    public static void afterMethod() {
        homePage.clearCache();
    }

}



