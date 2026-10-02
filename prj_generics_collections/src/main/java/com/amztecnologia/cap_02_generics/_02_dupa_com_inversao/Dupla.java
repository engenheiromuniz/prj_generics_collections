package com.amztecnologia.cap_02_generics._02_dupa_com_inversao;
/*
 * ** Exercício 2.2 ★ Dupla com inversão
 *
 * Crie a classe Dupla<A, B> com construtor, getPrimeiro(), getSegundo(),
 * toString() no formato (a, b) e o método:
 * Dupla<B, A> inverter() -> devolve uma NOVA dupla com a ordem trocada
 * No main:
 * Dupla<String, Integer> d = new Dupla<>("Brasília", 1960);
 * Imprima d e d.inverter(). Depois, usando a dupla invertida,
 * imprima getPrimeiro() + 66, sem nenhum cast.
 *
 * Saída esperada:
 * (Brasília, 1960)
 * (1960, Brasília)
 * 2026
 */

public class Dupla<S,T> {

    private S primeiro;
    private T segundo;

    public Dupla() { }

    public Dupla(S primeiro, T segundo) {
        this.primeiro = primeiro;
        this.segundo = segundo;
    }

    public S getPrimeiro(){
        return this.primeiro;
    }

    public T getSegundo(){
        return this.segundo;
    }

    public Dupla<T,S> inverter(){
        return new Dupla<>(segundo,primeiro);
    }

    @Override
    public String toString() {
        return primeiro +", "+segundo;
    }
}
