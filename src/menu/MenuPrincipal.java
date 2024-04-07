package src.menu;

import src.contaBancaria.DadosCliente;

import java.util.Scanner;

public class MenuPrincipal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double valorInformado = 0;
        String mensagem = "";

        DadosCliente dadosCliente = new DadosCliente();
        MenuDeEntrada menuDeEntrada = new MenuDeEntrada();

        System.out.println(dadosCliente.impressaoDadosCliente());

        menuDeEntrada.menu();
        String entradaDeDados = teclado.next();

        while (!entradaDeDados.equals("4")) {

            mensagem = "";

            switch (entradaDeDados) {
                case "1":
                    System.out.printf("R$ %.2f", dadosCliente.getSaldoEmConta());
                    break;

                case "2":
                    System.out.print("Informe valor a receber: R$ ");
                    valorInformado = teclado.nextDouble();
                    dadosCliente.setSaldoEmConta(valorInformado);
                    break;

                case "3":
                    System.out.print("Informe valor para transferência: R$ ");
                    valorInformado = teclado.nextDouble();
                    if (dadosCliente.getSaldoEmConta() >= valorInformado) {
                        dadosCliente.setSaldoEmConta(-valorInformado);
                        System.out.printf("Valor da transferência: R$ %.2f ", valorInformado,"%n");
                        System.out.println("\n#########################################################");
                        System.out.printf("Saldo atualizado R$ %.2f ", dadosCliente.getSaldoEmConta(),"%n");
                        break;
                    } else {
                        mensagem = "Saldo insuficiente para transferência.";
                        break;
                    }


                default:
                    mensagem = "Opção inválida...";
                    break;

            }

            System.out.println(mensagem);
            menuDeEntrada.menu();
            entradaDeDados = teclado.next();
        }

        System.out.println("Até logo... finalizando.");
    }
}
