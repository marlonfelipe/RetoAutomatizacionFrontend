package com.swag.gt.pages.validations;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ValidationPage extends PageObject {

    @FindBy(css = "#header_container > div.header_secondary_container > span")
    protected WebElementFacade lbl_product;

    @FindBy(css = "#login_button_container > div > form > div.error-message-container.error > h3")
    protected WebElementFacade lbl_errorMessage;

    @FindBy(xpath = "//*[@id=\"item_4_title_link\"]/div")
    protected List<WebElementFacade> productsList;

    @FindBy(css = "#checkout_complete_container > h2")
    protected WebElementFacade lbl_order;

}
