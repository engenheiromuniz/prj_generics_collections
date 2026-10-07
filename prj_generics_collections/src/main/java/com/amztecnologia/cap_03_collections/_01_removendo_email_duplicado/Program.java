package com.amztecnologia.cap_03_collections._01_removendo_email_duplicado;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program {
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
        String []emails = entrada.split("//,");

        Set<String> semNormalizar = new LinkedHashSet<>();
        for(String email : emails){
            semNormalizar.add(email);
        }

        System.out.println("Sem Normalizar: "+semNormalizar);

        Set<String> normalizado = new LinkedHashSet<>();
        for (String email : emails){
            normalizado.add(email.toLowerCase());
        }
        System.out.println("Normalizados: "+normalizado);

    }
}
