package com.aigner.caverphone;

import com.aigner.FuzzyHandler;
import org.apache.commons.codec.EncoderException;

public class Caverphone2 implements FuzzyHandler {

  @Override
  public void handle(String term, String query) {
    org.apache.commons.codec.language.Caverphone2 caverphone2 = new org.apache.commons.codec.language.Caverphone2();
    boolean score2Result = false;
    try {
      score2Result = caverphone2.isEncodeEqual(term, query);
    } catch (EncoderException e) {
      e.printStackTrace();
    }
    System.out.println("Caverphone2 ... '" + term + "'('" + caverphone2.encode(term) + "') -> '" + query + "'(" + caverphone2.encode(query) + "')' ==> " + score2Result);
  }

}
