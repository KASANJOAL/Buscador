package com.google.buscar.steps;

import static org.junit.Assert.assertThat;
import com.google.buscar.pages.BuscadorPageObject;
import static org.hamcrest.Matchers.greaterThan;
import net.thucydides.core.annotations.Step;

public class BuscadorSteps {

	BuscadorPageObject page;
	
	@Step
	public void abrirNavegador() {
		page.open();
	}
	
	@Step
	public void digitarPalabraABuscar(String strPalabra) {
		page.escribirEnBuscador(strPalabra);
	}

	
	@Step
	public void verificarCantidadDeResultados() {
		assertThat(page.extraerCantidadResultados(),greaterThan(0.00));
	}
}
