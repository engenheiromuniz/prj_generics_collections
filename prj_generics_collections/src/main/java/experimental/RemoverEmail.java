package experimental;

import javax.xml.transform.Source;
import java.util.*;

public class RemoverEmail {
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
        Set<String> semNormalizar = new LinkedHashSet<>(List.of(entrada));

        System.out.println("Saída esperada: ");
        System.out.println("Sem normalizar: "+semNormalizar);

        Set<String> normalizado = new LinkedHashSet<>();
        for(String email : entrada.split(","))
            normalizado.add(email.trim().toLowerCase());

        System.out.println("Normalizado: "+normalizado);


    }
}
