package com.sbdiaz.proyectosistemas.controllers;

import com.sbdiaz.proyectosistemas.models.FarmaciaModel;
import com.sbdiaz.proyectosistemas.services.FarmaciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddFarmaciaController {

  @Autowired
  FarmaciaService farmaciaService;

  @GetMapping("/addFarmacia")
  public String addFarmacia(@RequestParam String nombre, @RequestParam String ubicacion, @RequestParam String ventas) {
    FarmaciaModel farmaciaModel = new FarmaciaModel();
    farmaciaModel.setNombre(nombre);
    farmaciaModel.setUbicacion(ubicacion);
    farmaciaModel.setVentas(Integer.valueOf(ventas));
    farmaciaService.addFarmacia(farmaciaModel);
    return farmaciaModel.toString();
  }

}
