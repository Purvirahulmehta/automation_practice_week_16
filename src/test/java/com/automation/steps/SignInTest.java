package com.automation.steps;

import com.automation.pages.AuthPage;
import com.automation.pages.HomePage;
import com.automation.pages.MyAccountPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class SignInTest {
    @Given("^I am on the Sign In Page$")
    public void iAmOnTheSignInPage() {
        new HomePage().clickOnSignInLink();

    }

    @When("^Login using newly create credentials$")
    public void loginUsingNewlyCreateCredentials() {
        new AuthPage().enterEmail("Prime975@gmail.com");
        new AuthPage().enterPassword("Prime975");
        new AuthPage().clickOnSignInButton();
    }

    @Then("^I shall verify the address information in my address section$")
    public void iShallVerifyTheAddressInformationInMyAddressSection() {
        new MyAccountPage().clickOnMyAddressButton();
        String[]expected={"Bharat Shah","Laxmi Nivas","Woking, Alaska 12345","United States","9833354322"};
        for(int i=1;i<expected.length;i++){
            System.out.println(new MyAccountPage().getAddessText1()[i]);
            Assert.assertEquals("",expected[i],new MyAccountPage().getAddessText1()[i]);
        }
    }
}
