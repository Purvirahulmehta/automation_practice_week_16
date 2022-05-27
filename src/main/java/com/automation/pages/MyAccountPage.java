package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MyAccountPage extends Utility {
    public MyAccountPage() {
        PageFactory.initElements(driver, this);
    }

    private static final Logger log = LogManager.getLogger(MyAccountPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'My addresses')]")
    WebElement myAddressButton;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='last_item item box']//li")
    List<WebElement> myAddressText;
    @CacheLookup
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/a[1]")
    WebElement womenTabHeader;
    @CacheLookup
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]")
    WebElement dressesTabHeader;
    @CacheLookup
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/ul[1]/li[1]/a[1]")
    WebElement casualDressesSubTab;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/h5[1]/a[1]")
    WebElement printedDress;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Add to cart')]")
    WebElement addToCartTab;
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/a[1]/span[1]")
    WebElement proceedToCheckOutTab;
    @CacheLookup
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
    WebElement topsSubTab;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Faded Short Sleeve T-shirts')]")
    WebElement fadedShortSleeveTShirts;
    @CacheLookup
    @FindBy(xpath = "//input[@id='quantity_wanted']")
    WebElement quantity;

        public void clickOnMyAddressButton() {
        clickOnElement(myAddressButton);
        log.info("Click On My Address Tab: " + myAddressButton.toString());
    }

    public String[] getAddessText1() {
        String[] a = new String[7];
        for (int i = 1; i < myAddressText.size() - 1; i++) {
            String b = myAddressText.get(i).getText();
            a[i - 1] = b;
        }
        return a;
    }
    public void clickOnWomenTabHeader(){
            clickOnElement(womenTabHeader);
            log.info("Click on Women Header Tab: " + womenTabHeader.toString());
    }
    public void clickOnTopsSubTab(){
            clickOnElement(topsSubTab);
        log.info("Click on Tops Sub Tab: " + topsSubTab.toString());

    }
    public void clickOnFadedShortSleevTShirts(){
            clickOnElement(fadedShortSleeveTShirts);
        log.info("Click on faded Short Sleeve T-shirts Tab: " + fadedShortSleeveTShirts.toString());
    }
    public void enterQuantity(String text){
            log.info("Enter Quantity: " + quantity.toString());
            sendTextToElement(quantity,text);
    }
    public void clickOnAddToCartTab(){
            clickOnElement(addToCartTab);
        log.info("Click on Add To Cart Tab: " + addToCartTab.toString());

    }
    public void clickOnDressHeaderTab(){
            clickOnElement(dressesTabHeader);
        log.info("Click on Dresses Header Tab: " + dressesTabHeader.toString());

    }
    public void clickOnCasualDressesSubTab(){
            clickOnElement(casualDressesSubTab);
        log.info("Click on Casual Dresses Sub Tab: " + casualDressesSubTab.toString());

    }
    public void clickOnPrintedDress(){
            clickOnElement(printedDress);
        log.info("Click on Printed Dresses Tab: " + printedDress.toString());

    }
    public void clickOnProceedToCheckOutTab(){
            clickOnElement(proceedToCheckOutTab);
        log.info("Click on Proceed To Check Out Tab: " + proceedToCheckOutTab.toString());

    }


    }


