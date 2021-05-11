package com.sbdiaz.proyectosistemas.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContarService {

  static List<Character> vowels = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

  public static int countVowels(String word) {
    int vowelCount =
        (int) word.toLowerCase().chars().filter(ch -> vowels.contains((char) ch)).count();
    return vowelCount;
  }

  public static int countConsonants(String word) {
    int consonantCount =
        (int) word.toLowerCase().chars().filter(ch -> !vowels.contains((char) ch)).count();
    return consonantCount;
  }

}
