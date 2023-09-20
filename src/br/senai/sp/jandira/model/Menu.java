package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    Cliente cliente = new Cliente();
    Conta conta = new Conta();

    public void executarMenu() {

        boolean continuar = true;

        while (continuar) {
            System.out.println("----------------------- Menu ------------------------");
            System.out.println(" 1 - Cadastrar Cliente ");
            System.out.println(" 2 - Consultar Saldo ");
            System.out.println(" 3 - Realizar Depósito ");
            System.out.println(" 4 - Realizar Saque ");
            System.out.println(" 5 - Sair");
            System.out.println("------------------------------------------------------");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    cliente.cadastrarCliente();
                    break;

                case 2:
                    conta.consultarSaldo();
                    break;

                case 3:
                    System.out.println("Informe o valor do Deposito: ");
                    double valorDeposito = scanner.nextDouble();
                    conta.realizarDeposito(valorDeposito);
                    break;

                case 4:
                    System.out.println("Informe o valor do Saque: ");
                    double valorSaque = scanner.nextDouble();
                    conta.realizarSaque(valorSaque);
                    break;

                case 5:
                    continuar = false;
                    break;

            }
        }
    }
}
