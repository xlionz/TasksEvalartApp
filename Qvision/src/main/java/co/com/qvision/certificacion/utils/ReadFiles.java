package co.com.qvision.certificacion.utils;

import co.com.qvision.certificacion.models.User;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReadFiles {

    public static final Logger LOGGER = LoggerFactory.getLogger(ReadFiles.class);
    public static final EnvironmentVariables CONF = SystemEnvironmentVariables.createEnvironmentVariables();
    public static final String CONFIG_USER = "users.";

    public static User readUser(String user){
        LOGGER.info("Se crea el objeto");
        return new User(
                CONF.getProperty(CONFIG_USER + user + ".username"),
                CONF.getProperty(CONFIG_USER + user + ".password")
        );
    }
}
