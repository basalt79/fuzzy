package com.aigner.metaphone;

import org.apache.commons.codec.EncoderException;

import java.util.Locale;

public class Metaphone {

  private final Locale localeToUse;

  public Metaphone(Locale localeToUse) {
    this.localeToUse = localeToUse;
  }

  public void handle(String term, String query) throws EncoderException {
    org.apache.commons.codec.language.Metaphone metaphone = new org.apache.commons.codec.language.Metaphone();
    var m1 = metaphone.encode(term);
    var m2 = metaphone.encode(query);

    var scoreResult = metaphone.isMetaphoneEqual(term, query);
    System.out.println("Metaphone ... '" + term + "'('" + m1 + "') -> '" + query + "'(" + m2 + "')' ==> " + scoreResult);
  }

}
