package com.swag.gt.steps.shopping;

import com.swag.gt.pages.shopping.ShoppingCartPage;
import net.thucydides.core.annotations.Step;

public class ShoppingCartStep extends ShoppingCartPage {

    @Step("Clic en checkout")
    public void clickCheckoutButton(){
        checkoutButton.click();
    }

    @Step("Ingresar nombre")
    public void typeFirstName(String firstname){
        txt_firstname.sendKeys(firstname);
    }

    @Step("Ingresar apellido")
    public void typeLastName(String lastname){
        txt_lastname.sendKeys(lastname);
    }

    @Step("Ingresar codigo postal")
    public void typePostal(String postal){
        txt_postal.sendKeys(postal);
    }

    @Step("Clic en continuar")
    public void clickContinue(){
        continueButton.click();
    }

    @Step("Clic en finalizar")
    public void clicFinish(){
        finishButton.click();
    }
}
