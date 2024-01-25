package com.falabella.stepdefinitions;

import com.falabella.config.StepBase;
import com.falabella.exceptions.NotValidEnvironment;
import com.falabella.exceptions.UserNotFound;
import com.falabella.navigation.NavigateTo;
import io.cucumber.java.en.Given;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class GivenStepDefinition extends StepBase {
    @Given("^(.*) is a (.*)$")
    public void userRole(String actor, String userRole) throws UserNotFound, NotValidEnvironment {
        theActorCalled(actor).attemptsTo(NavigateTo.HomePage());
        dataProvider.setUserRole(userRole);
    }
}
