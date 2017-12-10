package com.masteringselenium.fluent_page_objects;

import com.masteringselenium.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(how = How.ID, using = "modlgn-username")
    private  WebElement usernameLocator;

    @FindBy(how = How.ID, using = "modlgn-passwd")
    private  WebElement passwordLocator;

    @FindBy(how = How.XPATH, using = ".//*[@id='form-login-submit']/div/button")
    private  WebElement loginButtonLocator;

    public LoginPage() throws Exception {
        PageFactory.initElements(DriverFactory.getDriver(), this);
    }

    public LoginPage enterUsername(String username, String password) {
        usernameLocator.sendKeys(username);
        passwordLocator.sendKeys(password);
        loginButtonLocator.click();
        
        return this;
    }


}