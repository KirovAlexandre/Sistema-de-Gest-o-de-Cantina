package Model;
// Generated Sep 28, 2023 8:50:15 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Enderecoentrega generated by hbm2java
 */
public class Enderecoentrega  implements java.io.Serializable {


     private Integer idEnderecoEntrega;
     private String endereco;
     private Set clientes = new HashSet(0);

    public Enderecoentrega() {
    }

	
    public Enderecoentrega(String endereco) {
        this.endereco = endereco;
    }
    public Enderecoentrega(String endereco, Set clientes) {
       this.endereco = endereco;
       this.clientes = clientes;
    }
   
    public Integer getIdEnderecoEntrega() {
        return this.idEnderecoEntrega;
    }
    
    public void setIdEnderecoEntrega(Integer idEnderecoEntrega) {
        this.idEnderecoEntrega = idEnderecoEntrega;
    }
    public String getEndereco() {
        return this.endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public Set getClientes() {
        return this.clientes;
    }
    
    public void setClientes(Set clientes) {
        this.clientes = clientes;
    }




}

