package experimental;

import java.util.HashMap;
import java.util.Map;

public class ForMaps {
    public static void main(String[] args) {
        Map<String, Integer> jogador = new HashMap<>();

        jogador.put("Ana", 12);
        jogador.put("Bia",14);
        jogador.put("Carla",16);
        jogador.put("Dani",15);
        jogador.put("Elisa",15);

        System.out.println(jogador);


        double media = 0;
        int cont = 0;
        for(Integer idades : jogador.values()) {
            ++cont;
            System.out.println(idades);
            media += idades;
        }



        media = media/cont;
        System.out.println("Média da idade das jogadoras: "+media);

        for(String nomes : jogador.keySet())
            System.out.println(nomes);

        for(Map.Entry<String, Integer> j : jogador.entrySet())
            System.out.println("Nome: "+j.getKey()+" - "+"Idade: "+j.getValue());

    }
}


