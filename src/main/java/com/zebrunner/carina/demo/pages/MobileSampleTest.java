package com.zebrunner.carina.demo.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.agent.core.annotation.TestLabel;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import com.zebrunner.carina.utils.mobile.IMobileUtils;

import java.net.MalformedURLException;



public class MobileSampleTest implements IAbstractTest, IMobileUtils {

    @Test()
    @MethodOwner(owner = "qpsdemo")
    @TestLabel(name = "feature", value = {"mobile", "regression"})
    public void AndroidApp() throws InterruptedException, MalformedURLException {

        //selenium_url= "https://" + userName + ":" + accessKey + "@" + grid_url + "/wd/hub";
        try {
            ModelPage modelPage = new ModelPage(getDriver());
            modelPage.clickcolor();
            Thread.sleep(2000);
            modelPage.clickcolor();

            modelPage.clicktext();
            modelPage.clicktoast();
            modelPage.clickgeo();
            Thread.sleep(1000);

            ((JavascriptExecutor) getDriver()).executeScript("lambda-status=" + "passed");
        }
        catch ( Exception e) {
            e.printStackTrace();
            ((JavascriptExecutor) getDriver()).executeScript("lambda-status=" + "failed");
        }
    }
}
