package co.com.qvision.certificacion.tasks;

import co.com.qvision.certificacion.interactions.FillMutiples;
import co.com.qvision.certificacion.utils.Count;
import co.com.qvision.certificacion.utils.Maths;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static co.com.qvision.certificacion.userinterfaces.FormPage.*;
import static co.com.qvision.certificacion.userinterfaces.LoginPage.BTN_SEND;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

@AllArgsConstructor
public class FillCicleOne implements Task {

    public static FillCicleOne withAnswer() {
        return Tasks.instrumented(FillCicleOne.class);
    }

    @Step("{0} tries answer the questions.")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RD_RESULT_OPERATION.of(Maths.Operation(LBL_MATH_OPERATION.resolveFor(actor)
                        .getText().replace("=", "").replace("?", "")))),
                Enter.theValue(Count.resultOfEmojisCount(actor,
                        LBL_LIST_EMOJIS, LBL_EMOJI.resolveFor(actor).getText().split(" ")[2])).into(INPUT_NUMBER),
                Click.on(BTN_SEND)
        );

        actor.attemptsTo(
                Click.on(OPT_VALUES),
                Click.on(OPT_VALUE.of(Maths.Operation(LBL_MATH_OPERATION.resolveFor(actor).getText()))),
                WaitUntil.the(LBL_WRITE_THE_LETTER, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(Count.letter(Integer.parseInt(LBL_WRITE_THE_LETTER.resolveFor(actor).getText()
                        .replace("\\'", "").split(" ")[1]),LBL_WRITE_THE_LETTER.resolveFor
                        (actor).getText().replace("'", "").split(" ")[5])).into(TXT_TEXTAREA),
                Click.on(BTN_SEND)
        );

        actor.attemptsTo(
                Enter.theValue(Count.letter(Integer.parseInt(LBL_WRITE_THE_LETTER.resolveFor(actor).getText()
                        .replace("\\'", "").split(" ")[1]),LBL_WRITE_THE_LETTER.resolveFor
                        (actor).getText().replace("'", "").split(" ")[5])).into(TXT_TEXTAREA),
                Enter.theValue(Count.resultOfEmojisCount(actor,
                        LBL_LIST_EMOJIS, LBL_EMOJI.resolveFor(actor).getText().split(" ")[2])).into(INPUT_NUMBER),
                Click.on(BTN_SEND)
        );

        actor.attemptsTo(
                Enter.theValue(Count.letter(Integer.parseInt(LBL_WRITE_THE_LETTER.resolveFor(actor).getText()
                        .replace("\\'", "").split(" ")[1]),LBL_WRITE_THE_LETTER.resolveFor
                        (actor).getText().replace("'", "").split(" ")[5])).into(TXT_TEXTAREA),
                FillMutiples.mods(LBL_MULTIPLES.resolveFor(actor).getText().split(" ")[7]),
                Click.on(BTN_SEND)
        );

        actor.attemptsTo(
                FillMutiples.mods(LBL_MULTIPLES.resolveFor(actor).getText().split(" ")[7]),
                Enter.theValue(Count.letter(Integer.parseInt(LBL_WRITE_THE_LETTER.resolveFor(actor).getText()
                        .replace("\\'", "").split(" ")[1]),LBL_WRITE_THE_LETTER.resolveFor
                        (actor).getText().replace("'", "").split(" ")[5])).into(TXT_TEXTAREA),
                Click.on(BTN_SEND)
        );

        actor.attemptsTo(
                Enter.theValue(Count.letter(Integer.parseInt(LBL_WRITE_THE_LETTER.resolveFor(actor).getText()
                        .replace("\\'", "").split(" ")[1]),LBL_WRITE_THE_LETTER.resolveFor
                        (actor).getText().replace("'", "").split(" ")[5])).into(TXT_TEXTAREA),
                Enter.theValue(Count.resultOfEmojisCount(actor,
                        LBL_LIST_EMOJIS, LBL_EMOJI.resolveFor(actor).getText().split(" ")[2])).into(INPUT_NUMBER),
                Click.on(BTN_SEND)
        );


        actor.attemptsTo(
                WaitUntil.the(LBL_MATH_OPERATION, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(OPT_VALUES),
                Click.on(OPT_VALUE.of(Maths.Operation(LBL_MATH_OPERATION.resolveFor(actor).getText()))),
                Enter.theValue(LocalDate.now().plusDays(108).format(DateTimeFormatter.ofPattern
                        ("dd/MM/yyyy"))).into(INPUT_DATE),
                Click.on(BTN_SEND)
        );

        actor.attemptsTo(
                WaitUntil.the(LBL_MATH_OPERATION, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(RD_RESULT_OPERATION.of("-119119211")),
                Enter.theValue(Count.letter(Integer.parseInt(LBL_WRITE_THE_LETTER.resolveFor(actor).getText()
                        .replace("\\'", "").split(" ")[1]),LBL_WRITE_THE_LETTER.resolveFor
                        (actor).getText().replace("'", "").split(" ")[5])).into(TXT_TEXTAREA),
                Click.on(BTN_SEND)
        );

        actor.attemptsTo(
                WaitUntil.the(LBL_MATH_OPERATION, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(RD_RESULT_OPERATION.of(Maths.Operation(LBL_MATH_OPERATION.resolveFor(actor)
                        .getText().replace("=", "").replace("?", "")))),
                Enter.theValue(Count.letter(Integer.parseInt(LBL_WRITE_THE_LETTER.resolveFor(actor).getText()
                        .replace("\\'", "").split(" ")[1]),LBL_WRITE_THE_LETTER.resolveFor
                        (actor).getText().replace("'", "").split(" ")[5])).into(TXT_TEXTAREA),
                Click.on(BTN_SEND)
        );

        actor.attemptsTo(
                Enter.theValue(LocalDate.now().plusDays(98).format(DateTimeFormatter.ofPattern
                        ("dd/MM/yyyy"))).into(INPUT_DATE),
                FillMutiples.mods(LBL_MULTIPLES.resolveFor(actor).getText().split(" ")[7]),
                Click.on(BTN_SEND)
        );

    }
}
