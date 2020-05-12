package com.dam.TorneoAPP.model;

import java.util.*;

public class Torneo {
private String nombre;
private List<Equipo> participantes;
public void inscripcionEquipos(Equipo equipo) {

	participantes.add(equipo);
}
public Torneo (String nombre) {
	this.nombre=nombre;
	participantes= new ArrayList<Equipo>();
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public List<Equipo> getParticipantes() {
	return participantes;
}
public void setParticipantes(List<Equipo> participantes) {
	this.participantes = participantes;
}

}
