package co.com.qvision.certificacion.utils;

import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;

import static net.serenitybdd.core.environment.EnvironmentSpecificConfiguration.from;

public class Constans {

    private static final EnvironmentVariables CONF = SystemEnvironmentVariables.createEnvironmentVariables();
    public static final String DEFAULT_BROWSER = from(CONF).getProperty("config.browser.default");
    public static final String CHROME = "Chrome";

    public static final String URL_EVALART_APP = "https://tasks.evalartapp.com/automatization";
}
