package com.aigner.similarity;

import com.aigner.FuzzyHandler;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CosineSimilarity implements FuzzyHandler {

  @Override
  public void handle(String term, String query) {
    org.apache.commons.text.similarity.CosineSimilarity similarity = new org.apache.commons.text.similarity.CosineSimilarity();

    Map<CharSequence, Integer> vectorA = Arrays.stream(term.split(" ")).collect(Collectors.toMap(
      character -> character, character -> 1, Integer::sum));
    Map<CharSequence, Integer> vectorB = Arrays.stream(query.split(" ")).collect(Collectors.toMap(
      character -> character, character -> 1, Integer::sum));

    Double docABCosSimilarity = similarity.cosineSimilarity(vectorA, vectorB);

    System.out.println("CosineSimilarity ... '" + term + "' -> '" + query + "' ==> " + docABCosSimilarity);
  }
}
