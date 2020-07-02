package com.aigner.nysiis;

import org.apache.commons.codec.EncoderException;
import org.junit.Test;

public class NysiisTest {

  @Test
  public void testStrict() throws EncoderException {
    Nysiis nysiis = new Nysiis(true);
    nysiis.handle("This is a longer text", "The Text is LONG");
    nysiis.handle("Foo", "FOO");
    nysiis.handle("Foo", "Fii");
    nysiis.handle("Foo", "Foo");
    nysiis.handle("Foosball", "Foosball");
    nysiis.handle("Foo", "Bar");
    nysiis.handle("Müller", "Mueller");
    nysiis.handle("Müller", "Miller");
    nysiis.handle("Müller", "Millerer");
    nysiis.handle("Anne-Maria", "Anne-Marie");
    nysiis.handle("Anne-Maria", "Annemarie");
    nysiis.handle("Anne-Maria", "Maria-Anne");
    nysiis.handle("Faßmann", "Fassmann");
    nysiis.handle("Faßmann", "Fressmann");
    nysiis.handle("Fißmann", "Faßmann");
  }

  @Test
  public void testNotStrict() throws EncoderException {
    Nysiis nysiis = new Nysiis(false);
    nysiis.handle("This is a longer text", "The Text is LONG");
    nysiis.handle("Foo", "FOO");
    nysiis.handle("Foo", "Fii");
    nysiis.handle("Foo", "Foo");
    nysiis.handle("Foosball", "Foosball");
    nysiis.handle("Foo", "Bar");
    nysiis.handle("Müller", "Mueller");
    nysiis.handle("Müller", "Miller");
    nysiis.handle("Müller", "Millerer");
    nysiis.handle("Anne-Maria", "Anne-Marie");
    nysiis.handle("Anne-Maria", "Annemarie");
    nysiis.handle("Anne-Maria", "Maria-Anne");
    nysiis.handle("Faßmann", "Fassmann");
    nysiis.handle("Faßmann", "Fressmann");
    nysiis.handle("Fißmann", "Faßmann");
  }

}
