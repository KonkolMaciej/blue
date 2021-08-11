package blueservice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(xpath = "//div[@class ='header__navigation']/a[@href='/kontakt']")
    private WebElement contactPage;

    public void ContactPageClick() {
        contactPage.click();
    }
}
