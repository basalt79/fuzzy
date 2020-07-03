package com.aigner.nysiis;

import com.aigner.FuzzyHandler;

public class Nysiis implements FuzzyHandler {

  @Override
  public void handle(String term, String query) {
    org.apache.commons.codec.language.Nysiis nysiis = new org.apache.commons.codec.language.Nysiis();
    System.out.println("Nysiis ... '" + term + "'('" + nysiis.encode(term) + "') -> '" + query + "'(" + nysiis.encode(query) + "')' ==> ");
  }

}
