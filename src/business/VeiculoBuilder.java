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
public abstract class VeiculoBuilder {
    protected VeiculoProduct carro;
	 
    public VeiculoBuilder() {
        carro = new VeiculoProduct();
    }
 
    public abstract void buildModelo();
 
    public abstract void buildPlaca();
 
    public abstract void buildCor();
 
    public VeiculoProduct getCarro() {
        return carro;
    }
}
