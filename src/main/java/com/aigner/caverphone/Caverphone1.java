package com.aigner.caverphone;

import com.aigner.FuzzyHandler;
import org.apache.commons.codec.EncoderException;

public class Caverphone1 implements FuzzyHandler {

  @Override
  public void handle(String term, String query) {
    org.apache.commons.codec.language.Caverphone1 caverphone1 = new org.apache.commons.codec.language.Caverphone1();
    boolean score1Result = false;
    try {
      score1Result = caverphone1.isEncodeEqual(term, query);
    } catch (EncoderException e) {
      e.printStackTrace();
    }
    System.out.println("Caverphone1 ... '" + term + "'('" + caverphone1.encode(term) + "') -> '" + query + "'(" + caverphone1.encode(query) + "')' ==> " + score1Result);
  }

}
