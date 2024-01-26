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
  private String email;

  @Step("enter the product to consult")
  public static Task productPurchase(String product, String email) {
    return Instrumented.instanceOf(FalabellaProduct.class).withProperties(product, email);
  }

  public FalabellaProduct(String product, String email) {
    this.product = product;
    this.email = email;
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
        WaitUntil.the(FalabellaPageUI.GAMING_PC, isVisible()),
        WaitUntil.the(FalabellaPageUI.GAMING_PC, isEnabled()),
        Click.on(FalabellaPageUI.GAMING_PC),
        WaitUntil.the(FalabellaPageUI.LAPTOP, isEnabled()),
        Click.on(FalabellaPageUI.LAPTOP),
        Click.on(Button.called("Agregar")),
//        WaitUntil.the(FalabellaPageUI.CAR_ADD, isEnabled()),
//        Click.on(FalabellaPageUI.CAR_ADD),
        WaitUntil.the(FalabellaPageUI.GO_TO_CAR, isEnabled()),
        Click.on(FalabellaPageUI.GO_TO_CAR),
        WaitUntil.the(FalabellaPageUI.CONTINUE_SHOPPING, isEnabled()),
        Click.on(FalabellaPageUI.CONTINUE_SHOPPING),
        WaitUntil.the(FalabellaPageUI.EMAIL, isVisible()),
        WaitUntil.the(FalabellaPageUI.EMAIL, isEnabled()),
        Enter.theValue(email).into(FalabellaPageUI.EMAIL)
    );

  }


}
