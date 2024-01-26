package com.falabella.task;

import com.falabella.userinterfaces.FalabellaPageUI;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FalabellaPurchaseRequest implements Task {

  private String email;
  private String address;
  private String house;

  @Step("enter the product to consult")
  public static Task productPurchase(String email, String address, String house) {
    return Instrumented.instanceOf(FalabellaPurchaseRequest.class).withProperties(email, address, house);
  }

  public FalabellaPurchaseRequest(String email, String address, String house) {
    this.email = email;
    this.address = address;
    this.house = house;
  }

  @Step("customer consults your product")
  public <T extends Actor> void performAs(T user) {
    user.attemptsTo(
        WaitUntil.the(FalabellaPageUI.CONTINUE_SHOPPING, isEnabled()),
        Click.on(FalabellaPageUI.CONTINUE_SHOPPING),
        WaitUntil.the(FalabellaPageUI.EMAIL, isVisible()),
        WaitUntil.the(FalabellaPageUI.EMAIL, isEnabled()),
        Enter.theValue(email).into(FalabellaPageUI.EMAIL),
        Click.on(FalabellaPageUI.NEXT_BUTTON),
        Click.on(FalabellaPageUI.DEPARTMENT),
        Click.on(FalabellaPageUI.BOGOTA),
        Click.on(FalabellaPageUI.CITY),
        Click.on(FalabellaPageUI.CITY_SELECT),
        Click.on(FalabellaPageUI.DISTRICT),
        Click.on(FalabellaPageUI.DISTRICT_SELECT),
        WaitUntil.the(FalabellaPageUI.ADDRESS, isVisible()),
        WaitUntil.the(FalabellaPageUI.ADDRESS, isEnabled()),
        Enter.theValue(address).into(FalabellaPageUI.ADDRESS),
        WaitUntil.the(FalabellaPageUI.HOUSE, isVisible()),
        WaitUntil.the(FalabellaPageUI.HOUSE, isEnabled()),
        Enter.theValue(house).into(FalabellaPageUI.HOUSE),
        Click.on(FalabellaPageUI.ADDRESS_CONFIRM),
        Click.on(FalabellaPageUI.ADDRESS_SAVE)
    );

  }


}
