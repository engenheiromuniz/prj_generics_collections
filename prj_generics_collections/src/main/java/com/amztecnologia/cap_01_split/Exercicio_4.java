package com.amztecnologia.cap_01_split;

public class Exercicio_4 {
    /*
     * ** Exercício 1.4 ★ Analisando um e-mail
     *
     * Dado o e-mail "joao.silva@empresa.com.br":
     * 1. Separe o usuário do domínio.
     * 2. Separe o usuário em nome e sobrenome (o separador é o ponto).
     * 3. Conte em quantas partes o domínio se divide pelo ponto.
     * 4. Verifique se o domínio termina com ".br".
     *
     * Saída esperada:
     * Usuário: joao.silva
     * Domínio: empresa.com.br
     * Nome: joao | Sobrenome: silva
     * Partes do domínio: 3
     * Domínio brasileiro? true
     *
     * Atenção: o ponto é um caractere especial no split (seção 1.2).
     */

    public static void main(String[] args) {
        String email = "joao.silva@empresa.com.br";
        String[] separador = email.split("@");
        String usuario = separador[0];
        String dominio = separador[1];

        String[] separadorUsuario = usuario.split("\\.");
        String nome      = separadorUsuario[0];
        String sobrenome = separadorUsuario[1];


        String[] separadorDominio = dominio.split("\\.");
        int partes = separadorDominio.length;
        boolean deOndeEh = ehBrasileiro(dominio);

        System.out.println("Saída esperada: ");
        System.out.printf("\nUsuário: %s",usuario);
        System.out.printf("\nDomínio: %s",dominio);
        System.out.printf("\nNome: %s | Sobrenome: %s",nome,sobrenome);
        System.out.printf("\nPartes do Domínio: %d",partes);
        System.out.printf("\nDomínio Brasileiro? %b",deOndeEh);

    }

    public static boolean ehBrasileiro(String dominio){
        return dominio.endsWith(".br");
    }

}
