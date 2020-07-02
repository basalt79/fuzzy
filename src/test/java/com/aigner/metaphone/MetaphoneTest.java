package com.aigner.metaphone;

import org.apache.commons.codec.EncoderException;
import org.junit.Test;

import java.util.Locale;

public class MetaphoneTest {

  @Test
  public void testGerman() throws EncoderException {
    Metaphone metaphone = new Metaphone(Locale.GERMAN);
    metaphone.handle("This is a longer text", "The Text is LONG");
    metaphone.handle("Foo", "FOO");
    metaphone.handle("Foo", "Fii");
    metaphone.handle("Foo", "Foo");
    metaphone.handle("Foosball", "Foosball");
    metaphone.handle("Foo", "Bar");
    metaphone.handle("Müller", "Mueller");
    metaphone.handle("Müller", "Miller");
    metaphone.handle("Müller", "Millerer");
    metaphone.handle("Anne-Maria", "Anne-Marie");
    metaphone.handle("Anne-Maria", "Annemarie");
    metaphone.handle("Anne-Maria", "Maria-Anne");
    metaphone.handle("Faßmann", "Fassmann");
    metaphone.handle("Faßmann", "Fressmann");
    metaphone.handle("Fißmann", "Faßmann");
  }

}
