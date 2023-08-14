package com.utest.automation.tasks;

import com.utest.automation.model.Devices;
import com.utest.automation.model.User;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;

public class RegisterAccount {

    public static Performable fillFormTellUsAboutYourself(User user){

        return Tasks.instrumented(FillTellUsAboutYourself.class, user);
    }

    public static Performable fillFormAddYourAddress(User user){

        return Tasks.instrumented(FillAddYourAddress.class, user);
    }

    public static Performable fillTellUsAboutYourDevices(Devices devices){

        return Tasks.instrumented(FillTellUsAboutYourDevices.class ,devices);
    }

    public static Performable fillTheLastStep (User user){

        return Tasks.instrumented(FillTheLastStep.class, user);
    }

    private RegisterAccount() {
    }
}
