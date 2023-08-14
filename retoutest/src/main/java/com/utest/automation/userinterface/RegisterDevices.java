package com.utest.automation.userinterface;

import static net.serenitybdd.core.annotations.findby.By.xpath;
import net.serenitybdd.screenplay.targets.Target;

public class RegisterDevices {

    public static final Target INPUT_COMPUTER = Target.the("where select your computer")
            .located(xpath("//div[@name='osId']"));

    public static final Target INPUT_VERSION = Target.the("where select your version computer")
            .located(xpath("//div[@name='osVersionId']"));

    public static final Target INPUT_LANGUAGE = Target.the("where select your language")
            .located(xpath("//div[@name='osLanguageId']"));

    public static final Target INPUT_MOBILE_DEVICE = Target.the("where select your mobile")
            .located(xpath("//div[@name='handsetMakerId']"));

    public static final Target INPUT_MODEL = Target.the("where select your model of mobile")
            .located(xpath("//div[@name='handsetModelId']"));

    public static final Target INPUT_OPERATING_SYSTEM = Target.the("where we select the mobile operating system")
            .located(xpath("//div[@name='handsetOSId']"));

    public static final Target LIST_ELEMENT_SELECTION = Target.the("select item list")
            .locatedBy("//div[text()='{0}']");

    public static final Target BUTTON_NEXT_LAST_STEP = Target.the("where we click to continue")
            .located(xpath("//a[@Class='btn btn-blue pull-right']//span"));

    private RegisterDevices(){}
}
