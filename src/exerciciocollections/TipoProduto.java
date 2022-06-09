/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciocollections;

/**
 *
 * @author cassi
 */
public class TipoProduto 
{
    private int codigo;
    private String nome;
    
    public TipoProduto(int codigo, String nome) 
    {
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo() 
    {
        return codigo;
    }
    
    public String getNome() 
    {
        return nome;
    }
}
