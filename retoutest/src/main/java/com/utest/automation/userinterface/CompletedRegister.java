package com.utest.automation.userinterface;

import static net.serenitybdd.core.annotations.findby.By.xpath;
import net.serenitybdd.screenplay.targets.Target;

public class CompletedRegister {

    public static final Target LBL_WELCOME_MESSAGE= Target.the("Welcome message")
            .located(xpath("//div[@class='image-box-header']//h1"));

    private CompletedRegister(){}
}