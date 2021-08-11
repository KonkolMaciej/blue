package blueservice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObjectManager {
    private final WebDriver driver;
    private ContactFormPage contactFormPage;
    private HomePage homePage;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public ContactFormPage getContactFormPage() {
        if (contactFormPage == null) {
            contactFormPage = PageFactory.initElements(driver, ContactFormPage.class);
        }
        return contactFormPage;
    }

    public HomePage getHomePage() {
        if (homePage == null) {
            homePage = PageFactory.initElements(driver, HomePage.class);
        }
        return homePage;
    }
}
