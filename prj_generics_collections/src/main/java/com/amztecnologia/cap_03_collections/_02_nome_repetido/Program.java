package com.amztecnologia.cap_03_collections._02_nome_repetido;

import java.util.Set;
import java.util.TreeSet;

public class Program {
    /*
     * ** Exercício 3.2 ★ Quem se repete?
     *
     * String nomes = "ana,bia,carlos,ana,davi,bia,ana";
     * Usando o retorno booleano de add(), descubra quais nomes se repetem.
     * Cada nome repetido deve aparecer uma única vez no resultado, em ordem
     * alfabética.
     *
     * Saída esperada:
     * Nomes únicos: [ana, bia, carlos, davi]
     * Repetidos: [ana, bia]
     *
     * Dica: use dois Sets.
     */

    public static void main(String[] args) {
        String nomes = "ana,bia,carlos,ana,davi,bia,ana";
        String[] separador = nomes.split(",");
        Set<String> unicos = new TreeSet<>();

        Set<String> repetidos = new TreeSet<>();

        for(String n : separador) {
            boolean inseriu = unicos.add(n);
            if(!inseriu)
                repetidos.add(n);
        }

        System.out.println("Nomes únicos: "+unicos);
        System.out.println("Repetidos: "+repetidos);

    }
}
