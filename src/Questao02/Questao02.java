package Questao02;

import java.util.Scanner;

/*
Prova Técnica Java - Base.
Aluna: Ludmila Custódio Timóteo.
Data: 22/07/2022

Questão 02
Escreva um sistema que receba valores de base e altura de um triângulo e verifique se são valoresválidos
(positivos maiores que zero).
Em caso afirmativo, calcule e imprima na tela a área do triângulo.

 */
public class Questao02 {

    public static void main(String[] args) {

        float base, altura, area;

        Scanner entrada = new Scanner(System.in);

        while (true) {
            System.out.println("Digite a base do triângulo: ");
            base = entrada.nextFloat();
            if (base < 0) {
                System.out.println("Número inválido! Digite um número positivo para a base do Triângulo.");
            } else if (base >= 0) {
                base = base;
                break;
            }
        }
        while (true) {
            System.out.println("Digite a altura do triângulo: ");
            altura = entrada.nextFloat();
            if(altura < 0) {
                System.out.println("Número inválido! Digite um número positivo para a altura do Triângulo.");
            } else if (altura >= 0 ) {
                altura = altura;
                break;
            }
        }

        area = (base * altura) / 2;
        System.out.println("A área do Triângulo é: " + area);

        entrada.close();
        }
    }

