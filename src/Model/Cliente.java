package Model;
// Generated Sep 28, 2023 8:50:15 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Cliente generated by hbm2java
 */
public class Cliente  implements java.io.Serializable {


     private Integer idCliente;
     private Enderecoentrega enderecoentrega;
     private String primeiroNome;
     private String apelido;
     private String email;
     private String senha;
     private Date dataNascimento;
     private char sexo;
     private Date dataCadastro;
     private String estado;
     private String enderecoResidencia;
     private Boolean estadoB;
     private Set telefoneclientes = new HashSet(0);
     private Set pedidos = new HashSet(0);
     private Set vendas = new HashSet(0);
     private Set encomendas = new HashSet(0);

    public Cliente() {
    }

	
    public Cliente(String primeiroNome, String apelido, String email, String senha, Date dataNascimento, char sexo, Date dataCadastro, String estado, String enderecoResidencia) {
        this.primeiroNome = primeiroNome;
        this.apelido = apelido;
        this.email = email;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.dataCadastro = dataCadastro;
        this.estado = estado;
        this.enderecoResidencia = enderecoResidencia;
    }
    public Cliente(Enderecoentrega enderecoentrega, String primeiroNome, String apelido, String email, String senha, Date dataNascimento, char sexo, Date dataCadastro, String estado, String enderecoResidencia, Boolean estadoB, Set telefoneclientes, Set pedidos, Set vendas, Set encomendas) {
       this.enderecoentrega = enderecoentrega;
       this.primeiroNome = primeiroNome;
       this.apelido = apelido;
       this.email = email;
       this.senha = senha;
       this.dataNascimento = dataNascimento;
       this.sexo = sexo;
       this.dataCadastro = dataCadastro;
       this.estado = estado;
       this.enderecoResidencia = enderecoResidencia;
       this.estadoB = estadoB;
       this.telefoneclientes = telefoneclientes;
       this.pedidos = pedidos;
       this.vendas = vendas;
       this.encomendas = encomendas;
    }
   
    public Integer getIdCliente() {
        return this.idCliente;
    }
    
    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }
    public Enderecoentrega getEnderecoentrega() {
        return this.enderecoentrega;
    }
    
    public void setEnderecoentrega(Enderecoentrega enderecoentrega) {
        this.enderecoentrega = enderecoentrega;
    }
    public String getPrimeiroNome() {
        return this.primeiroNome;
    }
    
    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }
    public String getApelido() {
        return this.apelido;
    }
    
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return this.senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public Date getDataNascimento() {
        return this.dataNascimento;
    }
    
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public char getSexo() {
        return this.sexo;
    }
    
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public Date getDataCadastro() {
        return this.dataCadastro;
    }
    
    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getEnderecoResidencia() {
        return this.enderecoResidencia;
    }
    
    public void setEnderecoResidencia(String enderecoResidencia) {
        this.enderecoResidencia = enderecoResidencia;
    }
    public Boolean getEstadoB() {
        return this.estadoB;
    }
    
    public void setEstadoB(Boolean estadoB) {
        this.estadoB = estadoB;
    }
    public Set getTelefoneclientes() {
        return this.telefoneclientes;
    }
    
    public void setTelefoneclientes(Set telefoneclientes) {
        this.telefoneclientes = telefoneclientes;
    }
    public Set getPedidos() {
        return this.pedidos;
    }
    
    public void setPedidos(Set pedidos) {
        this.pedidos = pedidos;
    }
    public Set getVendas() {
        return this.vendas;
    }
    
    public void setVendas(Set vendas) {
        this.vendas = vendas;
    }
    public Set getEncomendas() {
        return this.encomendas;
    }
    
    public void setEncomendas(Set encomendas) {
        this.encomendas = encomendas;
    }




}

