package blueservice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactFormPage {

    @FindBy(xpath = "//label[contains(., 'klient biznesowy')]/div")
    private WebElement bussinessCustomerTypeRB;

    @FindBy(id = "name")
    public WebElement fullNameTextField;

    @FindBy(id = "email_c")
    public WebElement emailTextField;

    @FindBy(xpath = "//label[@for = 'email_c']/span[@class= 'form__input__label__content']")
    public WebElement emailTest;

    @FindBy(id = "phone")
    public WebElement phoneNumberTextField;

    @FindBy(id = "select2-subject-container")
    private WebElement selectEmailSubject;

    @FindBy(xpath = "//li[text() = 'Przelewy natychmiastowe']")
    private WebElement chooseSubjectEmail;

    @FindBy(id = "body")
    private WebElement messageTextField;

    @FindBy(name = "respond_type")
    private WebElement emailRespondTypeRB;

    @FindBy(id = "agreement_1")
    private WebElement agreementRulesCheckbox;

    private void chooseEmailSubjectListClick() {
        selectEmailSubject.click();
        chooseSubjectEmail.click();
    }


    private void chooseCustomerType() {
        bussinessCustomerTypeRB.click();
    }

    private void setFullname(String fullname) {
        fullNameTextField.click();
        fullNameTextField.sendKeys(fullname);
    }

    private void setEmail(String email) {
        emailTextField.click();
        emailTextField.sendKeys(email);
    }

    private void setPhoneNumber(String number) {
        phoneNumberTextField.click();
        phoneNumberTextField.sendKeys(number);
    }

    private void setEmailMessage(String content) {
        messageTextField.click();
        messageTextField.sendKeys(content);
    }

    private void chooseEmailRespondTypeRB() {
        emailRespondTypeRB.click();
    }

    private void acceptAgreementRulesCheckbox() {
        agreementRulesCheckbox.click();
    }

    public void fillContactForm(String fullname, String email, String number, String content) {
        chooseCustomerType();
        setFullname(fullname);
        setEmail(email);
        setPhoneNumber(number);
        setEmailMessage(content);
        chooseEmailRespondTypeRB();
        acceptAgreementRulesCheckbox();
        chooseEmailSubjectListClick();
    }

}
