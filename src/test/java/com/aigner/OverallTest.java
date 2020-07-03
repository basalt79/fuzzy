package com.aigner;

import org.apache.commons.codec.EncoderException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class OverallTest {

  private final String term;
  private final String query;

  public OverallTest(String term, String query) {
    this.term = term;
    this.query = query;
  }

  @Parameterized.Parameters(name = "{0} - {1}")
  public static Collection data() {
    return Arrays.asList(new Object[][]{
      {"This is a longer text", "The Text is LONG"},
      {"Foo", "FOO"},
      {"Foo", "Fii"},
      {"Foo", "Foo"},
      {"Foosball", "Foosball"},
      {"Foo", "Bar"},
      {"Anne-Maria", "Anne-Marie"},
      {"Anne-Maria", "Annemarie"},
      {"Anne-Maria", "Maria-Anne"},
      {"Faßmann", "Fassmann"},
      {"Faßmann", "Fressmann"},
      {"Fißmann", "Faßmann"},
      {"SMITH", "smith"}
    });
  }

  @Test
  public void runTest() throws EncoderException {
    Arrays.stream(FuzzyMethods.values()).forEach(m -> m.create().handle(term, query));
  }

}
