package com.falabella.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import com.falabella.userinterfaces.OverflowUI;

public class OverflowQuestion {

  public static Question<String> textForm() {
    return actor -> String.valueOf(Text.of(OverflowUI.TEXT_APPROVED).asString());
  }
}
