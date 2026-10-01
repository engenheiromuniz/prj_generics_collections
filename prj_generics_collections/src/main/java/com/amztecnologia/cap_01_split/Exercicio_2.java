package com.amztecnologia.cap_01_split;

import java.util.Locale;

public class Exercicio_2 {
    /*
     * ** Exercício 1.2 ★ Linha de produto
     *
     * Dada a String linha = "Notebook,3500.00,2", separe os campos e
     * converta o preço e a quantidade para os tipos corretos.
     *
     * Saída esperada:
     * Produto: Notebook
     * Preço unitário: 3500,00
     * Quantidade: 2
     * Total: 7000,00
     */

    public static void main(String[] args) {
        String linha = "Notebook,3500.00,2";

        String[]partes = linha.split(",");

        String  produto = partes[0];
        Double  preco   = Double.parseDouble(partes[1]);
        Integer qtd     = Integer.parseInt(partes[2]);

        String total = String.format(Locale.of("pt","BR"),"%.2f",preco*qtd);

        System.out.println("- - - Tabela de Preço - - -");
        System.out.print("\nProduto:    "+produto+
                         "\nPreço:      "+String.format(Locale.of("pt","BR"),"%.2f",preco)+
                         "\nQuantidade: "+qtd+
                         "\nTotal:      "+total);

    }
}
