package com.dam.TorneoAPP;

import java.util.ArrayList;
import java.util.List;

public class Calendario {
private List<Partido> listaPartidos;

public Calendario() {

	this.listaPartidos = new ArrayList<Partido>();
}
public void anadirPartido(Partido partido) {
	listaPartidos.add(partido);
}

}
