package com.aigner.soundex;

import org.apache.commons.codec.EncoderException;

import java.util.Locale;

public class Soundex {

  private final Locale localeToUse;

  public Soundex(Locale localeToUse) {
    this.localeToUse = localeToUse;
  }

  public void handle(String term, String query) throws EncoderException {
    org.apache.commons.codec.language.Soundex soundex = new org.apache.commons.codec.language.Soundex();
    var scoreResult = soundex.difference(term, query);
    var s1 = soundex.encode(term);
    var s2 = soundex.encode(query);
    System.out.println("Soundex ... '" + term + "'('" + s1 + "') -> '" + query + "'(" + s2 + "')' difference ==> " + scoreResult);
  }

}
