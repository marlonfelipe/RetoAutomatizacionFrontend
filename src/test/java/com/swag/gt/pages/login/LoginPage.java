package com.swag.gt.pages.login;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject {

    @FindBy(id = "user-name")
    protected WebElementFacade text_username;

    @FindBy(id = "password")
    protected WebElementFacade txt_password;

    @FindBy(id = "login-button")
    protected WebElementFacade btn_login;


}
