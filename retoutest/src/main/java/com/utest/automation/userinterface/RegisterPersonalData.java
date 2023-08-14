package com.utest.automation.userinterface;

import static net.serenitybdd.core.annotations.findby.By.id;
import static net.serenitybdd.core.annotations.findby.By.xpath;
import net.serenitybdd.screenplay.targets.Target;

public class RegisterPersonalData {

    public static final Target INPUT_FIRST_NAME= Target.the("where we write the first name")
            .located(id("firstName"));

    public static final Target INPUT_LAST_NAME= Target.the("where we write the last name")
            .located(id("lastName"));

    public static final Target INPUT_EMAIL_ADDRESS = Target.the("where we write the email address")
            .located(id("email"));

    public static final Target SELECT_BIRTH_MONTH = Target.the("where select the birth month")
            .located(id("birthMonth"));

    public static final Target SELECT_BIRTH_DAY = Target.the("where select the birth day")
            .located(id("birthDay"));

    public static final Target SELECT_BIRTH_YEAR = Target.the("where select the birth year")
            .located(id("birthYear"));

    public static final Target SELECT_LANGUAGE = Target.the("where select your computer")
            .located(xpath("//input[@type='search']"));

    public static final Target BUTTON_NEXT = Target.the("where we click to continue")
            .located(xpath("//i[@class='material-icons']"));

    private RegisterPersonalData() {}
}
