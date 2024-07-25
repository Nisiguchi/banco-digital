package com;

import conjunto.cliente;
import conjunto.conta;
import conjunto.contaCorrente;
import conjunto.contaPoupanca;
import exceptions.SaldoException;



public class Main {
    public static void main(String[] args) {
        cliente nicole = new cliente();
        nicole.setNome("nicole");

        conta contaCorrente = new contaCorrente(nicole);
        conta contaPoupanca = new contaPoupanca(nicole);

        contaCorrente.depositar(200);

        try {
            contaPoupanca.sacar(100);
        } catch (SaldoException e) {
            System.out.println("Sem saldo para saque");
        }

        try {
            contaCorrente.transferir(150, contaPoupanca);
        } catch (SaldoException e) {
            System.out.println("Sem saldo para transferencia");
        }

        contaCorrente.imprimirInformacoes();
        contaPoupanca.imprimirInformacoes();
    }
}