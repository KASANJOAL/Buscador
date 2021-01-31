package com.google.buscar.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.google.com/")
public class BuscadorPageObject extends PageObject{
	
	@FindBy(xpath="//input[@title='Buscar']")
	WebElementFacade txtBuscador;
	
	@FindBy(xpath="//div[@id='result-stats']")
	WebElementFacade lblCantidadResultados;

	public void escribirEnBuscador(String strPalabra) {
		txtBuscador.typeAndEnter(strPalabra);
	}
	
	public double extraerCantidadResultados() {
		try {
			String strLabelCompleto=lblCantidadResultados.getText();
			return extraerNumero(strLabelCompleto.substring(0,strLabelCompleto.indexOf("(")));
		}
		catch (Exception e) {
			return 0;
		}
	}
	
	private double extraerNumero(String strPalabra){
		strPalabra = strPalabra.replaceAll("[^0-9]", "");
		return Double.parseDouble(strPalabra);
	}
}
