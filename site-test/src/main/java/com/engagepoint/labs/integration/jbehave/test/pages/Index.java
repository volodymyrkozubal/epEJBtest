package com.engagepoint.labs.integration.jbehave.test.pages;

import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

/**
 * @author volodymyr.kozubal
 */
public class Index extends AbstractPage {

    public Index(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void open() {
        get("http://localhost:8080/site/index.xhtml"); //  --- > url in story
        manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        sleepOnJBehave();
    }

    public void clicknewArticlebutton() {
        findElement(By.xpath(".//*[@id='j_idt38']")).click();
        manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        sleepOnJBehave();
    }
    public void clickPublishButton() {
        findElement(By.xpath(".//*[@id='j_idt38']")).click();
        manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        sleepOnJBehave();
    }
    private void sleepOnJBehave() {
        try {
            Thread.currentThread().sleep(1000);//1sec
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}
