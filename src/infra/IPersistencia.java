/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infra;

/**
 *
 * @author Rene
 */
public interface IPersistencia {
    public void salva();
    public void deleta();
    public void busca();
}
