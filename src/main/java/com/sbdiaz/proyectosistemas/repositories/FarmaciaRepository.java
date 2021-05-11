package com.sbdiaz.proyectosistemas.repositories;

import com.sbdiaz.proyectosistemas.models.FarmaciaModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FarmaciaRepository extends CrudRepository<FarmaciaModel, Long>{

}