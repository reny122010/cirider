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
public interface CaroneiroState {
    public void pedir_carona();
    public void cancelar_carona();
    public void fazer_avaliacao();
    public void concluir_carona();
    public void alterar_modo_usuario();
    public GerenteDeRota getGerenteDeRota();
    public void setGerenteDeRota(GerenteDeRota gerenteDeRota);
    public GerenteDeNotificao getGerenteDeNotificao();
    public void setGerenteDeNotificao(GerenteDeNotificao gerenteDeNotificao);
    public AutenticacaoSistema getAutenticacaoSistema();
    public void setAutenticacaoSistema(AutenticacaoSistema autenticacaoSistema);
    public Compressao getCompressao();
    public void setCompressao(Compressao compressao);
}
