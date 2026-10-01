package com.amztecnologia.cap_02_generics._01_cofre_generico;

public class Main {

    public static void main(String[] args) {

        // 1. Cofre<String>: guardar, retirar e imprimir
        Cofre<String> docs = new Cofre<>();
        docs.guardar("Documento secreto");
        System.out.println("Retirado: " + docs.retirar());

        // 2. Mostrar que está vazio após retirar
        System.out.println("Vazio após retirar? " + docs.estaVazio());

        // 3. Cofre<Double>: provocar e capturar a exceção
        Cofre<Double> valores = new Cofre<>();
        valores.guardar(1500.0);
        try {
            valores.guardar(200.0);
        } catch (IllegalStateException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}