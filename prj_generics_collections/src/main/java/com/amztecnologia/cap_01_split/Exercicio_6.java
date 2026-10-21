package com.amztecnologia.cap_01_split;

public class Exercicio_6 {

    public static void main(String[] args) {

        String[] logs = {
                "2026-10-01 14:32:10|INFO|PedidoService|Pedido 1001 criado",
                "2026-10-01 14:32:15|ERROR|PagamentoService|Saldo insuficiente",
                "2026-10-01 14:33:02|WARN|EstoqueService|Estoque baixo: Mouse",
                "2026-10-01 14:35:47|ERROR|PedidoService|Timeout no banco"
        };

        int totalErros = 0;

        System.out.println("Saída esperada:");
        
        for (String linha : logs) {

            // Divide a linha em campos
            String[] campos = linha.split("\\|");

            // Verifica se o nível é ERROR
            if (campos[1].equals("ERROR")) {

                totalErros++;

                // Divide data e hora
                String[] dataHora = campos[0].split(" ");

                String hora = dataHora[1];
                String servico = campos[2];
                String mensagem = campos[3];

                System.out.println(
                        "[" + hora + "] "
                                + servico
                                + " -> "
                                + mensagem
                );
            }
        }

        System.out.println("Total de erros: " + totalErros);
    }
}