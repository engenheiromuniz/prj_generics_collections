package com.amztecnologia.cap_02_generics._02_dupa_com_inversao;

public class Program {

    public static void main(String[] args) {
        Dupla<String,Integer> cidade = new Dupla<>("Brasília", 1960);

        System.out.print("\nPrimeiro dado: "+cidade.getPrimeiro());
        System.out.print("\nSegundo dado:  "+cidade.getSegundo());
        System.out.print("\n"+cidade.toString());

        System.out.println("\n- - - Implementando a Lógica para inverter os dados - - \n");
        Dupla<Integer, String> obj =  cidade.inverter();
        System.out.print(obj.toString());
        System.out.println("\n"+(obj.getPrimeiro()+66));
    }
}
