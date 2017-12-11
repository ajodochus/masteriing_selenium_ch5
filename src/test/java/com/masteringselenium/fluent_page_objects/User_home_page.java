package com.masteringselenium.fluent_page_objects;

import com.masteringselenium.DriverFactory;
import com.masteringselenium.page_factory_objects.AboutPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import org.apache.log4j.Logger;
public class User_home_page {



    @FindBy(how = How.XPATH, using = ".//*[@id='login-form']/div[1]")
    private  WebElement logged_user;
    
    @FindBy(how = How.XPATH, using = ".//*[@id='login-form']//input[@value='Log out']")
    private  WebElement log_out_btn;
    
    
    
    private static Logger logger = Logger.getLogger(User_home_page.class);
    

    public User_home_page() throws Exception {
        PageFactory.initElements(DriverFactory.getDriver(), this);
    }

    public User_home_page validate_logout_button_available() {
    	logger.info("check logout button available");
    	
       
        return this;
    }
    



}