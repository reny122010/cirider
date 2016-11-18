/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
/**
 *
 * @author Rene
 */
public class Motorista extends Usuario{
    private Veiculo veiculo [];
    int local;
    
    public void Motorista(){
        veiculo = new Veiculo[10];
        local = 0;
    }
    public Veiculo getVeiculo() {
        return veiculo[local];
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo[local] = veiculo;
    }
}
