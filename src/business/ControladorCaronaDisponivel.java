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
public class ControladorCaronaDisponivel implements CaroneiroState{

    @Override
    public void pedir_carona() {
        //Pedir carona.
    }

    @Override
    public void cancelar_carona() {
        //Não pode Cancelar carona
    }

    @Override
    public void fazer_avaliacao() {
       //Não pode Fazer avaliacao
    }

    @Override
    public void concluir_carona() {
        // Não pode Concluir carona
    }

    @Override
    public void alterar_modo_usuario() {
       //Alterar modo 
    }

    @Override
    public GerenteDeRota getGerenteDeRota() {
        //Pegar rota
        return null;
    }

    @Override
    public void setGerenteDeRota(GerenteDeRota gerenteDeRota) {
        //Setar rota
    }

    @Override
    public GerenteDeNotificao getGerenteDeNotificao() {
        //Pegar Gerente de notificao
        return null; 
    }

    @Override
    public void setGerenteDeNotificao(GerenteDeNotificao gerenteDeNotificao) {
       //Setar gerente de notificacao
    }

    @Override
    public AutenticarUsuarioChain getAutenticacaoSistema() {
        return null;
        //Pegar autenticacao
    }

    @Override
    public void setAutenticacaoSistema(AutenticarUsuarioChain autenticacaoSistema) {
        //Setar Autenticacao
    }

    @Override
    public Compressao getCompressao() {
        //Pegar compressao
        return null;
    }

    @Override
    public void setCompressao(Compressao compressao) {
       //Setar compressao
    }
    
}
