package com.dam.TorneoAPP.model;

import java.time.LocalDate;
import java.util.Date;

public class Federacion {
private String login;
private String contra;
private Torneo torneo;
public void registroJugador(String nombre, String apellidos, Date fechaNacimiento, String direccion, String telefono) {
	FichaInscripcion jugador=new FichaInscripcion ( nombre,  apellidos, fechaNacimiento, direccion, telefono);
};
public void registroEquipo (String nombre, String patrocinador, String color1, String color2, String categoria) {
	Equipo equipo=new Equipo( nombre,  patrocinador,  color1,  color2,  categoria);
	torneo.inscripcionEquipos(equipo);
}
public void registroPartido(String campo, Equipo equipo1, Equipo equipo2, LocalDate fecha) {
	Partido partido=new Partido( campo,  equipo1,  equipo2,  fecha);
	Calendario calendario=new Calendario();
	calendario.anadirPartido(partido);
}
public void registroResultado(String resultado, String arbitro, Partido partido,String incidencia) {
	ResultadoPartido resultadoP=new ResultadoPartido(resultado,  arbitro,  partido);
	resultadoP.anadirIncidencia(incidencia);
}
public Federacion(String login, String contra, String nombreTorneo) {
	this.login = login;
	this.contra = contra;
	torneo= new Torneo(nombreTorneo);
}
public String getLogin() {
	return login;
}
public void setLogin(String login) {
	this.login = login;
}
public String getContra() {
	return contra;
}
public void setContra(String contra) {
	this.contra = contra;
}
public Torneo getTorneo() {
	return torneo;
}
public void setTorneo(Torneo torneo) {
	this.torneo = torneo;
}


}
