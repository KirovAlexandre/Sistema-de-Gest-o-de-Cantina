package Model;
// Generated Sep 28, 2023 8:50:15 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Venda generated by hbm2java
 */
public class Venda  implements java.io.Serializable {


     private Integer idVenda;
     private Cliente cliente;
     private Encomenda encomenda;
     private Pedido pedido;
     private String situacao;
     private Date dataVenda;
     private int valorTotalVenda;

    public Venda() {
    }

	
    public Venda(String situacao, Date dataVenda, int valorTotalVenda) {
        this.situacao = situacao;
        this.dataVenda = dataVenda;
        this.valorTotalVenda = valorTotalVenda;
    }
    public Venda(Cliente cliente, Encomenda encomenda, Pedido pedido, String situacao, Date dataVenda, int valorTotalVenda) {
       this.cliente = cliente;
       this.encomenda = encomenda;
       this.pedido = pedido;
       this.situacao = situacao;
       this.dataVenda = dataVenda;
       this.valorTotalVenda = valorTotalVenda;
    }
   
    public Integer getIdVenda() {
        return this.idVenda;
    }
    
    public void setIdVenda(Integer idVenda) {
        this.idVenda = idVenda;
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Encomenda getEncomenda() {
        return this.encomenda;
    }
    
    public void setEncomenda(Encomenda encomenda) {
        this.encomenda = encomenda;
    }
    public Pedido getPedido() {
        return this.pedido;
    }
    
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    public String getSituacao() {
        return this.situacao;
    }
    
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    public Date getDataVenda() {
        return this.dataVenda;
    }
    
    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }
    public int getValorTotalVenda() {
        return this.valorTotalVenda;
    }
    
    public void setValorTotalVenda(int valorTotalVenda) {
        this.valorTotalVenda = valorTotalVenda;
    }




}


