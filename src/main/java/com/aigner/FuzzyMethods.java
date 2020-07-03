package com.aigner;

import com.aigner.caverphone.Caverphone1;
import com.aigner.caverphone.Caverphone2;
import com.aigner.levenshtein.LevenshteinDistance;
import com.aigner.metaphone.DoubleMetaphone;
import com.aigner.metaphone.Metaphone;
import com.aigner.mra.Mra;
import com.aigner.similarity.CosineSimilarity;
import com.aigner.similarity.FuzzyScore;
import com.aigner.soundex.Soundex;

public enum FuzzyMethods {

  CAVERPHONE_1 {
    @Override
    public FuzzyHandler create() {
      return new Caverphone1();
    }
  },
  CAVERPHONE_2 {
    @Override
    public FuzzyHandler create() {
      return new Caverphone2();
    }
  },
  LEVENSHTEIN {
    @Override
    public FuzzyHandler create() {
      return new LevenshteinDistance();
    }
  },
  METAPHONE {
    @Override
    public FuzzyHandler create() {
      return new Metaphone();
    }
  },
  DOUBLE_METAPHONE {
    @Override
    public FuzzyHandler create() {
      return new DoubleMetaphone();
    }
  },
  MRA {
    @Override
    public FuzzyHandler create() {
      return new Mra();
    }
  },
  COSINE {
    @Override
    public FuzzyHandler create() {
      return new CosineSimilarity();
    }
  },
  FUZZY_SCORE {
    @Override
    public FuzzyHandler create() {
      return new FuzzyScore();
    }
  },
  SOUND_EX {
    @Override
    public FuzzyHandler create() {
      return new Soundex();
    }
  };

  public abstract FuzzyHandler create();
}
