package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage extends Utility {
    public ContactPage() {
        PageFactory.initElements(driver, this);
    }

    private static final Logger log = LogManager.getLogger(ContactPage.class.getName());

//    @CacheLookup
//    @FindBy(xpath = "")
//    WebElement ;
}
