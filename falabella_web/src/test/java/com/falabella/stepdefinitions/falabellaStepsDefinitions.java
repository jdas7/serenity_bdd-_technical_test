package com.falabella.stepdefinitions;

import com.falabella.navigation.NavigateTo;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class falabellaStepsDefinitions {

  @Before
  public void setTheStage() {
    OnStage.setTheStage(new OnlineCast());
  }

  @Given("^(.*) is a falabella customer who enters the online store")
  public void carlos_is_a_falabella_customer_who_enters_the_online_store(String actor) {
    theActorCalled(actor).attemptsTo(NavigateTo.HomePage());
  }

  @When("he selects yes, I love the offers")
  public void he_selects_yes_i_love_the_offers() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
  }
  @Then("he sees the pop up indicating that he will receive the store's offers")
  public void he_sees_the_pop_up_indicating_that_he_will_receive_the_store_s_offers() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
  }
}
