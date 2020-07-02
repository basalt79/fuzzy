package com.aigner.levenshtein;

import org.apache.commons.codec.EncoderException;
import org.junit.Test;

import java.util.Locale;

public class LevenshteinDistanceTest {

  @Test
  public void testGerman() throws EncoderException {
    LevenshteinDistance levenshteinDistance = new LevenshteinDistance(Locale.GERMAN);
    levenshteinDistance.handle("This is a longer text", "The Text is LONG");
    levenshteinDistance.handle("Foo", "Foo");
    levenshteinDistance.handle("Foo", "FOO");
    levenshteinDistance.handle("Foo", "Fii");
    levenshteinDistance.handle("Foosball", "Foosball");
    levenshteinDistance.handle("Foo", "Bar");
    levenshteinDistance.handle("Müller", "Mueller");
    levenshteinDistance.handle("Müller", "Miller");
    levenshteinDistance.handle("Müller", "Millerer");
    levenshteinDistance.handle("Anne-Maria", "Anne-Marie");
    levenshteinDistance.handle("Anne-Maria", "Annemarie");
    levenshteinDistance.handle("Anne-Maria", "Maria-Anne");
    levenshteinDistance.handle("Faßmann", "Fassmann");
    levenshteinDistance.handle("Faßmann", "Fressmann");
  }


}
