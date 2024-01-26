package com.falabella.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OverflowUI {
  public static final Target TEXT_APPROVED = Target.the("Resumen de la compra")
      .located(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/div/div[1]/div/div[1]/span"));
}
