package com.amztecnologia.cap_02_generics._04_registro_generico;

import java.util.List;

public class Program {
/*
* ** Exercício 2.4 ★★ Registro genérico
*
* Crie a classe Registro<T>, que armazena uma lista de elementos:
* - void adicionar(T elemento)
* - T primeiro()
* - T ultimo()
* - int quantidade()
* - void imprimir() -> imprime todos no formato [a, b, c]
* Se o registro estiver vazio, primeiro() e ultimo() lançam
* IllegalStateException("Registro vazio").
* No main:
 * 1. Registro<Integer> com 10, 20 e 30: imprima o registro, o primeiro,
 * o último e a quantidade.
 * 2. Registro<String> com "Ana" e "Bia": imprima o registro e o primeiro.
 * 3. Registro<String> vazio: chame primeiro() dentro de try/catch.
 *
 * Saída esperada:
 * [10, 20, 30]
 * Primeiro: 10
 * Último: 30
 * Quantidade: 3
 * [Ana, Bia]
 * Primeiro: Ana
 * Erro: Registro vazio
 */

public static void main(String[] args) {

        // 1. Registro<Integer> com 10, 20 e 30
        Registro<Integer> numeros = new Registro<>();
        numeros.adicionar(10);
        numeros.adicionar(20);
        numeros.adicionar(30);

        numeros.imprimir();
        System.out.println("Primeiro: " + numeros.primeiro());
        System.out.println("Último: " + numeros.ultimo());
        System.out.println("Quantidade: " + numeros.quantidade());

        // 2. Registro<String> com "Ana" e "Bia"
        Registro<String> nomes = new Registro<>();
        nomes.adicionar("Ana");
        nomes.adicionar("Bia");

        nomes.imprimir();
        System.out.println("Primeiro: " + nomes.primeiro());

        // 3. Registro<String> vazio: disparando e capturando a exceção
        Registro<String> vazio = new Registro<>();
        try {
            vazio.primeiro(); // Vai falhar porque está vazio
        } catch (IllegalStateException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

