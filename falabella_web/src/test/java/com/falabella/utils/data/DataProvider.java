package com.falabella.utils.data;

import com.falabella.exceptions.NotValidEnvironment;
import com.falabella.exceptions.UserNotFound;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

import java.util.HashMap;
import java.util.Optional;

public class DataProvider {
    @Steps(shared = true)
    private EnvironmentImplementation environment;

    JsonObject userData;

    @Step("Check if the role has test data")
    public void setUserRole(String clientType)
        throws UserNotFound, NotValidEnvironment {

        environment.initEnvironment();
        String data = null;
        HashMap<String, String> userScenario = new HashMap<>();

        userScenario.put("falabella customer who enters the online store", environment.falabellaClient());
        userScenario.put("falabella customer who wants to make a purchase", environment.falabellaClient());

        data = userScenario.get(clientType);
        Optional<String> dataOptional = Optional.ofNullable(data);
        String dataVerified = dataOptional
            .orElseThrow(() -> new UserNotFound("Type of user does not exist in the system"));

        this.userData = JsonParser.parseString(dataVerified).getAsJsonObject();
    }

    public JsonObject getUserData() {
        return this.userData;
    }
}
