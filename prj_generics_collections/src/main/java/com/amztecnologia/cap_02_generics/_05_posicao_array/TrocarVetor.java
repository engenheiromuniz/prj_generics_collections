
package com.amztecnologia.cap_02_generics._05_posicao_array;

public class TrocarVetor {

    public <T> void trocar(T[] vetor, int i, int j) {
        T auxiliar = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = auxiliar;
    }

    public <T> void inverter(T[] vetor) {
        for (int i = 0, j = vetor.length - 1; i < j; i++, j--) {
            trocar(vetor, i, j);
        }
    }
}
