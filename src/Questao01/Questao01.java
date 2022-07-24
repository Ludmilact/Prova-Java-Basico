package Questao01;

import java.util.Scanner;

/*
Prova Técnica Java - Base.
Aluna: Ludmila Custódio Timóteo.
Data: 22/07/2022
Questão 01

1. O custo ao consumidor de um carro novo, é a soma do custo de fábrica com a percentagem do distribuidor
 e dos impostos (aplicados ao custo de fábrica). Supondo que a percentagem do distribuidor seja de 28% e
 os impostos de 45%, escreva um sistema que leia o custo de fábrica de um carro e imprima na tela o custo
 ao consumidor.
 */
public class Questao01 {

    public static void main(String[] args) {

        double custoFabrica = 0.0;
        double custoConsumidor = 0.0;
        double porcentagemDistribuidor = 28.0;
        double percentualImpostos = 45.0;
        double distribuidor = 0.0;
        double valorImpostos = 0.0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor, informe o custo de fábrica do carro: ");
        custoFabrica = entrada.nextDouble();

        distribuidor = (custoFabrica * porcentagemDistribuidor) / 100.000;
        valorImpostos = (custoFabrica * percentualImpostos) / 100;

        custoConsumidor = (distribuidor + valorImpostos);

        System.out.println("O custo final para o consumidor de um carro novo é: " + custoConsumidor);

        entrada.close();
    }
}
