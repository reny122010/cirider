package business;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rene
 */

public class MotoristaAutenticar extends AutenticarUsuarioChain {
			 
    public MotoristaAutenticar() {
        super(IDAutenticarUsuario.MotoristaAutenticar);
    }

    @Override
    protected void efetuaAutenticar() {
        System.out.println("Motorista autenticado");
    }
}
