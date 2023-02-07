package co.com.qvision.certificacion.stepdefinitions;

import co.com.qvision.certificacion.exceptions.ExceptionError;
import co.com.qvision.certificacion.questions.FormIs;
import co.com.qvision.certificacion.tasks.*;
import co.com.qvision.certificacion.utils.ReadFiles;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AutomatedCyclesStepDefinition {

    @Given("{string} logs with credentials")
    public void logsWithCredentials(String user) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Login.evalartApp(ReadFiles.readUser(user))
        );
    }
    @When("tries to complete step 1")
    public void triesCompleteStep1() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                FillCicleOne.withAnswer()
        );
    }

    @Then("shoulds see the msg indicanting that form is done")
    public void shouldsSee() {
        theActorInTheSpotlight().should(seeThat(FormIs.done())
                .orComplainWith(ExceptionError.class));
    }
}
