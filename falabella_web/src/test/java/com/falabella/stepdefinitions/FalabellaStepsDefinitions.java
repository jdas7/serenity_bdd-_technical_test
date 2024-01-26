package com.falabella.stepdefinitions;

import com.falabella.config.StepBase;
import com.falabella.questions.OverflowQuestion;
import com.falabella.task.FalabellaNotification;
import com.falabella.task.FalabellaProduct;
import com.falabella.task.FalabellaPurchaseRequest;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.Matchers.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FalabellaStepsDefinitions extends StepBase {

  private static final int WAIT_NEXT_WINDOW = 2;
  private static final String PRODUCT = "product";
  private static final String EMAIL = "email";
  private static final String ADDRESS = "address";
  private static final String HOUSE = "house";

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
        FalabellaProduct.product(
            dataProvider.getUserData().get(PRODUCT).getAsString())
    );
  }

  @And("makes the purchase request")
  public void makes_the_purchase_request() throws InterruptedException {
    TimeUnit.SECONDS.sleep(WAIT_NEXT_WINDOW);
    OnStage.withCurrentActor(
        FalabellaPurchaseRequest.productPurchase(
            dataProvider.getUserData().get(EMAIL).getAsString(),
            dataProvider.getUserData().get(ADDRESS).getAsString(),
            dataProvider.getUserData().get(HOUSE).getAsString())
    );
  }

  @Then("he sees the pop up indicating that he will receive the store's offers")
  public void he_sees_the_pop_up_indicating_that_he_will_receive_the_store_s_offers() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
  }

  @Then("he will be able to see the summary of his order")
  public void he_will_be_able_to_see_the_summary_of_his_order() {
    theActorInTheSpotlight()
        .should(seeThat("Validación texto de error", OverflowQuestion.textForm(),
            equalTo("Resumen de la compra")));
  }
}
