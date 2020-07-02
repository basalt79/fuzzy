package com.aigner.levenshtein;

import org.apache.commons.codec.EncoderException;

import java.util.Locale;

public class LevenshteinDistance {

  private final Locale localeToUse;

  public LevenshteinDistance(Locale localeToUse) {
    this.localeToUse = localeToUse;
  }

  public void handle(String term, String query) throws EncoderException {
    org.apache.commons.text.similarity.LevenshteinDistance distance = new org.apache.commons.text.similarity.LevenshteinDistance();
    var result = distance.apply(term, query);
    System.out.println("LevenshteinDistance ... '" + term + "' -> '" + query + "' ==> " + result);
  }

}
