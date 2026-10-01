package com.amztecnologia.cap_01_split;

public class Exercicio_3 {
    /*
    * * ** Exercício 1.3 ★ Trabalhando com datas em texto
     *
     * Dada a String data = "25/12/2026":
     * 1. Separe dia, mês e ano e converta cada um para int.
     * 2. Imprima a data no formato ISO (ano-mês-dia).
     * 3. Imprima quantos dias faltam para o fim do mês, considerando
     * (por simplificação) que todo mês tem 30 dias.
     *
     * Saída esperada:
     * Dia: 25 | Mês: 12 | Ano: 2026
     * Formato ISO: 2026-12-25
     * Faltam 5 dias para o fim do mês
    * */

    public static void main(String[] args) {
        String data = "25/12/2026";
        String[] partes = data.split("/");

        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int ano = Integer.parseInt(partes[2]);

        int calcularFimDoMes = 30 - dia;

        System.out.println("- - - Exercício 03 - - -");
        System.out.print("Dia: "+dia+"| Mês: "+mes+" | Ano: "+ano);
        System.out.printf("\nFormato ISO: %04d-%02d-%02d",ano,mes,dia);
        System.out.print("\nFaltam "+calcularFimDoMes+" dias para o fim do mês.");
    }
}
