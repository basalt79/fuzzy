package com.aigner.caverphone;

import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.language.Caverphone1;
import org.apache.commons.codec.language.Caverphone2;

import java.util.Locale;

public class Caverphone {

  private final Locale localeToUse;

  public Caverphone(Locale localeToUse) {
    this.localeToUse = localeToUse;
  }

  public void handle(String term, String query) throws EncoderException {
    Caverphone1 caverphone1 = new Caverphone1();
    var score1Result = caverphone1.isEncodeEqual(term, query);
    System.out.println("Caverphone1 ... '" + term + "'('" + caverphone1.encode(term) + "') -> '" + query + "'(" + caverphone1.encode(query) + "')' ==> " + score1Result);
    Caverphone2 caverphone2 = new Caverphone2();
    var score2Result = caverphone2.isEncodeEqual(term, query);
    System.out.println("Caverphone2 ... '" + term + "'('" + caverphone2.encode(term) + "') -> '" + query + "'(" + caverphone2.encode(query)  + "')' ==> " + score2Result);
  }

}
