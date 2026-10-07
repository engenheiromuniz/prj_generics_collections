package com.amztecnologia.cap_01_split;

import java.util.ArrayList;
import java.util.List;

public class Exercicio_5 {
/*
* ** Exercício 1.5 ★★ Contando palavras com espaços irregulares
*
* String frase = " Java é uma linguagem muito usada ";
* 1. Mostre quantos elementos o split(" ") gera SEM nenhum tratamento.
* 2. Corrija usando trim() e "\\s+" e mostre a contagem correta.
* 3. Imprima as palavras unidas por um único hífen (use String.join).
* 4. Explique, em um comentário, de onde vieram os elementos extras do item 1.
*
* Saída esperada:
* Sem tratamento: 20 elementos
* Palavras: 6
* Java-
*/
public static void main(String[] args) {
    String frase = " Java é uma linguagem muito usada ";
    String[] semTratamento = frase.split(" ");
    List<String> lista = new ArrayList<>();

    System.out.println("Sem tratamento: "+semTratamento.length+" elementos");

    String[] comTratamento = frase.trim().split("\\s+");
    System.out.println("Palavras com tratamento: "+comTratamento.length);

    String fraseUnida = String.join("-",comTratamento);
    System.out.println(fraseUnida);



}

}
