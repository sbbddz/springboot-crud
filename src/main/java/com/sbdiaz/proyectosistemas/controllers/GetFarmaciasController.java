package com.sbdiaz.proyectosistemas.controllers;

import java.util.ArrayList;
import com.sbdiaz.proyectosistemas.models.FarmaciaModel;
import com.sbdiaz.proyectosistemas.services.FarmaciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GetFarmaciasController {
  
  @Autowired
  FarmaciaService farmaciaService;

  @RequestMapping("/listarFarmacias")
  public String getAllFarmacies(Model model) {
    ArrayList<FarmaciaModel> farmacias = farmaciaService.getFarmacias();
    model.addAttribute("farmacias", farmacias);
    return "listaFarmacias";
  }

}
