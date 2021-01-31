package com.google.buscar.definitions;

import com.google.buscar.steps.BuscadorSteps;

import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class BuscadorDefinitions {

	@Steps
	BuscadorSteps buscadorSteps;
	
	@Dado("^que he ingresado al portal google$")
	public void que_he_ingresado_al_portal_google() {
		buscadorSteps.abrirNavegador();
	}


	@Cuando("^ingreso la palabra \"([^\"]*)\" al buscador$")
	public void ingreso_la_palabra(String strPalabra) {
		buscadorSteps.digitarPalabraABuscar(strPalabra);
	}

	@Entonces("^verifico que la cantidad de resultados de la búsqueda sea diferente de cero$")
	public void verifico_que_la_cantidad_de_resultados_de_la_búsqueda_sea_diferente_de_cero() {
		buscadorSteps.verificarCantidadDeResultados();
	}


	
}
