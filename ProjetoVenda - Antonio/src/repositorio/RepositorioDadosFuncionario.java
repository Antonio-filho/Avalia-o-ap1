/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;
import dados.Funcionario;
import java.util.ArrayList;
import dados.Produto;

/**
 *
 * @author antonio
 */
public class RepositorioDadosFuncionario {
    
    private static ArrayList<Funcionario> listaFuncionarios = new ArrayList();
    
    
    public static void inicializandoDados() {
        
        // criando os objetos diretamente
        Funcionario funcionario = new Funcionario("nome", "cidade" , "cpf ...");
        
        listaFuncionarios.add(funcionario);
        
    }
    public static void adicionarFuncionario (Funcionario funcionario) {
        
        listaFuncionarios.add(funcionario);
    }
    public static boolean temEspaco() {
        return listaFuncionarios != null; 
    }
    
     
    public static Funcionario pesquisarFuncionarioPeloCodigo(int codigo) {
        Funcionario funcionario = null;
        
        // usando laço For each: 
        // http://www.javaprogressivo.net/2012/09/o-laco-for-para-arrays.html
         
        for (Funcionario funcionarioAtual : listaFuncionarios) {
            if (funcionarioAtual.getCodigo() == codigo) {
                // achei o produto com o codigo correspondente
                funcionario = funcionarioAtual;
                break;
    }
            
}    
        //        // pesquisar na lista de Funcionarios 
//        for (int i = 0; i < listaFuncionarios.length; i++) {
//            // recuperar o Cliente atual e comparar o codigo
//            Cliente cliente = listaFuncionarios[i];
//            if (cliente != null && cliente.getCodigo() == codigo) {
//                // achei o funcionario com o codigo correspondente
//                
//                funcionario = f;
//                break;
//            }
//        } // fim laco for
 
        
        return funcionario;
    }
    public static void editarFuncionario(Funcionario funcionario) {
        
        for (Funcionario f : listaFuncionarios) {
            if (funcionario.getCodigo() == funcionario.getCodigo()) {
                funcionario = funcionario;
                break;
            }
        }
    }
    
     public static String excluirFuncionario (Funcionario excluirfuncionario){
    listaFuncionarios.remove(excluirfuncionario);
    String e = "\nDeletado com sucesso";
    return e;
    }

    
}

    

