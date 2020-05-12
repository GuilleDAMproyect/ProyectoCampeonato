package com.dam.TorneoAPP.model;

import java.util.ArrayList;
import java.util.List;

public class ResultadoPartido {
	private String resultado;
	private String arbitro;
	private List<String> incidencias;
	private Partido partido;

	public ResultadoPartido(String resultado, String arbitro, Partido partido) {
		this.resultado = resultado;
		this.arbitro = arbitro;
		this.partido = partido;
		incidencias = new ArrayList<String>();
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public String getArbitro() {
		return arbitro;
	}

	public void setArbitro(String arbitro) {
		this.arbitro = arbitro;
	}

	public List<String> getIncidencias() {
		return incidencias;
	}

	public void setIncidencias(List<String> incidencias) {
		this.incidencias = incidencias;
	}

	public Partido getPartido() {
		return partido;
	}

	public void setPartido(Partido partido) {
		this.partido = partido;
	}

	public void anadirIncidencia(String incidencia) {
		if (incidencia.equals("")) {
			incidencia = "No hay incidencias";
			incidencias.add(incidencia);
		} else {
			incidencias.add(incidencia);
		}
	}

	public void eliminarIncidencia(int posicion) {
		incidencias.remove(posicion);
	}
}
