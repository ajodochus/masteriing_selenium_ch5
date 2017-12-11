package com.masteringselenium.page_factory_objects;

import com.masteringselenium.DriverFactory;


import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(how = How.XPATH, using = ".//*[@id='login-form']//input[@value='Log out']")
    private  WebElement logout_button;

    @FindBy(how = How.XPATH, using = ".//*[@id='login-form']/div[1]")
    private  WebElement user_welcome_text;

    private static Logger logger = Logger.getLogger(LoginPage.class);

    public LoginPage() throws Exception {
        PageFactory.initElements(DriverFactory.getDriver(), this);
    }
    
    public String user_welcome_text_is_equal_to(){
    	String welcome_text = user_welcome_text.getText();
    	logger.info("welcome text: <<" + welcome_text +">>");
    	return welcome_text;
    }
    
    public boolean logout_button_is_displayed() {
    	logger.info("logout button is displayed");
        return logout_button.isDisplayed();
    }

    
}