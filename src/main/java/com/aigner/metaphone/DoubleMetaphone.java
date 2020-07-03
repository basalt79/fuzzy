package com.aigner.metaphone;

import com.aigner.FuzzyHandler;

public class DoubleMetaphone implements FuzzyHandler {

  @Override
  public void handle(String term, String query) {
    org.apache.commons.codec.language.DoubleMetaphone metaphone = new org.apache.commons.codec.language.DoubleMetaphone();
    var m1 = metaphone.encode(term);
    var m2 = metaphone.encode(query);

    var scoreResult = metaphone.isDoubleMetaphoneEqual(term, query);
    System.out.println("Metaphone ... '" + term + "'('" + m1 + "') -> '" + query + "('" + m2 + "')' ==> " + scoreResult);
  }

}
