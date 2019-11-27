import blueservice.pages.PageObjectManager;
import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.loader.LoaderType;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

@RunWith(DataDrivenTestRunner.class)
@DataLoader(filePaths = {
        "src/test/resources/contactFormTest.xml"}, loaderType = LoaderType.XML, writeData = false)
public class ContactFormTest {
    private PageObjectManager manager;
    WebDriver driver;
    private String url;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        url = "https://bluemedia.pl/";
        manager = new PageObjectManager(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    ;

    @Test
    public void contactFormTest(@Param(name = "fullname") String fullname,
                                @Param(name = "email") String email,
                                @Param(name = "phoneNumber") String phoneNumber,
                                @Param(name = "emailMessage") String emailMessage
    ) {
        driver.get(url);
        manager.getHomePage().ContactPageClick();
        manager.getContactFormPage().fillContactForm(fullname, email, phoneNumber, emailMessage);
    }

    @After
    public void closeDriver() {
        driver.quit();
    }
}


