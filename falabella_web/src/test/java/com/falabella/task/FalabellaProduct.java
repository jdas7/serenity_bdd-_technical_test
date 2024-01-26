package com.falabella.task;

import com.falabella.userinterfaces.FalabellaPageUI;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import net.serenitybdd.screenplay.ui.Button;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FalabellaProduct implements Task {

  private String product;

  @Step("enter the product to consult")
  public static Task product(String product) {
    return Instrumented.instanceOf(FalabellaProduct.class).withProperties(product);
  }

  public FalabellaProduct(String product) {
    this.product = product;
  }

  @Step("customer consults your product")
  public <T extends Actor> void performAs(T user) {
    user.attemptsTo(
        WaitUntil.the(FalabellaPageUI.SEARCH_FIELD, isVisible()),
        WaitUntil.the(FalabellaPageUI.SEARCH_FIELD, isEnabled()),
        Enter.theValue(product).into(FalabellaPageUI.SEARCH_FIELD),
        WaitUntil.the(FalabellaPageUI.BUTTON_CONSULT, isVisible()),
        WaitUntil.the(FalabellaPageUI.BUTTON_CONSULT, isEnabled()),
        Click.on(FalabellaPageUI.BUTTON_CONSULT),
        WaitUntil.the(FalabellaPageUI.LAPTOP, isEnabled()),
        Click.on(FalabellaPageUI.LAPTOP),
        Click.on(FalabellaPageUI.CAR_ADD),
        Click.on(FalabellaPageUI.GO_TO_CAR)
    );

  }


}
