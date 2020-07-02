package com.aigner.mra;

import org.junit.Test;


public class MraTest {

  @Test
  public void testGerman() {
    Mra mra = new Mra();
    mra.handle("This is a longer text", "The Text is LONG");
    mra.handle("Foo", "FOO");
    mra.handle("Foo", "Fii");
    mra.handle("Foo", "Foo");
    mra.handle("Foosball", "Foosball");
    mra.handle("Foo", "Bar");
    mra.handle("Müller", "Mueller");
    mra.handle("Müller", "Miller");
    mra.handle("Müller", "Millerer");
    mra.handle("Anne-Maria", "Anne-Marie");
    mra.handle("Anne-Maria", "Annemarie");
    mra.handle("Anne-Maria", "Maria-Anne");
    mra.handle("Faßmann", "Fassmann");
    mra.handle("Faßmann", "Fressmann");
    mra.handle("Fißmann", "Faßmann");
  }


}
