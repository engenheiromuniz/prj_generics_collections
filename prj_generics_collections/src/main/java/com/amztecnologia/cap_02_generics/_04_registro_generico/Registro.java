package com.amztecnologia.cap_02_generics._04_registro_generico;

import java.util.ArrayList;
import java.util.List;

public class Registro<T> {
    // Mantém a lista de elementos guardados
    private List<T> elementos;

    // Construtor padrão: inicializa a lista vazia pronta para receber itens
    public Registro() {
        this.elementos = new ArrayList<>();
    }

    // Adiciona UM único elemento do tipo T à lista
    public void adicionar(T elemento){
        this.elementos.add(elemento);
    }

    // Retorna a quantidade de itens cadastrados
    public int quantidade() {
        return this.elementos.size();
    }

    // Sem o <T> duplicado antes do retorno! Usa o T da classe.
    public T primeiro(){
        if (this.elementos.isEmpty()) {
            throw new IllegalStateException("Registro vazio");
        }
        return this.elementos.getFirst(); // Java 21+ ou use .get(0) em Java 17-
    }

    public T ultimo(){
        if (this.elementos.isEmpty()) {
            throw new IllegalStateException("Registro vazio");
        }
        return this.elementos.getLast(); // Java 21+ ou use .get(elementos.size() - 1)
    }

    // Transforma a lista no formato de texto pedido: [a, b, c]
    public void imprimir(){
        System.out.println(this.elementos.toString());
    }
}
