package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;

public class Conta {

    private String agencia = "1234-XX";
    private int numeroConta;
    private double saldo = 0;
    private Cliente cliente;

    public void gerarConta(Cliente cliente) {
        numeroConta = (int) (Math.random() * 10000);
        this.cliente = cliente;
    }

    List<Conta> listContas = new ArrayList<>();

    public void adicionarContaList(Conta conta){
        listContas.add(conta);
    }

    public void listarContas() {
        for (Conta conta : listContas) {
            System.out.println(conta.numeroConta);
        }
    }

    public Conta pesquisarConta(long cpf) {
        for (Conta conta : listContas) {
            long validaCpfConta = conta.cliente.getCpf();
            if (validaCpfConta == numeroConta) {
                return conta;
            }
        }
        return null;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void realizarSaque(double valorSaque){
        if (this.saldo >= valorSaque) {
            this.saldo -= valorSaque;
            System.out.println("Seu saldo é: " + this.saldo);
        } else {

                System.out.println("ERRO: Informe um valor válido!");
            }
        }

    public void realizarDeposito(double valorDeposito){

        this.saldo += valorDeposito;
        System.out.println("Seu saldo atual é: " + this.saldo);
    }
}
