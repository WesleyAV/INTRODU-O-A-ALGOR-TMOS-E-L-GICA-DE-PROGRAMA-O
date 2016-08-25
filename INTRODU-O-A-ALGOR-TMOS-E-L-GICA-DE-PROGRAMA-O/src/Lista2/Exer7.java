/*
 * Ler o ano atual e o ano de nascimento de uma pessoa. 
 * Escrever uma mensagem que diga se ela poderá ou não votar este ano 
 * (não é necessário considerar o mês em que a pessoa nasceu). 
 */
package Lista2;

import java.util.Scanner;

/**
 *
 * @author Wesley A.V
 */
public class Exer7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //declaração de variáveis
        int aa, an, idade, total_idade;
        //int anoAgora = 2016, anoEmDias, mesEmDias, idade;
        //entrada de dados
        System.out.println("Digite o ano atual: ");
        aa = scan.nextInt();

        System.out.println("Digite o ano de nascimento: ");
        an = scan.nextInt();

        //processamento de dados
        idade = aa - an;
        total_idade = idade;
        System.out.println("Sua idade é de: " + idade);
        if (idade < 16) {
            System.out.println("Ainda não pode votar!");
        }
        if (idade > 16 && idade < 18) {
            System.out.println("seu voto é facultativo!");
        }
        if (idade > 18 && idade < 65) {
            System.out.println("Já pode votar!");
        }
        if (idade > 65) {
            System.out.println("Não pode mais votar!");
        }

    }
}
