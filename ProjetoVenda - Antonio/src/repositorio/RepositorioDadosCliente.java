/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;
import dados.Cliente;
import java.util.ArrayList;
import dados.Produto;
/**
 *
 * @author antonio
 */
public class RepositorioDadosCliente {
    
   private static ArrayList<Cliente> listaClientes = new ArrayList();
    
    
    public static void inicializandoDados() {
        
        // criando os objetos diretamente
        Cliente cliente = new Cliente("nome", "cidade" , "cpf ...");
        
        listaClientes.add(cliente);
        
    }
    public static void adicionarCliente (Cliente cliente) {
        
        listaClientes.add(cliente);
    }
    public static boolean temEspaco() {
        return listaClientes != null; 
    }
    
     
    public static Cliente pesquisarClientePeloCodigo(int codigo) {
        Cliente cliente = null;
        
        // usando laço For each: 
        // http://www.javaprogressivo.net/2012/09/o-laco-for-para-arrays.html
         
        for (Cliente clienteAtual : listaClientes) {
            if (clienteAtual.getCodigo() == codigo) {
                // achei o produto com o codigo correspondente
                cliente = clienteAtual;
                break;
    }
            
}    
        //        // pesquisar na lista de Clientes 
//        for (int i = 0; i < listaClientes.length; i++) {
//            // recuperar o Cliente atual e comparar o codigo
//            Cliente cliente = listaClientes[i];
//            if (cliente != null && cliente.getCodigo() == codigo) {
//                // achei o cliente com o codigo correspondente
//                
//                cliente = c;
//                break;
//            }
//        } // fim laco for
 
        
        return cliente;
    }
    public static void editarCliente(Cliente cliente) {
        
        for (Cliente c : listaClientes) {
            if (cliente.getCodigo() == cliente.getCodigo()) {
                cliente = cliente;
                break;
            }
        }
    }
     
    public static String excluirCliente (Cliente excluircliente){
    listaClientes.remove(excluircliente);
    String e = "\nDeletado com sucesso";
    return e;
    }
}
