
/*1. Verificação de Peso Ideal por Gênero (Estrutura de Decisão)

    O nutricionista Dr. Vitalis utiliza uma nova fórmula simplificada
     para calcular o peso ideal dos seus pacientes,
baseada na altura e no gênero.
Desenvolva um programa que receba a Altura (double)
 e o Gênero (char: 'M' para Masculino, 'F' para Feminino).
    O programa deve calcular o peso ideal e informar se o paciente está no peso ideal,
     precisa engordar, ou precisa
emagrecer, considerando a tolerância de ±2 Kg do peso ideal.

Gênero	                  Fórmula do Peso Ideal 
Masculino	              (72.7 * altura) - 58
Feminino	              (62.1 * altura) - 44.7        */

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.print(" Escreva qual o seu gênero (M/F):");
        char genero = scanner.next().toUpperCase().charAt(0);

        System.out.print("Digite seu peso atual: ");
        double pesoAtual = scanner.nextDouble();

        double pesoIdeal = 0;

        if (genero == 'M') {
            pesoIdeal = (72.7 * altura) - 58;
            System.out.printf("Seu peso ideal é %.3f%n", pesoIdeal);
            if (pesoAtual >= pesoIdeal - 2 || pesoAtual <= pesoIdeal + 2) {
                System.out.println("Você esta no peso Ideal.");
            }
            if (pesoAtual < pesoIdeal - 2) {
                System.out.println("Você precisa engordar.");
            } else {
                System.out.println("Você precisa emagrecer.");
            }

        } else if (genero == 'F') {
            pesoIdeal = (62.1 * altura) - 44.7;
            System.out.printf("Seu peso ideal é %.3f%n", pesoIdeal);
            if (pesoAtual < pesoIdeal - 2) {
                System.out.println("Você precisa engordar.");
            } else {
                System.out.println("Você precisa emagrecer.");
            }

        } else {
            System.out.print("Gênero inválido");
        }

        scanner.close();
    }
}
