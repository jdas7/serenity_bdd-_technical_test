package com.falabella.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
  public static Performable HomePage() {
    return Task.where("{0} opens the Falabella home page",
        Open.browserOn().the(HomePage.class));
  }
}
