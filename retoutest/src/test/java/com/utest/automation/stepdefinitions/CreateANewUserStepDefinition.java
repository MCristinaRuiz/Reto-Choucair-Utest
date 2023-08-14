package com.utest.automation.stepdefinitions;

import com.utest.automation.exceptions.AccountCreationFailed;
import com.utest.automation.model.Devices;
import com.utest.automation.model.User;
import com.utest.automation.questions.Message;
import com.utest.automation.tasks.RegisterAccount;
import com.utest.automation.userinterface.UtestPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import java.util.List;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CreateANewUserStepDefinition {

    @Before
    public void setStage () {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("(.*) open the page Utest")
    public void openThePageUtest(String actor) {
        OnStage.theActorCalled(actor);
        theActorInTheSpotlight().wasAbleTo(Open.browserOn().the(UtestPage.class));
    }

    @When("(.*) register with valid data")
    public void youRegisterWithValidData(User user, List<Devices> data) throws InterruptedException {
        theActorInTheSpotlight().attemptsTo(
                RegisterAccount.fillFormTellUsAboutYourself(user),
                RegisterAccount.fillFormAddYourAddress(user),
                RegisterAccount.fillTellUsAboutYourDevices(data.get(0)),
                RegisterAccount.fillTheLastStep(user)
        );
    }

    @Then("the client can see information on how to get started with uTest")
    public void theClientCanSeeInformationOnHowToGetStartedWithUTest() {
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(Message.ofWelcomeMessage(), Matchers.equalTo(true)).orComplainWith(AccountCreationFailed.class)
        );
    }
}
