package com.sbdiaz.proyectosistemas.controllers;

import com.sbdiaz.proyectosistemas.services.TransformaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TransformaController {

  @RequestMapping("/mirror/{word}")
  public String mirror(@PathVariable String word, Model model) {
    String mirrorWord = TransformaService.mirrorWord(word);
    model.addAttribute("word", mirrorWord);
    return "transforma";
  }

}