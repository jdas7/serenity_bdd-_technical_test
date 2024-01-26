package com.falabella.task;

import com.falabella.userinterfaces.FalabellaPageUI;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FalabellaNotification implements Task {


  @Step("view notification and accept")
  public static Task acceptNotification() {
    return Instrumented.instanceOf(FalabellaNotification.class).withProperties();
  }

  @Step("client accept notification")
  public <T extends Actor> void performAs(T user) {
    user.attemptsTo(
        Click.on(FalabellaPageUI.BUTTON_LOVE)
    );
  }


}
