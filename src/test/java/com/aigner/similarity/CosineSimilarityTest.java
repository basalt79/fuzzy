package com.aigner.similarity;

import org.junit.Test;

public class CosineSimilarityTest {

  @Test
  public void testGerman() {
    CosineSimilarity score = new CosineSimilarity();
    score.handle("Müller", "Müller");
    score.handle("Müller", "Mueller");
    score.handle("This is a longer text", "The Text is LONG");
  }

}
