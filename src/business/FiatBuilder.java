/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

/**
 *
 * @author Rene
 */
public class FiatBuilder extends VeiculoBuilder { 
    @Override
    public void buildModelo() {
        // Operação complexa.
        carro.modelo = "Palio";
    }
	 
	@Override
	public void buildPlaca() {
	    // Operação complexa.
	    carro.placa = "NWE1234";
	}
	 
	@Override
	public void buildCor() {
	    // Operação complexa.
	    carro.cor = "azul";
	}
	 
}