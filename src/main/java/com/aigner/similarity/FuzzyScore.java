package com.aigner.similarity;

import java.util.Locale;

public class FuzzyScore {

  private final Locale localeToUse;

  public FuzzyScore(Locale localeToUse) {
    this.localeToUse = localeToUse;
  }

  public void handle(String term, String query) {
    org.apache.commons.text.similarity.FuzzyScore score = new org.apache.commons.text.similarity.FuzzyScore(localeToUse);
    var scoreResult = score.fuzzyScore(term, query);
    System.out.println("FuzzyScore ... '" + term + "' -> '" + query + "' ==> " + scoreResult);
  }


}
