package com.utest.automation.userinterface;

import static net.serenitybdd.core.annotations.findby.By.id;
import static net.serenitybdd.core.annotations.findby.By.xpath;
import net.serenitybdd.screenplay.targets.Target;

public class RegisterLocation {

    public static final Target SELECT_CITY = Target.the("where select the city")
            .located(id("city"));

    public static final Target INPUT_POSTAL_CODE = Target.the("where we write the postal code")
            .located(id("zip"));

    public static final Target BUTTON_NEXT_DEVICES = Target.the("where we click to continue")
            .located(xpath("//a[@Class='btn btn-blue pull-right']//span"));

    public static final Target IMG_MAP = Target.the("Image gps")
            .located(xpath("//img[@usemap='#gmimap1']"));

    private RegisterLocation() {}
}
