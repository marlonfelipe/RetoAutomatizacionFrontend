package com.swag.gt.pages.shopping;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"checkout\"]")
    protected WebElementFacade checkoutButton;

    @FindBy(id = "first-name")
    protected WebElementFacade txt_firstname;

    @FindBy(id = "last-name")
    protected WebElementFacade txt_lastname;

    @FindBy(id = "postal-code")
    protected WebElementFacade txt_postal;

    @FindBy(id = "continue")
    protected WebElementFacade continueButton;

    @FindBy(id = "finish")
    protected WebElementFacade finishButton;

}
