package com.dam.TorneoAPP;

import java.util.Date;

public class FichaInscripcion {
private String nombre;
private String apellidos;
private Date fechaNacimiento;
private String direccion;
private String telefono;
private Equipo equipo;

public FichaInscripcion(String nombre, String apellidos, Date fechaNacimiento, String direccion, String telefono) {
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.fechaNacimiento = fechaNacimiento;
	this.direccion = direccion;
	this.telefono = telefono;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellidos() {
	return apellidos;
}
public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}
public Date getFechaNacimiento() {
	return fechaNacimiento;
}
public void setFechaNacimiento(Date fechaNacimiento) {
	this.fechaNacimiento = fechaNacimiento;
}
public String getDireccion() {
	return direccion;
}
public void setDireccion(String direccion) {
	this.direccion = direccion;
}
public String getTelefono() {
	return telefono;
}
public void setTelefono(String telefono) {
	this.telefono = telefono;
}
public Equipo getEquipo() {
	return equipo;
}
public void setEquipo(Equipo equipo) {
	this.equipo = equipo;
}

}
