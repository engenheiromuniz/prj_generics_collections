package com.amztecnologia.cap_03_collections._03_usando_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {
    /*
     * ** Exercício 3.3 ★ As três implementações de Set
     *
     * String cidades = "Recife,Brasília,Manaus,Belém,Brasília,Curitiba,Manaus";
     * Coloque as cidades em um HashSet, um LinkedHashSet e um TreeSet.
     * Imprima os três e responda em comentário: qual a regra de ordem de cada um?
     *
     * Saída esperada (a linha do HashSet pode variar):
     * HashSet: [...]
     * LinkedHashSet: [Recife, Brasília, Manaus, Belém, Curitiba]
     * TreeSet: [Belém, Brasília, Curitiba, Manaus, Recife]
     */
    public static void main(String[] args) {
        String cidades = "Recife,Brasília,Manaus,Belém,Brasília,Curitiba,Manaus";
        String[] separador = cidades.split(",");

        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new LinkedHashSet<>();
        Set<String> set3 = new TreeSet<>();

        for(String s : separador) {
            set1.add(s);
        }
        for(String s : separador) {
            set2.add(s);
        }
        for(String s : separador) {
            set3.add(s);
        }

        System.out.println("HashSet: "+set1);
        System.out.println("LinkedHashSet: "+set2);
        System.out.println("TreeSet: "+set3);

    }
}
