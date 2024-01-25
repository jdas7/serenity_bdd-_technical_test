package com.falabella.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class falabellaStepsDefinitions {

  @Before
  public void setTheStage() {
    OnStage.setTheStage(new OnlineCast());
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
