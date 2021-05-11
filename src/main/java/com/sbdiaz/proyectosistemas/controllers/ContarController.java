package com.sbdiaz.proyectosistemas.controllers;

import com.sbdiaz.proyectosistemas.services.ContarService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContarController {

  @RequestMapping("/contar/{word}")
  public String contar(@PathVariable String word, Model model) {
    model.addAttribute("word", word);
    model.addAttribute("consonants", ContarService.countConsonants(word));
    model.addAttribute("vowels", ContarService.countVowels(word));
    return "contar";
  }

}
