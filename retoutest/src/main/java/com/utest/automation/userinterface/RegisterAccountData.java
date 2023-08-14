package com.utest.automation.userinterface;

import static net.serenitybdd.core.annotations.findby.By.id;
import static net.serenitybdd.core.annotations.findby.By.xpath;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterAccountData {

    public static final Target INPUT_PASSWORD = Target.the("where we write the password")
            .located(id("password"));

    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("where we write the confirm password")
            .located(id("confirmPassword"));

    public static final Target BOX_STAY_INFORMED = Target.the("where we agree to stay informed")
            .located(xpath("//span[@class='checkmark signup-consent__checkbox signup-consent__checkbox--highlight']"));

    public static final Target BOX_ACCEPT_TERM = Target.the("where we accept terms and conditions")
            .located(xpath("//input[@id='termOfUse']//following::span[1]"));

    public static final Target BOX_ACCEPT_PRIVACY = Target.the("where we accept privacy terms")
            .located(xpath("//input[@id='privacySetting']//following::span[1]"));

    public static final Target BUTTON_COMPLETED = Target.the("registration complete button")
            .located(xpath("//a[@id='laddaBtn']//following::span[1]"));

    private RegisterAccountData()  {

    }
}
