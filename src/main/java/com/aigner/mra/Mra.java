package com.aigner.mra;

import com.aigner.FuzzyHandler;
import org.apache.commons.codec.language.MatchRatingApproachEncoder;

public class Mra implements FuzzyHandler {

  @Override
  public void handle(String term, String query) {
    MatchRatingApproachEncoder encoder = new MatchRatingApproachEncoder();
    var scoreResult = encoder.isEncodeEquals(term, query);
    System.out.println("Mra ... '" + term + "'('" + encoder.encode(term) + "') -> '" + query + "'(" + encoder.encode(query) + "')' ==> " + scoreResult);
  }

}
