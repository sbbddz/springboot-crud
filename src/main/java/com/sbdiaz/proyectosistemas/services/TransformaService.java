package com.sbdiaz.proyectosistemas.services;

public class TransformaService {
  
  public static String mirrorWord(String word) {
    return word.concat(reverseWord(word).substring(1, word.length()));
  }

  public static String reverseWord(String word) {
    return new StringBuilder(word).reverse().toString();
  }
}
