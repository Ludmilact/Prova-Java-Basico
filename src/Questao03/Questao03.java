package Questao03;

import java.util.Scanner;

/*
Prova Técnica Java - Base.
Aluna: Ludmila Custódio Timóteo.
Data: 22/07/2022

Questão 03

Crie um programa que leia um número do teclado até que encontre um número igual a zero.
 No final, mostre a soma dos números digitados.

 */
public class Questao03 {

    public static void main(String[] args) {

        int numero;
        int soma = 0;

        Scanner entrada =  new Scanner(System.in);

        while (true) {
            System.out.println("Digite um número inteiro: ");
            numero = entrada.nextInt();
            if (numero == 0) {
                System.out.println("Encontramos o número igual a zero!");
                entrada.close();
                break;
            }
            else {
                soma += numero;
            }
        }

        System.out.println("A soma dos números digitados é igual a: " + soma);

    }
}


