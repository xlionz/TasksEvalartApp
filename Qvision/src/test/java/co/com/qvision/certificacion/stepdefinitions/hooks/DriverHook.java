package co.com.qvision.certificacion.stepdefinitions.hooks;

import co.com.qvision.certificacion.utils.WebDriverFactory;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;

import static co.com.qvision.certificacion.utils.Constans.URL_EVALART_APP;

public class DriverHook {

    @Before
    public void prepareStage(){
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(WebDriverFactory.goToWeb())));
        OnStage.theActorCalled("Automation").wasAbleTo(Open.url(URL_EVALART_APP));
    }
}
