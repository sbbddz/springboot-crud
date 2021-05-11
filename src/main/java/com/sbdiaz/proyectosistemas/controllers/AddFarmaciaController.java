package com.sbdiaz.proyectosistemas.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddFarmaciaController {

  @GetMapping("/addFarmacia")
  public String addFarmacia(@RequestParam String nombre, @RequestParam String ubicacion, @RequestParam String ventas) {
    return "";
  }

}
