package com.automation.steps;

import com.automation.pages.AuthPage;
import com.automation.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CreateUserTest {
    @Given("^I am on home page$")
    public void iAmOnHomePage() {
        new HomePage().clickOnSignInLink();
    }

    @Then("^Navigate to SignUp page$")
    public void navigateToSignUpPage() {
        new HomePage().clickOnSignInLink();
        new AuthPage().enterEmailAddressField("Bharat9@gmail.com");

        new AuthPage().clickOnCreateAccoutnButton();
       // new AuthPage().clickOnGenderRadioBtn();
        new AuthPage().enterFirstName("Bharat");
        new AuthPage().enterLastName("Shah");
       // new AuthPage().enterEmail("Prime975@gmaol.com");
        new AuthPage().enterPassword("Bharat9");
        //new AuthPage().selectBirthdate("10");
       // new AuthPage().selectBirthMonth("May");
       // new AuthPage().selectBirthYear("1999");
       // new AuthPage().enteraddresFirstname("Bharat");
       // new AuthPage().enteraddressLastname("Shah");
        new AuthPage().enterCompanyName("Prime");
        new AuthPage().enterAddressFirstLine("Laxmi Nivas");
        //new AuthPage().enteraddressLine2("Woking");
        new AuthPage().enterCity("Woking");
        new AuthPage().selectState("Alaska");
        new AuthPage().enterZipCode("12345");
        new AuthPage().selectCountry("United States");
        //new AuthPage().enterHomephone("9833354322");
        new AuthPage().enterMobilephone("9833354322");
        new AuthPage().enterAddressfutureReference("Delivery Address");
    }

    @And("^create an account with random username$")
    public void createAnAccountWithRandomUsername() {
        new AuthPage().clickOnRegister();

    }


}
