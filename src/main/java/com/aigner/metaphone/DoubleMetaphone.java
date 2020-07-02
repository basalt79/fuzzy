package com.aigner.metaphone;

import org.apache.commons.codec.EncoderException;

import java.util.Locale;

public class DoubleMetaphone {

  private final Locale localeToUse;

  public DoubleMetaphone(Locale localeToUse) {
    this.localeToUse = localeToUse;
  }

  public void handle(String term, String query) throws EncoderException {
    org.apache.commons.codec.language.DoubleMetaphone metaphone = new org.apache.commons.codec.language.DoubleMetaphone();
    var m1 = metaphone.encode(term);
    var m2 = metaphone.encode(query);

    var scoreResult = metaphone.isDoubleMetaphoneEqual(term, query);
    System.out.println("Metaphone ... '" + term + "'('" + m1 + "') -> '" + query + "('" + m2 + "')' ==> " + scoreResult);
  }

}
