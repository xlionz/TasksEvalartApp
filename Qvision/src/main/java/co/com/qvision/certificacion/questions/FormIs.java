package co.com.qvision.certificacion.questions;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static co.com.qvision.certificacion.userinterfaces.FormPage.H1_FORM_DONE;
import static co.com.qvision.certificacion.userinterfaces.FormPage.LBL_TOKEN;

@AllArgsConstructor
public class FormIs implements Question<Boolean> {

    public static final Logger LOGGER = LoggerFactory.getLogger(FormIs.class);

    public static FormIs done(){
        return new FormIs();
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        actor.attemptsTo(
                Ensure.that(H1_FORM_DONE.resolveFor(actor)
                        .getText()).contains("Felicidades, has terminado la prueba exitosamente")
        );

        LOGGER.info(LBL_TOKEN.resolveFor(actor).getText());

        return true;
    }
}
