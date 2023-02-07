package co.com.qvision.certificacion.interactions;

import lombok.AllArgsConstructor;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;

import static co.com.qvision.certificacion.userinterfaces.FormPage.*;

@AllArgsConstructor
public class FillMutiples implements Interaction {

    private String multiple;
    public static FillMutiples mods(String multiple) {
        return Tasks.instrumented(FillMutiples.class, multiple);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> index = RD_ALL_RESTULTS.resolveAllFor(actor);
        int[] listValues = new int[index.size()];

        for (int i = 0; i < index.size(); i++) {
            listValues[i] = Integer.parseInt(RD_RESULT.of(Integer.toString(i + 1)).resolveFor(actor)
                    .getAttribute("value"));
        }

        for (int i = 0; i < listValues.length; i++) {
            if (listValues[i] % Integer.parseInt(multiple.replace("?", "")) == 0) {
                actor.attemptsTo(
                        Click.on(RD_RESTUL_SELECT.of(Integer.toString(listValues[i])))
                );
            }
        }
    }
}
