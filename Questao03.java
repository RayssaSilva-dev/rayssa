/*3. Validação de Dados de Cadastro (Estrutura de Repetição com Validação)

    Em 2025, o sistema de cadastro de novos usuários da FutureDev Academy exige rigorosa validação dos dados de entrada.
    Elabore um programa que solicite e valide o Nome e a Idade de um novo aluno. O programa deve:

1.	Para o Nome, só aceitar a entrada se ele tiver mais de 5 caracteres. Caso contrário, deve exibir uma mensagem
de erro e continuar pedindo o nome até que seja válido.
2.	Para a Idade, só aceitar a entrada se for um valor entre 16 e 99 anos (inclusive). Caso contrário, deve exibir
uma mensagem de erro e continuar pedindo a idade até que seja válida.
3.	Quando ambos os dados estiverem válidos, exibir a mensagem de cadastro concluído. */

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome; 
        int idade; 
        
        while (true) {
            System.out.print("Digite o nome:");
            nome = scanner.nextLine();

        if (nome.length() > 5) {
            break;
            
        }else {
        System.out.print( " Erro: O nome deve ter mais que 5 Caracteres!");
        }

        }

        while (true){
            System.out.println("Digite sua idade: " );
            idade = scanner. nextInt();

        if (idade >= 16 &&  idade <= 99){
            break;

        }else{
            System.out.println("Erro: Sua idade deve estar entre 16 e 99 anos!");

        }
        }
        System.out.print("Cadastro realizado com sucesso. Obrigada!");

        scanner.close();
    }
}
