package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthPage extends Utility {
    public AuthPage() {
        PageFactory.initElements(driver, this);
    }

    private static final Logger log = LogManager.getLogger(AuthPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//input[@id='email_create']")
    WebElement emailAddressField;
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]/span[1]")
    WebElement createAnAccountButton;

    @CacheLookup
    @FindBy(xpath = "//input[@id='id_gender2']")
    WebElement title;
    @CacheLookup
    @FindBy(xpath = "//input[@name='customer_firstname']")
    WebElement firstNamefield;
    @CacheLookup
    @FindBy(xpath = "//input[@id='customer_lastname']")
    WebElement lastNamefield;
    @CacheLookup
    @FindBy(xpath = "//input[@id='email']")
    WebElement emailField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='passwd']")
    WebElement passwordField;
    @CacheLookup
    @FindBy(xpath = "//select[@id='days']")
    WebElement date;
    @CacheLookup
    @FindBy(xpath = "//select[@name='months']")
    WebElement month;
    @CacheLookup
    @FindBy(id = "years")
    WebElement year;
    @CacheLookup
    @FindBy(xpath = "//input[@id='optin']")
    WebElement signUpNewsletter;
    @CacheLookup
    @FindBy(xpath = "//input[@id='optin']")
    WebElement receiveSpecialOffer;
    @CacheLookup
    @FindBy(xpath = "//input[@id='firstname']")
    WebElement addressFirstname;
    @CacheLookup
    @FindBy(xpath = "//input[@id='lastname']")
    WebElement addressLastName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='company']")
    WebElement companyName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='address1']")
    WebElement addressLine1;
    @CacheLookup
    @FindBy(xpath = "//input[@id='address1']")
    WebElement addressLine2;
    @CacheLookup
    @FindBy(xpath = "//input[@id='city']")
    WebElement city;
    @CacheLookup
    @FindBy(xpath = "//select[@id='id_state']")
    WebElement state;
    @CacheLookup
    @FindBy(xpath = "//input[@id='postcode']")
    WebElement zipCode;
    @CacheLookup
    @FindBy(xpath = "//select[@id='id_country']")
    WebElement country;
    @CacheLookup
    @FindBy(xpath = "//textarea[@id='other']")
    WebElement addInfo;
    @CacheLookup
    @FindBy(xpath = "//input[@id='phone']")
    WebElement homePhone;
    @CacheLookup
    @FindBy(xpath = "//input[@id='phone_mobile']")
    WebElement mobile;
    @CacheLookup
    @FindBy(xpath = "//input[@id='alias']")
    WebElement addressFutureRef;
    @CacheLookup
    @FindBy(xpath = "//button[@name='submitAccount']")
    WebElement register;
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/p[2]/button[1]/span[1]")
    WebElement signInLink;
    public void clickOnSignInButton(){
        clickOnElement(signInLink);
        log.info("Clicking SignIn Button: " + signInLink.toString());
    }
    public void enterEmailAddressField(String email){
        sendTextToElement(emailAddressField,email);
        log.info("Clicking on Email Address Field: " + emailAddressField.toString());

    }

    public void clickOnCreateAccoutnButton() {
        clickOnElement(createAnAccountButton);
        log.info("Clicking on CreateAccount: " + createAnAccountButton.toString());
    }

    public void clickOnGenderRadioBtn() {
        clickOnElement(title);
        log.info("Clicking on Gender button: " + title.toString());
    }
    public void enterFirstName(String firstname) {
        sendTextToElement(firstNamefield,firstname);
        log.info("Enter firstname: " + firstname + firstNamefield.toString());

    }
    public void enterLastName(String lastname) {
        sendTextToElement(lastNamefield, lastname);
        log.info("Enter LastName: " + lastname+ lastNamefield.toString());

    }

    public void enterEmail(String mail){
        sendTextToElement(emailField, mail);
        log.info("Enter email: " + mail  + emailField.toString());
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
        log.info("Enter Password: "+password+ passwordField.toString());
    }

    public void selectBirthdate(String birthdate) {
        selectByValueFromDropDown(date, birthdate);
        log.info("Selecting day"+birthdate+" from dropdown "+date.toString());
    }

    public void selectBirthMonth(String birthMonth) {
        selectByValueFromDropDown(month, birthMonth);
        log.info("Selecting Month: " +birthMonth+" from dropdown "+month.toString());
    }

    public void selectBirthYear(String birthYear) {
        selectByValueFromDropDown(year, birthYear);
        log.info("Selecting Year: " +birthYear+" from dropdown "+year.toString());
    }

    public void clickOnSignUpNewsletter() {
        clickOnElement(signUpNewsletter);
        log.info("Clicking on newsletterbox: " + signUpNewsletter.toString());
    }

    public void clickOnReceiveOffer() {
        clickOnElement(receiveSpecialOffer);
        log.info("Clicking on Receiving offer: " + receiveSpecialOffer.toString());
    }

    public void enteraddresFirstname(String addressfirstname) {
        sendTextToElement(addressFirstname, addressfirstname);
        log.info("Enter Firstname: " + addressfirstname + addressFirstname.toString());
    }

    public void enteraddressLastname(String addresslastname){
        sendTextToElement(addressLastName, addresslastname);
        log.info("Enter address Lastname: " + addresslastname + addressLastName.toString());
    }

    public void enterCompanyName(String company) {
        sendTextToElement(companyName, company);
        log.info("Enter address Company: " + company +companyName.toString());
    }

    public void enterAddressFirstLine(String address){
        sendTextToElement(addressLine1, address);
        log.info("Enter address : " + address + addressLine1.toString());
    }

    public void enteraddressLine2(String address2){
        sendTextToElement(addressLine2, address2);
        log.info("Enter addressLine2: " +address2+ addressLine2.toString());
    }

    public void enterCity(String cityname){
        sendTextToElement(city, cityname);
        log.info("Enter address City: " + cityname+ city.toString());
    }

    public void selectState(String statename){
        selectByVisibleTextFromDropDown(state, statename);
        log.info("Select address State: " +statename+ state.toString());
    }

    public void enterZipCode(String zcode){
        sendTextToElement(zipCode, zcode);
        log.info("Enter address ZipCode: " + zcode+ zipCode.toString());
    }

    public void selectCountry(String countryname) {
        selectByVisibleTextFromDropDown(country, countryname);
        log.info("Selecting address Country: " + countryname+" from dropdown "+country.toString());
    }

    public void enterAdditionalInformation(String addInformation) {
        sendTextToElement(addInfo, addInformation);
        log.info("Enter address AddInfo: " + addInformation+ addInfo.toString());
    }

    public void enterHomephone(String phone) {
        sendTextToElement(homePhone, phone);
        log.info("Enter address Homephone: " + phone+ homePhone.toString());
    }

    public void enterMobilephone(String mobilephone) {
        sendTextToElement(mobile, mobilephone);
        log.info("Enter address Mobile phone: " + mobilephone+ mobile.toString());
    }

    public void enterAddressfutureReference(String reference) {
        sendTextToElement(addressFutureRef, reference);
        log.info("Enter address for futureRef: " + reference+ addressFutureRef.toString());
    }

    public void clickOnRegister() {
        clickOnElement(register);
        log.info("Clicking on Register: " + register.toString());
    }

}
