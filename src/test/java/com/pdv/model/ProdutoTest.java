package com.pdv.model;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.math.BigDecimal;

/**
 * Testes unitários para a classe Produto
 */
public class ProdutoTest {
    
    private Produto produto;
    
    @Before
    public void setUp() {
        produto = new Produto("001", "Notebook", new BigDecimal("2500.00"), 10);
    }
    
    @Test
    public void testCriacaoProduto() {
        assertNotNull(produto);
        assertEquals("001", produto.getCodigo());
        assertEquals("Notebook", produto.getDescricao());
        assertEquals(new BigDecimal("2500.00"), produto.getPreco());
        assertEquals(Integer.valueOf(10), produto.getEstoque());
        assertTrue(produto.getAtivo());
    }
    
    @Test
    public void testAlteracaoProduto() {
        produto.setPreco(new BigDecimal("2800.00"));
        produto.setEstoque(5);
        
        assertEquals(new BigDecimal("2800.00"), produto.getPreco());
        assertEquals(Integer.valueOf(5), produto.getEstoque());
    }
    
    @Test
    public void testDesativarProduto() {
        produto.setAtivo(false);
        assertFalse(produto.getAtivo());
    }
}
