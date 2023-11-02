package com.swag.gt.steps.login;

import com.swag.gt.pages.login.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginStep extends LoginPage {

    @Step("Ingresar usuario")
    public void typeUsername(String username){
        text_username.sendKeys(username);
    }

    @Step("Ingresar contraseña")
    public void typePassword(String password){
        txt_password.sendKeys(password);
    }

    @Step("Clik en el boton login")
    public void clickLogin(){
        btn_login.click();
    }

}
