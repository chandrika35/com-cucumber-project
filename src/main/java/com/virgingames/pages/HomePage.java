package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

 @CacheLookup
   @FindBy(xpath = "//*[@id=\"__tealiumGDPRecModal\"]/div/div/div/div[2]/label")
    WebElement cookiesAcceptButton;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Join Now')]")
    WebElement joinNowButton;
    @CacheLookup
    @FindBy(xpath = "//a[@title='Poker']")
    WebElement pockerTab;
@CacheLookup
@FindBy(xpath = "//h1[normalize-space()='Play our exciting Online Poker Games']")
WebElement text;
 public void clickOnAcceptAllCookiesButton(){
     clickOnElement(cookiesAcceptButton);
     log.info("Clicking on Accept Cookies Button:" + cookiesAcceptButton.toString());
 }
public void clickOnJoinNowButton(){
     clickOnElement(joinNowButton);
     log.info("Clicking on Join Now Button:" + joinNowButton.toString());

}
public void clickOnPockerTab(){
     clickOnElement(pockerTab);
     log.info("Clicking on Pocker Tab :" + pockerTab.toString());
}
public void verifyingTheTextPlayOurExcitingOnlinePockerGamesTab(){
    String actualText = driver.findElement(By.xpath("//h1[normalize-space()='Play our exciting Online Poker Games']")).getText();
    Assert.assertEquals(actualText, "Play our exciting Online Poker Games", "Invalid Message Prompt...!!!");
}
}