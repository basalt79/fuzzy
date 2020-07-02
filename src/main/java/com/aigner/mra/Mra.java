package com.aigner.mra;

import org.apache.commons.codec.language.MatchRatingApproachEncoder;

public class Mra {

  public void handle(String term, String query) {
    MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
    var scoreResult = encoder.isEncodeEquals(term, query);
    System.out.println("Mra ... '" + term + "'('" + encoder.encode(term) + "') -> '" + query + "'(" + encoder.encode(query) + "')' ==> " + scoreResult);
  }

}
