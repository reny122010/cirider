/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;

/**
 *
 * @author Rene
 */
public class VeiculoCareTaker {
    protected ArrayList<VeiculoMemento> estados;

    public VeiculoCareTaker() {
        estados = new ArrayList<VeiculoMemento>();
    }

    public void adicionarMemento(VeiculoMemento memento) {
        estados.add(memento);
    }

    public VeiculoMemento getUltimoEstadoSalvo() {
        if (estados.size() <= 0) {
            return new VeiculoMemento("");
        }
        VeiculoMemento estadoSalvo = estados.get(estados.size() - 1);
        estados.remove(estados.size() - 1);
        return estadoSalvo;
    }
}
