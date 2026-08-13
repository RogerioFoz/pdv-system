package com.pdv.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa uma Venda no sistema PDV
 */
public class Venda implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private Long id;
    private LocalDateTime dataHora;
    private List<ItemVenda> itens;
    private BigDecimal total;
    private BigDecimal desconto;
    private String formaPagamento;
    
    public Venda() {
        this.dataHora = LocalDateTime.now();
        this.itens = new ArrayList<>();
        this.total = BigDecimal.ZERO;
        this.desconto = BigDecimal.ZERO;
    }
    
    // Getters e Setters
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public LocalDateTime getDataHora() {
        return dataHora;
    }
    
    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
    
    public List<ItemVenda> getItens() {
        return itens;
    }
    
    public void setItens(List<ItemVenda> itens) {
        this.itens = itens;
    }
    
    public BigDecimal getTotal() {
        return total;
    }
    
    public void setTotal(BigDecimal total) {
        this.total = total;
    }
    
    public BigDecimal getDesconto() {
        return desconto;
    }
    
    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }
    
    public String getFormaPagamento() {
        return formaPagamento;
    }
    
    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    
    public void adicionarItem(ItemVenda item) {
        this.itens.add(item);
        calcularTotal();
    }
    
    public void removerItem(ItemVenda item) {
        this.itens.remove(item);
        calcularTotal();
    }
    
    private void calcularTotal() {
        BigDecimal subtotal = BigDecimal.ZERO;
        for (ItemVenda item : itens) {
            subtotal = subtotal.add(item.getSubtotal());
        }
        this.total = subtotal.subtract(desconto);
    }
    
    @Override
    public String toString() {
        return "Venda{" +
                "id=" + id +
                ", dataHora=" + dataHora +
                ", itens=" + itens.size() +
                ", total=" + total +
                ", desconto=" + desconto +
                ", formaPagamento='" + formaPagamento + '\'' +
                '}';
    }
}
