package co.com.qvision.certificacion.tasks;

import co.com.qvision.certificacion.models.User;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static co.com.qvision.certificacion.userinterfaces.LoginPage.*;

@AllArgsConstructor
public class Login implements Task {

    private User user;

    public static Login evalartApp(User user) {
        return Tasks.instrumented(Login.class, user);
    }

    @Step("{0} logins in EvalartApp.")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user.getName()).into(INPUT_USERNAME),
                Enter.theValue(user.getPassword()).into(INPUT_PASSWORD),
                Click.on(BTN_SEND)
        );
    }
}
