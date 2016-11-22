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
public class AutenticarFacebookAdapter extends AutenticarFB implements IautenticarAPI{

    @Override
    public void efetuarAutenticarAPI() {
        efetuarAutenticar();
    }
}
