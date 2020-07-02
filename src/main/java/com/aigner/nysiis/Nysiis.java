package com.aigner.nysiis;

import org.apache.commons.codec.EncoderException;

public class Nysiis {

  private final boolean strict;

  public Nysiis(boolean strict) {
    this.strict = strict;
  }

  public void handle(String term, String query) throws EncoderException {
    org.apache.commons.codec.language.Nysiis nysiis = new org.apache.commons.codec.language.Nysiis(strict);
    System.out.println("Nysiis (" + strict + ") ... '" + term + "'('" + nysiis.encode(term) + "') -> '" + query + "'(" + nysiis.encode(query) + "')' ==> ");
  }

}
