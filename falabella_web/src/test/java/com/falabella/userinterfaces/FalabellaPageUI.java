package com.falabella.userinterfaces;

import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class FalabellaPageUI {
  public static final Target BUTTON_CONSULT = Target.the("Boton, consulta de producto")
      .located(By.cssSelector("#testId-search-wrapper > div > button > img"));

  public static final Target SEARCH_FIELD = Target.the("campo de busqueda")
      .located(By.xpath("//*[@id=\"testId-SearchBar-Input\"]"));

  public static final Target BUTTON_LOVE = Target.the("boton, amo las ofertas")
      .located(By.cssSelector("#slider-faceta > div:nth-child(3) > a > img"));

  public static final Target LAPTOP = Target.the("pc seleccionado")
      .located(By.cssSelector("#testId-searchResults-products > div:nth-child(1)"));

  public static final Target CAR_ADD = Target.the("boton agregar carrito")
      .located(By.xpath("//*[@id=\"add-to-cart-button\"]"));

  public static final Target CAR_ADD_TEXT = Target.the("boton agregar carrito")
      .locatedBy("//button[contains(text(),'Agregar')]");

  public static final Target GO_TO_CAR = Target.the("ir al carrito")
      .located(By.xpath("//*[@id=\"linkButton\"]"));

  public static final Target CONTINUE_SHOPPING = Target.the("continuar compra")
      .located(By.xpath("//*[@id=\"popover-trigger-6\"]"));

  public static final Target EMAIL = Target.the("correo")
      .located(By.xpath("//*[@id=\"testId-Input-email\"]"));

  public static final Target NEXT_BUTTON = Target.the("boton, continuar")
      .located(By.xpath("//*[@id=\"continueButton\"]"));

  public static final Target DEPARTMENT = Target.the("lista departamento")
      .located(By.xpath("/html/body/div[6]/div/div[2]/div/div[1]/div/div/div/div/div/button"));

  public static final Target BOGOTA = Target.the("departamento")
      .located(By.xpath("/html/body/div[6]/div/div[2]/div/div[1]/div/div/ul/li[6]"));

  public static final Target CITY = Target.the("lista ciudad")
      .located(By.xpath("/html/body/div[6]/div/div[2]/div/div[2]/div/div/div/div/div/button/div/span/div/input"));

  public static final Target CITY_SELECT = Target.the("ciudad")
      .located(By.xpath("/html/body/div[6]/div/div[2]/div/div[2]/div/div/ul/li"));

  public static final Target DISTRICT = Target.the("lista barrio")
      .located(By.xpath("/html/body/div[6]/div/div[2]/div/div[3]/div/div/div/div/div/button"));

  public static final Target DISTRICT_SELECT = Target.the("barrio")
      .located(By.xpath("/html/body/div[6]/div/div[2]/div/div[3]/div/div/ul/li[1]"));

  public static final Target ADDRESS = Target.the("direccion")
      .located(By.xpath("//*[@id=\"testId-Input-street\"]"));

  public static final Target HOUSE = Target.the("casa")
      .located(By.xpath("//*[@id=\"testId-Input-department\"]"));

  public static final Target ADDRESS_CONFIRM = Target.the("confirmar direccion")
      .located(By.xpath("//*[@id=\"testId-infoModalFooter-button\"]"));

  public static final Target ADDRESS_SAVE = Target.the("confirmar y guardar direccion")
      .located(By.xpath("//*[@id=\"testId-infoModalFooter-button\"]"));

}
