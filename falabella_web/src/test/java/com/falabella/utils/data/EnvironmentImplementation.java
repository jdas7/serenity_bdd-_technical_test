package com.falabella.utils.data;

import com.falabella.exceptions.NotValidEnvironment;
import net.thucydides.core.annotations.Step;
import org.aeonbits.owner.ConfigFactory;

public class EnvironmentImplementation implements Environment {

    private Environment environment;

    @Step("Validate that test data exists for the specified environment")
    public void initEnvironment() throws NotValidEnvironment {
        if (environment == null) {
            environment = ConfigFactory.create(Environment.class);
        }
        if (environment.toString().equals("{}")) {
            throw new NotValidEnvironment(
                "**** Cause: Not a valid environment, or not specified. Please use -Denvironment=env_name ****");
        }
    }

    @Override
    public String falabellaClient() {
        return environment.falabellaClient();
    }

}
