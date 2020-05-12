package com.dam.TorneoAPP.model;

import java.time.LocalDate;


public class Partido {
private String campo;
private Equipo equipo1;
private Equipo equipo2;
private LocalDate fecha;
public Partido(String campo, Equipo equipo1, Equipo equipo2, LocalDate fecha) {
	this.campo = campo;
	this.equipo1 = equipo1;
	this.equipo2 = equipo2;
	this.fecha = fecha;
}
public String getCampo() {
	return campo;
}
public void setCampo(String campo) {
	this.campo = campo;
}
public Equipo getEquipo1() {
	return equipo1;
}
public void setEquipo1(Equipo equipo1) {
	this.equipo1 = equipo1;
}
public Equipo getEquipo2() {
	return equipo2;
}
public void setEquipo2(Equipo equipo2) {
	this.equipo2 = equipo2;
}
public LocalDate getFecha() {
	return fecha;
}
public void setFecha(LocalDate fecha) {
	this.fecha = fecha;
}

}
