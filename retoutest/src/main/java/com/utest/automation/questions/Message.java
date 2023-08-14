package com.utest.automation.questions;

import com.utest.automation.utils.Constants;
import com.utest.automation.userinterface.CompletedRegister;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Text;

@Subject("Get the welcome message to utest")
public class Message implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {

        String message = Text.of(CompletedRegister.LBL_WELCOME_MESSAGE).viewedBy(actor).asString();
        return Constants.WELCOME_MESSAGE.getValue().equals(message);
    }

    public static Message ofWelcomeMessage() {
        return new Message();
    }
}
