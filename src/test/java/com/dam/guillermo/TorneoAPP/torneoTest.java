package com.dam.guillermo.TorneoAPP;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.*;


import com.dam.TorneoAPP.model.*;
import com.dam.TorneoAPP.model.*;
public class torneoTest {
	private static Federacion federacion1;
	private static Equipo equipo1;
	private static Equipo equipo2;
	
	@BeforeAll
	public static  void creacionObjetos() {
		federacion1 = new Federacion("Sanagus futbol","1234","Torneo regional");
		equipo1= new Equipo("numero1","mega patrocinador","Rojo","verde","Cadetes");
		equipo2= new Equipo("numero2","Super patrocinador","naranja","Rosa", "Bejamines");
	}
	@Test
public void comprobacionInscripcionTorneo() {
		federacion1.registroEquipo("los locales", "frutas Pepi", "Blanco", "Amarillo", "Alevin");
		//comprobacion introduccion equipo en torneo
		assertEquals(1,federacion1.getTorneo().getParticipantes().size());
		//comprobacion info del equipo esta bien introducida
		assertEquals("los locales",federacion1.getTorneo().getParticipantes().get(0).getNombre());
	}
	@Test
public void comprobacionIntroduccionIncidencias() {
		Partido partido=new Partido("La plaza",equipo1,equipo2,LocalDate.of(2020, 02, 20));
		ResultadoPartido resultado=new ResultadoPartido("3-2", "Pancho", partido);
		
		//prueba sin incidencias
		resultado.anadirIncidencia("");
		assertEquals("No hay incidencias",resultado.getIncidencias().get(0));
		//prueba con incidencia
		resultado.anadirIncidencia("Empezo 10 minutos tarde");
		assertEquals("Empezo 10 minutos tarde", resultado.getIncidencias().get(1));
		
	}
}
