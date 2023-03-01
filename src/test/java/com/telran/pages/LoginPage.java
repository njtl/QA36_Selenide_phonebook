package com.telran.pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends PageBase {

    public void login(String email, String password) {
        //driver.findElement...
        $("#defaultRegisterFormEmail").click();
        $("#defaultRegisterFormEmail").val(email);

        $(by("placeholder","Password")).click();
        $(by("placeholder","Password")).sendKeys(password);

        $(byCssSelector("#login-form > div:nth-child(3) > div.col-sm-5 > button")).click();
    }

    public void validateLogin() {
        $(byText("Logout")).shouldBe(Condition.visible);
    }
}
