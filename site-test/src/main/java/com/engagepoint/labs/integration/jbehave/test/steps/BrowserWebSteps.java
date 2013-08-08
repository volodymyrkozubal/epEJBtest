package com.engagepoint.labs.integration.jbehave.test.steps;

import com.engagepoint.labs.integration.jbehave.test.pages.Pages;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

/**
 * @author volodymyr.kozubal
 */
public class BrowserWebSteps {

    private final Pages pages;

    public BrowserWebSteps(Pages pages) {
        this.pages = pages;
    }

    @Given("user is on Index page")
    public void userIsOnHomePage() {
        pages.index().open();
    }

    @Then("user clicks newArticle button")
    public void clicknewArticlebutton() {
        pages.index().clicknewArticlebutton();
    }

    @Then("user click publish")
    public void clickOkbutton() {
        pages.index().clickPublishButton();
    }
}