package com.sbdiaz.proyectosistemas.controllers;

import com.sbdiaz.proyectosistemas.services.TraduceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TraduceController {
  
  @Autowired
  TraduceService traduceService;

  @RequestMapping("/traduce/{word}")
  public String traduce(@PathVariable String word, Model model) {
    String translatedWord = traduceService.translateToEnglish(word);
    model.addAttribute("word", translatedWord);
    return "traduce";    
  }

}
