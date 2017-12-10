package com.masteringselenium.tests;

import com.masteringselenium.DriverFactory;
import com.masteringselenium.fluent_page_objects.LoginPage;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;



public class test_joomla_login_frontend extends DriverFactory {
	
	    @Test
	    public void valid_login_into_frontend() throws Exception {
	        getDriver().get("https://bwselenium.joomla.com");
	        LoginPage loginPage = new LoginPage();
	        loginPage.enterUsername("admin", "admin");
	
	        assertThat(getDriver().getTitle(), is(equalTo("bwselenium")));
	    }
	    
	
}
