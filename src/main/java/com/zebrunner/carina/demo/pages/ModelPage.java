package com.zebrunner.carina.demo.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ModelPage {
    private WebDriver driver;

    @FindBy(id = "com.lambdatest.proverbial:id/color")
    private WebElement color;

    @FindBy(id = "com.lambdatest.proverbial:id/Text")
    private WebElement text;

    @FindBy(id = "com.lambdatest.proverbial:id/toast")
    private WebElement toast;

    @FindBy(id = "com.lambdatest.proverbial:id/notification")
    private WebElement notification;


    @FindBy(id = "com.lambdatest.proverbial:id/geoLocation")
    private WebElement geo;



    /*@FindBy(id = "com.lambdatest.proverbial:id/notification")
    private WebElement notification;*/

    public ModelPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickcolor() {
        color.click();
    }

    public void clicktext() {
        text.click();
    }

    public void clicktoast() {
        toast.click();
    }

    public void clicknotification() {
        notification.click();
    }
    public void clickgeo() {
        geo.click();
    }
}
