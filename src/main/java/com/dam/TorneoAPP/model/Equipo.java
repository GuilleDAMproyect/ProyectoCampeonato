package com.dam.TorneoAPP.model;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
private String nombre;
private String patrocinador;
private String color1;
private String color2;
private String categoria;
private List <FichaInscripcion> jugadores;


public Equipo(String nombre, String patrocinador, String color1, String color2, String categoria) {
	this.nombre = nombre;
	this.patrocinador = patrocinador;
	this.color1 = color1;
	this.color2 = color2;
	this.categoria = categoria;
	jugadores= new ArrayList<FichaInscripcion>();
	
}

public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getPatrocinador() {
	return patrocinador;
}
public void setPatrocinador(String patrocinador) {
	this.patrocinador = patrocinador;
}
public String getColor1() {
	return color1;
}
public void setColor1(String color1) {
	this.color1 = color1;
}
public String getColor2() {
	return color2;
}
public void setColor2(String color2) {
	this.color2 = color2;
}
public String getCategoria() {
	return categoria;
}
public void setCategoria(String categoria) {
	this.categoria = categoria;
}
public List<FichaInscripcion> getJugadores() {
	return jugadores;
}
public void setJugadores(List<FichaInscripcion> jugadores) {
	this.jugadores = jugadores;
}


}
