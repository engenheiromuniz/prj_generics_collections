package com.amztecnologia.cap_01_split;

public class Exercicio_1 {
    /*
     * ** Exercício 1.1 ★ Separando um nome completo
     *
     * Dada a String nome = "Ana Maria Braga":
     * 1. Separe as palavras com split.
     * 2. Imprima cada palavra em uma linha, numerada a partir de 1.
     * 3. Imprima a quantidade de palavras.
     * 4. Imprima o primeiro e o último nome.
    * */
    public static void main(String[] args) {
        String nomeCompleto = "Ana Maria Braga";

        String[] partes = nomeCompleto.split(" ");
        String preNome   = partes[0];
        String nome      = partes[1];
        String sobrenome = partes[2];

        System.out.println("\nPalavras em linhas, numerada a partir de 1:\n");
        int i = 1;
        for (String p : partes){
            System.out.println(i+". "+p);
            i++;
        }

        System.out.print("\nQuantidade de palavras: "+ partes.length);

        System.out.println("\nPrimeiro nome: "+preNome+" Último nome: "+sobrenome);





    }
}
