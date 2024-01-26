package com.falabella.userinterfaces;

import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class FalabellaPageUI {
  public static final Target BUTTON_CONSULT = Target.the("Boton, amo las ofertas")
      .located(By.cssSelector("#testId-search-wrapper > div > button > img"));

  public static final Target SEARCH_FIELD = Target.the("campo de busqueda")
      .located(By.xpath("//*[@id=\"testId-SearchBar-Input\"]"));

  public static final Target GAMING_PC = Target.the("imagen computadores gaming")
      .located(By.cssSelector("#slider-faceta > div:nth-child(3) > a > img"));

  public static final Target LAPTOP = Target.the("pc seleccionado")
      .located(By.cssSelector("#testId-pod-72729328"));

  public static final Target CAR_ADD = Target.the("boton agregar carrito")
      .located(By.cssSelector("#product-b2c-ui div.jsx-1942312284.addToCart-container.fa--add-to-cart__mobile.quantity-input"));

  public static final Target GO_TO_CAR = Target.the("ir al carrito")
      .located(By.xpath("//*[@id=\"linkButton\"]"));

  public static final Target CONTINUE_SHOPPING = Target.the("continuar compra")
      .located(By.cssSelector("#popover-trigger-6"));

  public static final Target EMAIL = Target.the("correo")
      .located(By.xpath("//*[@id=\"testId-Input-email\"]"));

}
