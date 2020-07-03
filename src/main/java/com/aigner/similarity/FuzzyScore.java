package com.aigner.similarity;

import com.aigner.FuzzyHandler;

import java.util.Locale;

public class FuzzyScore implements FuzzyHandler {

  @Override
  public void handle(String term, String query) {
    org.apache.commons.text.similarity.FuzzyScore score = new org.apache.commons.text.similarity.FuzzyScore(Locale.GERMAN);
    var scoreResult = score.fuzzyScore(term, query);
    System.out.println("FuzzyScore ... '" + term + "' -> '" + query + "' ==> " + scoreResult);
  }


}
