package co.com.qvision.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target INPUT_USERNAME = Target.the("Input of username.")
            .locatedBy("//input[@name = 'username']");
    public static final Target INPUT_PASSWORD = Target.the("Input of password.")
            .locatedBy("//input[@name = 'password']");
    public static final Target BTN_SEND = Target.the("Button to send login")
            .locatedBy("//button[@type= 'submit']");
}
