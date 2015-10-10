/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;


/**
 *
 * @author 
 */
public class Cliente {
    
    // atributos
    
    private int codigo;
    private String nome;
    private String telefone;
    private String cpf;
    
    private static int contadorCodigo = 1;
    
    // contrutor default
    public Cliente(){
        System.out.println("construtor default");
    
    // criar um codigo autoincremental
        codigo = contadorCodigo;
        
        // atualizar o contador de codigo
        contadorCodigo ++;
   
        System.out.println("Construtor com argumentos");
    }
    
    //construtor

    public Cliente(String nome, String telefone, String cpf) {
        codigo = contadorCodigo;
        contadorCodigo ++;
        
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    // metodo
    public void imprirDados(){
    
        System.out.println( toString() );
    
    }
    
    @Override
    public String toString() {
        
        String relatorio ="";
        relatorio +="codigo: "+codigo;
        relatorio +="\nnome: "+nome;
        relatorio +="\ntelefone: "+telefone;
        relatorio +="\ncpf: "+cpf;
        
             
        return relatorio;
    }
    
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
}
