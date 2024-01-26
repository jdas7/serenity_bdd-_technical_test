package com.falabella.stepdefinitions;

import com.falabella.config.StepBase;
import com.falabella.task.FalabellaNotification;
import com.falabella.task.FalabellaProduct;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class FalabellaStepsDefinitions extends StepBase {

  private static final String PRODUCT = "product";
  private static final String EMAIL = "email";

  @Before
  public void setTheStage() {
    OnStage.setTheStage(new OnlineCast());
  }

  @When("he selects yes, I love the offers")
  public void he_selects_yes_i_love_the_offers() {
        OnStage.withCurrentActor(
            FalabellaNotification.acceptNotification()
        );
  }

  @When("he adds a product to the shopping cart")
  public void he_adds_a_product_to_the_shopping_cart() {
    OnStage.withCurrentActor(
        FalabellaProduct.productPurchase(
            dataProvider.getUserData().get(PRODUCT).getAsString(),
            dataProvider.getUserData().get(EMAIL).getAsString())
    );
  }

  @Then("he sees the pop up indicating that he will receive the store's offers")
  public void he_sees_the_pop_up_indicating_that_he_will_receive_the_store_s_offers() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
  }
}
