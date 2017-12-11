package com.masteringselenium.tests;

import com.masteringselenium.DriverFactory;
import com.masteringselenium.page_factory_objects.AboutPage;
import com.masteringselenium.page_factory_objects.IndexPage;
import com.masteringselenium.page_factory_objects.PageFooter;
import com.masteringselenium.page_factory_objects.LoginPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

import org.apache.log4j.Logger;
import org.apache.xalan.xsltc.dom.LoadDocument;

public class Joomla_login_tests extends DriverFactory {

	private static Logger logger = Logger.getLogger(LoginPage.class);

    @Test
    public void valid_login_and_logout() throws Exception {
        getDriver().get("https://bwselenium.joomla.com/");
        IndexPage indexPage = new IndexPage();

        assertThat(indexPage.login_button_ist_displayed(), is(equalTo(true)));
        assertThat(indexPage.welcome_text_is_displayed(), is(equalTo(true)));
        
        indexPage.login_with_username_and_password("ranorex", "ranorex");
        
        LoginPage loginPage = new LoginPage();
        assertThat(loginPage.user_welcome_text_is_equal_to(), is(equalTo("Hi ranorex,")));
        assertThat(loginPage.logout_button_is_displayed(), is(equalTo(true)));
        
        indexPage = loginPage.logout_frontend();
        

//        PageFooter footer = new PageFooter();
//        footer.goToTheAboutUsPage();
//        AboutPage aboutPage = new AboutPage();
//
//        assertThat(aboutPage.aboutUsTextIsDisplayed(), is(equalTo(true)));
    }

    /*@Test
    public void checkThatAboutPageHasTextStep3() throws Exception {
        getDriver().get("http://ch5.masteringselenium.com/index.html");
        IndexPage indexPage = new IndexPage();

        assertThat(indexPage.mainTextIsDisplayed(), is(equalTo(true)));
        assertThat(indexPage.mainPageButtonIsDisplayed(), is(equalTo(true)));

        indexPage.footer.goToTheAboutUsPage();
        AboutPage aboutPage = new AboutPage();

        assertThat(aboutPage.aboutUsTextIsDisplayed(), is(equalTo(true)));
    }

    @Test
    public void checkThatAboutPageHasTextStep4() throws Exception {
        getDriver().get("http://ch5.masteringselenium.com/index.html");
        IndexPage indexPage = new IndexPage();

        assertThat(indexPage.mainTextIsDisplayed(), is(equalTo(true)));
        assertThat(indexPage.mainPageButtonIsDisplayed(), is(equalTo(true)));

        AboutPage aboutPage = indexPage.footer.goToTheAboutUsPage();

        assertThat(aboutPage.aboutUsTextIsDisplayed(), is(equalTo(true)));
    }

    @Test
    public void checkThatAboutPageHasText() throws Exception {
        getDriver().get("http://ch5.masteringselenium.com/index.html");
        indexPage = new IndexPage();

        assertThat(indexPage.mainTextIsDisplayed(), is(equalTo(true)));
        assertThat(indexPage.mainPageButtonIsDisplayed(), is(equalTo(true)));

        aboutPage = indexPage.footer.goToTheAboutUsPage();

        assertThat(aboutPage.aboutUsTextIsDisplayed(), is(equalTo(true)));
    }*/

}
