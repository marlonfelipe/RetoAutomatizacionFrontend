package com.swag.gt.pages.products;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SelectProductPage extends PageObject {

    @FindBy(css = "button.btn.btn_primary.btn_small.btn_inventory")
    protected List<WebElementFacade> products;

    @FindBy(css = "#shopping_cart_container")
    protected WebElementFacade shoppingCartIcon;


}
