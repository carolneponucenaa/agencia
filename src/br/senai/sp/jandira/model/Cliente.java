package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Cliente {

    public String nome, endereco;
    public long cpf, rg, telefone;

    Scanner scanner = new Scanner(System.in);

    public void cadastrarCliente(){

        System.out.println("--------------- Cadastro Cliente -------------- ");
        System.out.println("Informe seu nome:");
        nome = scanner.nextLine();
        System.out.println("Informe seu CPF:");
        cpf = scanner.nextLong();
        System.out.println("Informe seu RG:");
        rg = scanner.nextLong();
        System.out.println("Informe seu telefone:");
        telefone = scanner.nextLong();
        scanner.nextLine();
        System.out.println("-------------- Cadastro Cliente: Finalizado! -------------- ");


    }
}
