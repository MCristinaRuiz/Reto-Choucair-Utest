package com.utest.automation.tasks;

import com.utest.automation.interactions.ClickSCript;
import com.utest.automation.model.Devices;
import com.utest.automation.userinterface.RegisterDevices;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FillTellUsAboutYourDevices implements Task {

    private Devices devices;

    public FillTellUsAboutYourDevices(Devices devices) {
        this.devices = devices;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(RegisterDevices.INPUT_COMPUTER),
                WaitUntil.the(RegisterDevices.LIST_ELEMENT_SELECTION.of(devices.getComputer()), isVisible()),
                ClickSCript.onXpath(RegisterDevices.LIST_ELEMENT_SELECTION.of(devices.getComputer())),


                Click.on(RegisterDevices.INPUT_VERSION),
                WaitUntil.the(RegisterDevices.LIST_ELEMENT_SELECTION.of(devices.getVersion()), isVisible()),
                ClickSCript.onXpath(RegisterDevices.LIST_ELEMENT_SELECTION.of(devices.getVersion())),

                Click.on(RegisterDevices.INPUT_LANGUAGE),
                WaitUntil.the(RegisterDevices.LIST_ELEMENT_SELECTION.of(devices.getLanguage()), isVisible()),
                ClickSCript.onXpath(RegisterDevices.LIST_ELEMENT_SELECTION.of(devices.getLanguage())),

                Click.on(RegisterDevices.INPUT_MOBILE_DEVICE),
                WaitUntil.the(RegisterDevices.LIST_ELEMENT_SELECTION.of(devices.getMobile()), isVisible()),
                ClickSCript.onXpath(RegisterDevices.LIST_ELEMENT_SELECTION.of(devices.getMobile())),

                Click.on(RegisterDevices.INPUT_MODEL),
                WaitUntil.the(RegisterDevices.LIST_ELEMENT_SELECTION.of(devices.getModel()), isVisible()),
                ClickSCript.onXpath(RegisterDevices.LIST_ELEMENT_SELECTION.of(devices.getModel())),

                Click.on(RegisterDevices.INPUT_OPERATING_SYSTEM),
                WaitUntil.the(RegisterDevices.LIST_ELEMENT_SELECTION.of(devices.getSystem()), isVisible()),
                ClickSCript.onXpath(RegisterDevices.LIST_ELEMENT_SELECTION.of(devices.getSystem())),

                Click.on(RegisterDevices.BUTTON_NEXT_LAST_STEP)
       );

    }
}
