/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.caroneidocmd;

import business.CaroneiroState;
import business.Command;

/**
 *
 * @author Rene
 */
public class FazerAvaliacaoOBJ implements Command{
    CaroneiroState estado;
    public FazerAvaliacaoOBJ(CaroneiroState estado ){
        this.estado = estado;
    }
    @Override
    public void execute() {
        estado.fazer_avaliacao();
    }
    
}
