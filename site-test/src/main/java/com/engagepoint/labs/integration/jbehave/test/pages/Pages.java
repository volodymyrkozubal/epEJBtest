package com.engagepoint.labs.integration.jbehave.test.pages;

import org.jbehave.web.selenium.WebDriverProvider;

/**
 * @author volodymyr.kozubal
 */
public class Pages {

    private final WebDriverProvider driverProvider;
    private Index index;

    public Pages(WebDriverProvider driverProvider) {
        this.driverProvider = driverProvider;
    }

    public Index index() {
        if (index == null) {
            index = new Index(driverProvider);
        }
        return index;
    }

    public WebDriverProvider getDriverProvider() {
        return driverProvider;
    }
}