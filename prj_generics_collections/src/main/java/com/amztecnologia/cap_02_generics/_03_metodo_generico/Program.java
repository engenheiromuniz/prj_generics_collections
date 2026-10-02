package com.amztecnologia.cap_02_generics._03_metodo_generico;

import java.util.ArrayList;
import java.util.List;
/*
 * ** Exercício 2.3 ★ Primeiros métodos genéricos
 *
 * Crie, na própria classe Program, os métodos estáticos genéricos:
 * - <T> T ultimo(List<T> lista)
 * - <T> void imprimirTodos(List<T> lista) -> um por linha, com "- " na frente
 * - <T> List<T> repetir(T valor, int vezes) -> lista com o valor repetido
 * Teste com:
 * List<String> nomes = List.of("Ana", "Bia", "Carlos");
 * List<Integer> numeros = List.of(10, 20, 30);
 *
 * Saída esperada:
 * Último: Carlos
 * Último: 30
 * - Ana
 * - Bia
 * - Carlos
 * [ok, ok, ok]
 */

public class Program {

    public static void main(String[] args) {
        List<String> nomes = List.of("Ana","Bia","Carlos");
        List<Integer> numeros = List.of(10,20,30);

        System.out.println("Último: "+ultimo(nomes));
        System.out.println("Último: "+ultimo(numeros));
        imprimirTodos(nomes);
        System.out.println(repetir("ok",3));

    }
    public static <T> T ultimo(List<T> lista){

        return lista.getLast();
    }

    public static <T> void imprimirTodos(List<T> lista){
        for (T i : lista){
            System.out.println("- "+i);
        }
    }

    public static <T> List<T> repetir(T valor, int vezes){
        List<T>resultado = new ArrayList<>();
        for (int i = 0; i < vezes; i++){
            resultado.add(valor);
        }
        return resultado;
    }
}
