/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciocollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author cassi
 */
public class Analise 
{    
    //Coleções
    static List<TipoProduto> listaTipoProduto = new ArrayList<>();
    static List<Produto> listaProduto = new ArrayList<>();
    static List<Pesquisador> listaPesquisador = new ArrayList<>();
    static Set<Produto> conjuntoProduto = new LinkedHashSet<>();

    //Metodos de busca
    public static TipoProduto buscaTipoProduto(String nomeTipo)
    {
        for(TipoProduto tp : listaTipoProduto)
        {
            if(tp.getNome().equals(nomeTipo))
                return tp;
        }
        
        return null;
    }
    
    public static Produto buscaProduto(int codigo)
    {
        for(Produto p : listaProduto)
        {
            if(p.getCodigo()== codigo)
                return p;
        }
        
        return null;
    }
    
    public static Pesquisador buscaPesquisador(int codigo)
    {
        for(Pesquisador p : listaPesquisador)
        {
            if(p.getCodigo() == codigo)
                return p;
        }
        
        return null;
    }
    
    //Popular coleções
    public static void gerarTiposProduto()
    {
        listaTipoProduto.add(new TipoProduto(1, "Café Solúvel"));
        listaTipoProduto.add(new TipoProduto(2, "Açúcar"));
        listaTipoProduto.add(new TipoProduto(3, "Adoçante"));
        listaTipoProduto.add(new TipoProduto(4, "Pão de Queijo"));
        listaTipoProduto.add(new TipoProduto(5, "Chocolate"));
    }
    
    public static void gerarProduto()
    {
        listaProduto.add(new Produto(1, "Zé Moleque", 2.30, buscaTipoProduto("Café Solúvel")));
        listaProduto.add(new Produto(2, "Gostinho Bom", 3.35, buscaTipoProduto("Café Solúvel")));
        listaProduto.add(new Produto(3, "Doce Vida", 2.60, buscaTipoProduto("Açúcar")));
        listaProduto.add(new Produto(4, "Coisa boa", 2.20, buscaTipoProduto("Açúcar")));
        listaProduto.add(new Produto(5, "Engordiet", 4.55, buscaTipoProduto("Adoçante")));
        listaProduto.add(new Produto(6, "ZeroGosto", 3.45, buscaTipoProduto("Adoçante")));
        listaProduto.add(new Produto(7, "Da Vovó", 8.10, buscaTipoProduto("Pão de Queijo")));
        listaProduto.add(new Produto(8, "Queijopão", 8.40, buscaTipoProduto("Pão de Queijo")));
        listaProduto.add(new Produto(9, "ChocoGood", 3.50, buscaTipoProduto("Chocolate")));
        listaProduto.add(new Produto(10, "Kakaw", 2.80, buscaTipoProduto("Chocolate")));
    }
    
    public static void gerarPesquisador()
    {
        listaPesquisador.add(new Pesquisador(1, "Analista1"));
        listaPesquisador.add(new Pesquisador(2, "Analista2"));
        listaPesquisador.add(new Pesquisador(3, "Analista3"));
    }
    
    //Exibição de dados
    public static void preenchereExibeConjuntoProdutos()
    {
        for(Produto produto : listaProduto)
            conjuntoProduto.add(produto);
        
        System.out.println("Conjunto produtos: " + conjuntoProduto);
    }
    
    public static void exibirDadosProdutos()
    {
        listaProduto.forEach(produto->System.out.println(
                    produto.getCodigo() + 
                    " * " + produto.getMarca() +
                    " * " + produto.getPreco() +
                    " * " + produto.getTp().getNome()));
    }
    
    public static void exibirMapaPesquisador()
    {
        Map<Produto, Pesquisador> mapaPesquisador = new HashMap<>();
        
        mapaPesquisador.put(buscaProduto(1), buscaPesquisador(1));
        mapaPesquisador.put(buscaProduto(2), buscaPesquisador(2));
        mapaPesquisador.put(buscaProduto(3), buscaPesquisador(3));
        mapaPesquisador.put(buscaProduto(4), buscaPesquisador(3));
        mapaPesquisador.put(buscaProduto(5), buscaPesquisador(2));
        mapaPesquisador.put(buscaProduto(6), buscaPesquisador(1));
        mapaPesquisador.put(buscaProduto(7), buscaPesquisador(1));
        mapaPesquisador.put(buscaProduto(8), buscaPesquisador(2));
        mapaPesquisador.put(buscaProduto(9), buscaPesquisador(2));
        mapaPesquisador.put(buscaProduto(10), buscaPesquisador(3));
        
        Set<Map.Entry<Produto, Pesquisador>> setProdutoPesquisador = mapaPesquisador.entrySet();
        Iterator<Map.Entry<Produto, Pesquisador>> it = setProdutoPesquisador.iterator();
        while (it.hasNext()) 
        {
            Map.Entry<Produto, Pesquisador> setProdutoPesquisadorExibir = it.next();
            if(conjuntoProduto.contains(setProdutoPesquisadorExibir.getKey()))
            {
                System.out.println(setProdutoPesquisadorExibir.getValue().getNome());
                System.out.println(setProdutoPesquisadorExibir.getKey().getTp().getNome());
                System.out.println(setProdutoPesquisadorExibir.getKey().getPreco());
            }
        }
    }
    
    public static void main(String[] args) 
    {
        gerarTiposProduto();
        gerarProduto();
        System.out.println("#################Cojuntos###############");
        preenchereExibeConjuntoProdutos();
        gerarPesquisador();
        System.out.println("#################Dados produtos###############");
        exibirDadosProdutos();
        System.out.println("#################Mapa pesquisador###############");
        exibirMapaPesquisador();
    }
    
}
