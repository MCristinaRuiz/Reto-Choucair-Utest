package com.utest.automation.tasks;

import com.utest.automation.model.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.utest.automation.userinterface.RegisterAccountData.*;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FillTheLastStep implements Task {

    private User user;

    public FillTheLastStep(User user) {
        this.user = user;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                WaitUntil.the(INPUT_PASSWORD, isVisible()),
                Enter.theValue(user.getPassword()).into(INPUT_PASSWORD),
                Enter.theValue(user.getPassword()).into(INPUT_CONFIRM_PASSWORD),
                Click.on(BOX_STAY_INFORMED),
                Click.on(BOX_ACCEPT_TERM),
                Click.on(BOX_ACCEPT_PRIVACY),
                Click.on(BUTTON_COMPLETED)
        );

    }
}
