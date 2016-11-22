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
public class GerenciamentoVeiculos {
	    protected VeiculoBuilder montadora;
	 
	    public GerenciamentoVeiculos(VeiculoBuilder montadora) {
	        this.montadora = montadora;
	    }
	 
	    public void construirCarro() {
	        montadora.buildModelo();
	        montadora.buildPlaca();
	        montadora.buildCor();
	    }
	 
	    public VeiculoProduct getCarro() {
	        return montadora.getCarro();
	    }
}
