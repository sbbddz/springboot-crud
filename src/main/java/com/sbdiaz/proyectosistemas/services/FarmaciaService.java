package com.sbdiaz.proyectosistemas.services;

import java.util.ArrayList;
import com.sbdiaz.proyectosistemas.models.FarmaciaModel;
import com.sbdiaz.proyectosistemas.repositories.FarmaciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FarmaciaService {
  @Autowired
  FarmaciaRepository farmaciaRepository;

  public FarmaciaModel addFarmacia(FarmaciaModel farmaciaModel) {
    return farmaciaRepository.save(farmaciaModel);
  }

  public ArrayList<FarmaciaModel> getFarmacias() {
    return (ArrayList<FarmaciaModel>) farmaciaRepository.findAll();
  }
}
