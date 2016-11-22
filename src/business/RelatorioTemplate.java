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
public class RelatorioTemplate {
    private String Cabeçalho;
    private String Rodape;
    
    public RelatorioTemplate(TiposRelatorio tipo){
        System.out.println(Cabeçalho);
        System.out.println(tipoRetatorio(tipo));
        System.out.println(Rodape);
    }
    public String tipoRetatorio(TiposRelatorio tipo){
        switch (tipo){
            case rota : 
               String corpo;
               //Pode chamar uma função que acessa o banco de dados da aplicação e pega as informaçoes
               //para fazer o relatório de rota.
               corpo = "";
                return corpo;
            case uso :
                return "Relatório de uso"; 
        }
        return "";
    }
}
