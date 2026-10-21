package com.amztecnologia.cap_01_split;

public class Exercicio_7 {

    public static void main(String[] args) {

        String query = "produto=Notebook&preco=3500&cupom=DESC=10";

        String[] parametros = query.split("&");

        for (String parametro : parametros) {

            String[] chaveValor = parametro.split("=", 2);

            System.out.println(
                    chaveValor[0] + " -> " + chaveValor[1]
            );
        }
    }
}