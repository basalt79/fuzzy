package com.aigner.soundex;

import com.aigner.FuzzyHandler;
import org.apache.commons.codec.EncoderException;

public class Soundex implements FuzzyHandler {

  @Override
  public void handle(String term, String query) {
    org.apache.commons.codec.language.Soundex soundex = new org.apache.commons.codec.language.Soundex();
    int scoreResult = 0;
    try {
      scoreResult = soundex.difference(term, query);
    } catch (EncoderException e) {
      e.printStackTrace();
    }
    var s1 = soundex.encode(term);
    var s2 = soundex.encode(query);
    System.out.println("Soundex ... '" + term + "'('" + s1 + "') -> '" + query + "'(" + s2 + "')' difference ==> " + scoreResult);
  }

}
