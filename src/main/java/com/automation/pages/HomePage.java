package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    @CacheLookup
    @FindBy(xpath =  "//a[@class='sf-with-ul' and contains(text(),'Women')]")
    WebElement womenTabHeader;
    @CacheLookup
    @FindBy(xpath = "")
    WebElement dressesTabHeader;
    @CacheLookup
    @FindBy(xpath = "")
    WebElement tShirtsTabHeader;


    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    WebElement signInLink;
    public void clickOnSignInLink(){
        clickOnElement(signInLink);
        log.info("Clicking on Sign In Link: " + signInLink.toString());

    }
    public void clickOnWomenTabHeader(){
        clickOnElement(womenTabHeader);
        log.info("Clicking on Women Header Tab: " + womenTabHeader.toString());

    }
    public void ClickOnDressesTabHeader(){
        clickOnElement(dressesTabHeader);
        log.info("Clicking on Dresses Header Tab: " + dressesTabHeader.toString());

    }
    public void ClickOnTShirtsTabHeader(){
        clickOnElement(tShirtsTabHeader);
        log.info("Clicking on T-Shirts Header Tab: " + tShirtsTabHeader.toString());

    }
}
