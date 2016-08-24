/*
 * Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e 
 * dias e escreva a idade dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias
 */
package Lista1;

import java.util.Scanner;

/**
 *
 * @author Wesley A.V
 */
public class Exer8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //declaração de variáveis
        int a, m, d, dias;
        int anoAgora = 2016, anoEmDias, mesEmDias, idade;
        //entrada de dados
        System.out.println("Digite o ano de nascimento: ");
        a = scan.nextInt();

        System.out.println("Digite o mês de nascimento: ");
        m = scan.nextInt();

        System.out.println("Digite o dia de nascimento: ");
        d = scan.nextInt();

        //processamento de dados
        mesEmDias = m * 30;
        anoEmDias = (anoAgora - a) * 365;
        idade = d + mesEmDias + anoEmDias;

        //saída de dados
        System.out.println("A idade é de: " + idade + " dias.");
    }
}
