package com.aigner.similarity;

import org.junit.Test;

import java.util.Locale;

public class FuzzyScoreTest {

  @Test
  public void testEnglish() {
    FuzzyScore score = new FuzzyScore(Locale.ENGLISH);
    score.handle("AA", "a");
    score.handle("AA", "b");
    score.handle("AA", "AA");
  }


  @Test
  public void testGerman() {
    FuzzyScore score = new FuzzyScore(Locale.GERMAN);
    score.handle("Müller", "Müller");
    score.handle("Müller", "Muller");
    score.handle("Müller", "Mueller");
  }

}
