package com.masteringselenium.page_factory_objects;

import com.masteringselenium.DriverFactory;
import com.masteringselenium.fluent_page_objects.LoginPage;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class IndexPage {

	@FindBy(how = How.ID, using = "modlgn-username")
    //private List<WebElement> login_user;
	private WebElement login_user;

	@FindBy(how = How.ID, using = "modlgn-passwd")
    private WebElement login_password;

	@FindBy(how = How.XPATH, using = ".//*[@id='form-login-submit']/div/button")
    private WebElement login_button;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='content']/div[3]/div[1]/h2")
    private WebElement welcome_text;
	
	private static Logger logger = Logger.getLogger(LoginPage.class);
	
    public PageHeader header = new PageHeader();
    public PageFooter footer = new PageFooter();

    public IndexPage() throws Exception {
        PageFactory.initElements(DriverFactory.getDriver(), this);
    }

    public boolean welcome_text_is_displayed() {
    	logger.info("welcome text is displayed");
        return welcome_text.isDisplayed();
    }

    public boolean login_button_ist_displayed() {
        //return login_button.size() == 1;
    	logger.info("login button is displayed");
    	return login_button.isDisplayed();

    }
    public void login_with_username_and_password(String username, String password) {
        login_user.sendKeys(username);
        login_password.sendKeys(password);
        login_button.click();
        logger.info("submit login with: " + username + " and " + password);
    }
}