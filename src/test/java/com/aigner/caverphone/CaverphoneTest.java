package com.aigner.caverphone;

import org.apache.commons.codec.EncoderException;
import org.junit.Test;

import java.util.Locale;

public class CaverphoneTest {

  @Test
  public void testGerman() throws EncoderException {
    Caverphone caverphone = new Caverphone(Locale.GERMAN);
    caverphone.handle("This is a longer text", "The Text is LONG");
    caverphone.handle("Foo", "FOO");
    caverphone.handle("Foo", "Fii");
    caverphone.handle("Foo", "Foo");
    caverphone.handle("Foosball", "Foosball");
    caverphone.handle("Foo", "Bar");
    caverphone.handle("Müller", "Mueller");
    caverphone.handle("Müller", "Miller");
    caverphone.handle("Müller", "Millerer");
    caverphone.handle("Anne-Maria", "Anne-Marie");
    caverphone.handle("Anne-Maria", "Annemarie");
    caverphone.handle("Anne-Maria", "Maria-Anne");
    caverphone.handle("Faßmann", "Fassmann");
    caverphone.handle("Faßmann", "Fressmann");
    caverphone.handle("Fißmann", "Faßmann");
  }

}
