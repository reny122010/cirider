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
public class Veiculo {
    protected String veiculo;
    VeiculoCareTaker caretaker;

    public Veiculo() {
        caretaker = new VeiculoCareTaker();
        veiculo = new String();
    }

    public void infomacoesVeiculo(String novoVeiculo) {
        caretaker.adicionarMemento(new VeiculoMemento(veiculo));
        veiculo += novoVeiculo;
    }

    public void desfazerVeiculo() {
        veiculo = caretaker.getUltimoEstadoSalvo().getVeiculoSalvo();
    }

    public void mostrarVeiculo() {
        System.out.println(veiculo);
    }
}
