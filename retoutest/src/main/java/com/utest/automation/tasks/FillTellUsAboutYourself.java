package com.utest.automation.tasks;

import com.utest.automation.model.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import static com.utest.automation.userinterface.RegisterPersonalData.*;
import static com.utest.automation.userinterface.JoinTodayPage.JOIN_TODAY;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FillTellUsAboutYourself implements Task {

    private User user;

    public FillTellUsAboutYourself(User user) {
        this.user = user;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Click.on(JOIN_TODAY),
                WaitUntil.the(INPUT_FIRST_NAME, isVisible()),
                Enter.theValue(user.getFirstname()).into(INPUT_FIRST_NAME),
                Enter.theValue(user.getLastname()).into(INPUT_LAST_NAME),
                Enter.theValue(user.getEmailaddress()).into(INPUT_EMAIL_ADDRESS),
                SelectFromOptions.byVisibleText(user.getBirthmonth()).from(SELECT_BIRTH_MONTH),
                SelectFromOptions.byVisibleText(user.getBirthday()).from(SELECT_BIRTH_DAY),
                SelectFromOptions.byVisibleText(user.getBirthyear()).from(SELECT_BIRTH_YEAR)
        );


        user.getIdioms().forEach(language->
            actor.attemptsTo(
                            Enter.theValue(language).into(SELECT_LANGUAGE)
                                    .thenHit(Keys.ARROW_DOWN)
                                    .thenHit(Keys.ENTER))
        );

        actor.attemptsTo(
                Click.on(BUTTON_NEXT)
        );

    }
}
