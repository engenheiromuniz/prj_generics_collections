
package com.amztecnologia.cap_02_generics._05_posicao_array;

import java.util.Arrays;

public class Program {

    public static void main(String[] args) {

        String[] vetSt = {"a", "b", "c", "d"};
        Integer[] vetNum = {1, 2, 3};

        TrocarVetor obj = new TrocarVetor();

        obj.trocar(vetSt, 0, 3);

        System.out.println("Saída esperada: ");
        System.out.println(
                "Após trocar(0, 3): " + Arrays.toString(vetSt)
        );

        obj.inverter(vetNum);

        System.out.println(
                "Invertido: " + Arrays.toString(vetNum)
        );
    }
}
