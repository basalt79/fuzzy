package com.aigner.levenshtein;

import com.aigner.FuzzyHandler;

public class LevenshteinDistance implements FuzzyHandler {

  @Override
  public void handle(String term, String query) {
    org.apache.commons.text.similarity.LevenshteinDistance distance = new org.apache.commons.text.similarity.LevenshteinDistance();
    var result = distance.apply(term, query);
    System.out.println("LevenshteinDistance ... '" + term + "' -> '" + query + "' ==> " + result);
  }

}
