package co.com.qvision.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class FormPage {

    public static final Target LBL_MATH_OPERATION = Target.the("Label of math operation.")
            .locatedBy("//p[@class = 'text-center text-xl']/following-sibling::p");
    public static final Target RD_RESULT_OPERATION = Target.the("Radio button of result operation")
            .locatedBy("//input[@value = '{0}']");

    public static final Target LBL_EMOJI = Target.the("Label of emoji to search.")
            .locatedBy("//p[contains(text(), 'Indique cuantos') and contains(text(), 'hay en la siguiente secuencia:')]");
    public static final Target LBL_LIST_EMOJIS = Target.the("Label of list emojis.")
            .locatedBy("(//p[@class = 'text-center text-xl'])[3]");
    public static final Target INPUT_NUMBER = Target.the("Input to number of emojis.")
            .locatedBy("//input[@type = 'number']");
    public static final Target OPT_VALUES = Target.the("Options of values about operation.")
            .locatedBy("//select[@name = 'select']");
    public static final Target OPT_VALUE = Target.the("Value in option")
            .locatedBy("//option[text() ='{0}']");
    public static final Target LBL_WRITE_THE_LETTER = Target.the("Label of write the letter.")
            .locatedBy("//p[contains(text(), 'Escriba') and contains(text(), 'veces la letra')]");
    public static final Target TXT_TEXTAREA = Target.the("Text area to write the letters")
            .locatedBy("//textarea[@name = 'text']");
    public static final Target LBL_MULTIPLES = Target.the("Label of multiples.")
            .locatedBy("//p[contains(text(), '¿Cuál de estos números es múltiplo de')]");
    public static final Target RD_ALL_RESTULTS = Target.the("Radio button of all results.")
            .locatedBy("//input[@type = 'checkbox']");
    public static final Target RD_RESULT = Target.the("Radio button of result.")
            .locatedBy("(//input[@name = 'checkbox'])[{0}]");
    public static final Target RD_RESTUL_SELECT = Target.the("Radio button about result to select.")
            .locatedBy("//input[@value= '{0}']");
    public static final Target INPUT_DATE = Target.the("Input of date.")
            .locatedBy("//input[@name = 'date']");
    public static final Target H1_FORM_DONE = Target.the("H1 to see if form is done.")
            .locatedBy("//h1[text() = 'Felicidades, has terminado la prueba exitosamente']");
    public static final Target LBL_TOKEN = Target.the("Label of token")
            .locatedBy("//p[contains(text(), '<General>')]");
}
