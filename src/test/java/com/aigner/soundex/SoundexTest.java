package com.aigner.soundex;

import org.apache.commons.codec.EncoderException;
import org.junit.Test;

import java.util.Locale;

public class SoundexTest {

  @Test
  public void testGerman() throws EncoderException {
    Soundex soundex = new Soundex(Locale.GERMAN);
    soundex.handle("Knuth", "Kant");
    soundex.handle("This is a longer text", "The Text is LONG");
    soundex.handle("Foo", "FOO");
    soundex.handle("Foo", "Fii");
    soundex.handle("Foo", "Foo");
    soundex.handle("Foosball", "Foosball");
    soundex.handle("Foo", "Bar");
    soundex.handle("Anne-Maria", "Anne-Marie");
    soundex.handle("Anne-Maria", "Annemarie");
    soundex.handle("Anne-Maria", "Maria-Anne");
    soundex.handle("Faßmann", "Fassmann");
    soundex.handle("Faßmann", "Fressmann");
    soundex.handle("Fißmann", "Faßmann");

  }


}
