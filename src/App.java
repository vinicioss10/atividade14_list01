// João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa que leia a variável peso (peso de peixes) e calcule o excesso. Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa que João deverá pagar. Imprima os dados do programa com as mensagens adequadas.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Informe qual o peso de peixes que foram pescados em quilos:");
        Scanner tecladoPeso = new Scanner(System.in);
        double peso = tecladoPeso.nextDouble();

        if (peso > 50) {
            double passou = peso - 50;
            double multa = passou * 4;
            System.out.println("A quantidade de quilos em excesso é: " + passou + " a multa será de: R$ " + multa);
        } else {
            System.out.println("O peso está de baseado no limite e não será adicionada a multa pelos peixes");
        }
    }
}