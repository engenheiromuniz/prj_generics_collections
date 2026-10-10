package com.amztecnologia.cap_03_collections._01_remover_email_duplicado;

import java.util.LinkedHashSet;
import java.util.Set;

public class _03_remover_email {
    /*
     * ** Exercício 3.1 ★ Removendo e-mails duplicados
     *
     * String entrada = "ana@x.com,bia@x.com,ANA@x.com,carlos@x.com,bia@x.com";
     * 1. Separe com split e coloque em um Set, mantendo a ordem de chegada.
     * 2. Imprima o Set e o tamanho.
     * 3. Repare que "ana" e "ANA" ficaram como e-mails diferentes.
     * Corrija normalizando para minúsculas antes de inserir.
     *
     * Saída esperada:
     * Sem normalizar: [ana@x.com, bia@x.com, ANA@x.com, carlos@x.com] (4)
     * Normalizado: [ana@x.com, bia@x.com, carlos@x.com] (3)
     */
    public static void main(String[] args) {
        String entrada = "ana@x.com,bia@x.com,ANA@x.com,carlos@x.com,bia@x.com";
        Set<String> semNormalzar = new LinkedHashSet<>(Set.of(entrada));
        Set<String> normalizado = new LinkedHashSet<>();



        System.out.println("Sem normalizar: "+semNormalzar);

        for(String norma : entrada.split(","))
            normalizado.add(norma.trim().toLowerCase());

        System.out.println("Normalizado: "+normalizado);

    }
}
