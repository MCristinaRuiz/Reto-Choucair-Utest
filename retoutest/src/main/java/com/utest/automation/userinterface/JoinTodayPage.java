package com.utest.automation.userinterface;

import static net.serenitybdd.core.annotations.findby.By.xpath;
import net.serenitybdd.screenplay.targets.Target;

public class JoinTodayPage {

    public static final Target JOIN_TODAY = Target.the("Button that takes us to the session to create account")
            .located(xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));

    private JoinTodayPage() {
    }
}
