package Model;
// Generated Sep 28, 2023 8:50:15 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Pedido generated by hbm2java
 */
public class Pedido  implements java.io.Serializable {


     private Integer idPedido;
     private Cliente cliente;
     private Empregado empregado;
     private Date dataPedido;
     private String situacaoPedido;
     private Set vendas = new HashSet(0);
     private Set itemcardapios = new HashSet(0);

    public Pedido() {
    }

	
    public Pedido(Date dataPedido, String situacaoPedido) {
        this.dataPedido = dataPedido;
        this.situacaoPedido = situacaoPedido;
    }
    public Pedido(Cliente cliente, Empregado empregado, Date dataPedido, String situacaoPedido, Set vendas, Set itemcardapios) {
       this.cliente = cliente;
       this.empregado = empregado;
       this.dataPedido = dataPedido;
       this.situacaoPedido = situacaoPedido;
       this.vendas = vendas;
       this.itemcardapios = itemcardapios;
    }
   
    public Integer getIdPedido() {
        return this.idPedido;
    }
    
    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Empregado getEmpregado() {
        return this.empregado;
    }
    
    public void setEmpregado(Empregado empregado) {
        this.empregado = empregado;
    }
    public Date getDataPedido() {
        return this.dataPedido;
    }
    
    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }
    public String getSituacaoPedido() {
        return this.situacaoPedido;
    }
    
    public void setSituacaoPedido(String situacaoPedido) {
        this.situacaoPedido = situacaoPedido;
    }
    public Set getVendas() {
        return this.vendas;
    }
    
    public void setVendas(Set vendas) {
        this.vendas = vendas;
    }
    public Set getItemcardapios() {
        return this.itemcardapios;
    }
    
    public void setItemcardapios(Set itemcardapios) {
        this.itemcardapios = itemcardapios;
    }




}


