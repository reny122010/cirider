/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.caroneidocmd.AlterarModoUsuarioOBJ;
import business.caroneidocmd.CancelarCaronaOBJ;
import business.caroneidocmd.ConcluirCaronaOBJ;
import business.caroneidocmd.FazerAvaliacaoOBJ;
import business.caroneidocmd.PedirCaronaOBJ;

/**
 *
 * @author Rene
 */
public class ControladorCaroneiro{
    protected CaroneiroState estado;
    
    private Command comandoAlterar;
    private Command comandoPedir;
    private Command comandoConcluir;
    private Command comandoAvaliar;
    private Command comandoCancelar;
    
    private GerenteDeRota gerenteDeRota;
    private GerenteDeNotificao gerenteDeNotificao;
    private AutenticacaoSistema autenticacaoSistema;
    private Compressao compressao;
    
    public ControladorCaroneiro(Command cmd){
        estado = new ControladorCaronaDisponivel();
    }
    
    public void alterarStatus(String status){
        if(status.equals("disponivel")){
            estado = new ControladorCaronaDisponivel();
        }
        if(status.equals("indisponivel")){
            estado = new ControladorCaronaIndisponivel();
        }
    }
    
    public void exec(String cmd){
        switch(cmd){
            case "pedirCarona" : 
                comandoPedir    = new PedirCaronaOBJ(estado);
                comandoPedir.execute();
                break;
            case "cancelarCarona" : 
                comandoCancelar = new CancelarCaronaOBJ(estado);
                comandoCancelar.execute();
                break;
            case "fazerAvaliacao":
                comandoAvaliar  = new FazerAvaliacaoOBJ(estado);
                comandoAvaliar.execute();
                break;
            case "concluirCarona" : 
                comandoConcluir = new ConcluirCaronaOBJ(estado);
                comandoConcluir.execute();
            case "alterarModoUsuario" : 
                comandoAlterar  = new AlterarModoUsuarioOBJ(estado);
                comandoAlterar.execute();
                break;
        }
    }
}
