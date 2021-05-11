package com.sbdiaz.proyectosistemas.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "farmacia")
public class FarmaciaModel {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(unique = true, nullable = false)
  private int uuid;

  private String nombre;

  private String ubicacion;

  private int ventas;

  public int getUuid() {
    return uuid;
  }

  public void setUuid(int uuid) {
    this.uuid = uuid;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getUbicacion() {
    return ubicacion;
  }

  public void setUbicacion(String ubicacion) {
    this.ubicacion = ubicacion;
  }

  public int getVentas() {
    return ventas;
  }

  public void setVentas(int ventas) {
    this.ventas = ventas;
  }

  @Override
  public String toString() {
    return "FarmaciaModel [nombre=" + nombre + ", ubicacion=" + ubicacion + ", uuid=" + uuid
        + ", ventas=" + ventas + "]";
  }

}
