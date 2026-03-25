/*2. Cálculo de Reajuste Salarial com Base no Risco de Mercado (Estrutura de Decisão)

    A empresa TechFuture Labs decidiu reajustar o salário de seus desenvolvedores com base no
seu nível de experiência e a faixa salarial atual, para combater o risco de perda de 
talentos para a concorrência em 2025. O salário mínimo atual é de R$ 1.518,00.
Crie um programa que receba o salário atual de um colaborador (em double) e aplique
o reajuste conforme a tabela abaixo:

Faixa Salarial (Salário Atual)	                 Percentual de Aumento
Até R$ 3.500,00 (inclusive)	                            12%
De R$ 3.500,01 até R$ 8.000,00 (inclusive)	             8%
Acima de R$ 8.000,00	                                 5%

O programa deve calcular e exibir:
1.	O salário original.
2.	O percentual de aumento aplicado.
3.	O valor do aumento.
4.	O novo salário reajustado.*/

import java.util.Scanner;

public class Questao02 {
    /**
     * @param args
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite seu salário atual :");
    double salario = scanner.nextDouble();
     
    double percentual;

    if (salario <= 3500){
        percentual = 12;
    }else if(salario<= 8000) {
        percentual = 8;
    }else{
        percentual = 5;
    }
    double aumento = salario * percentual / 100;
    double novoSalario = salario + aumento; 

    System.out.println("Salario atual R$:"+ salario);
    System.out.println("Percentual aplicado:" + percentual + "%");
    System.out.println("Valor do aumento:"+ aumento);
    System.out.println("Valor do novo Salário R$:"+ novoSalario);

    scanner.close();

    }
}
