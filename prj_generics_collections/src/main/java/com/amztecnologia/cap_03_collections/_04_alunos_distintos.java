package com.amztecnologia.cap_03_collections;

import java.util.Set;
import java.util.TreeSet;

public class _04_alunos_distintos {
    /*
     * ** Exercício 3.4 ★★ Alunos distintos
     *
     * Um professor tem três cursos. Os códigos dos alunos de cada um:
     * String cursoA = "21 35 22";
     * String cursoB = "21 50";
     * String cursoC = "13 35 54 21";
     * Um aluno pode estar em mais de um curso. Quantos alunos DISTINTOS
     * o professor tem? Converta os códigos para Integer e use um TreeSet.
     *
     * Saída esperada:
     * Total de alunos: 6
     * Códigos: [13, 21, 22, 35, 50, 54]
     */
    public static void main(String[] args) {
     String cursoA = "21 35 22";
     String cursoB = "21 50";
     String cursoC = "13 35 54 21";

     String[] separador = (cursoA+" "+cursoB+" "+cursoC).split(" ");

     Set<String> cursos = new TreeSet<>();

     for(String s : separador){
         cursos.add(s);
     }

        System.out.println("Saida esperada: ");
        System.out.println("Total de alunos: "+cursos.size());
        System.out.println("Códigos: "+cursos);

    }
}
