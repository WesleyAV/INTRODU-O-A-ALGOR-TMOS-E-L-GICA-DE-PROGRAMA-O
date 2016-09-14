/*
 * Criar um programa para identificar se um dia da semana (numerados de 1 a 7) é dia de semana, 
 * fim de semana ou um dia inválido 
 */
package Lista3;

import java.util.Scanner;

/**
 *
 * @author Wesley A.V
 */
public class Exer3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int dia;

        System.out.println("Digite o dia da semana (De 1 a 7): ");
        dia = scan.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Domingo! Fim de Semana!");
                break;
            case 2:
                System.out.println("Segunda! Dia da Semana!");
                break;
            case 3:
                System.out.println("Terça-Feira! Dia da Semana!");
                break;
            case 4:
                System.out.println("Quarta-Feira! Dia da Semana!");
                break;
            case 5:
                System.out.println("Quinta-Feira! Dia da Semana!");
                break;
            case 6:
                System.out.println("Sexta-Feira! Dia da Semana!");
                break;
            case 7:
                System.out.println("Sábado! Fim de Semana!");
                break;
            default:
                System.out.println("Dia inválido!");
                break;
        }
    }
}
