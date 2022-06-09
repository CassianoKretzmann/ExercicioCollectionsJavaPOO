/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciocollections;

import java.util.Objects;

/**
 *
 * @author cassi
 */
public class Produto 
{
    private int codigo;
    private String marca;
    private double preco;
    private TipoProduto tp; 

    public Produto(int codigo, String marca, double preco, TipoProduto tp) {
        this.codigo = codigo;
        this.marca = marca;
        this.preco = preco;
        this.tp = tp;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getMarca() {
        return marca;
    }

    public double getPreco() {
        return preco;
    }

    public TipoProduto getTp() {
        return tp;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produto other = (Produto) obj;
        return Objects.equals(this.tp.getCodigo(), other.tp.getCodigo());
    }
}
