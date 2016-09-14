/*
 * Criar um programa para identificar se um mês digitado pelo usuário é de alta 
 * ou baixa temporada (considerar os seguintes meses como alta temporada: dezembro a fevereiro, junho e julho)
 */
package Lista3;

import java.util.Scanner;

/**
 *
 * @author Wesley A.V
 */
public class Exer2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mes;

        System.out.println("Digite o mês: ");
        mes = scan.nextInt();

        switch (mes) {
            case 12:
                System.out.println("Dezembro! Alta temporada!");
                break;
            case 1:
                System.out.println("Janeiro! Alta temporada!");
                break;
            case 2:
                System.out.println("Fevereiro! Alta temporada!");
                break;
            case 6:
                System.out.println("Junho! Alta temporada!");
                break;
            case 7:
                System.out.println("Julho! Alta temporada!");
                break;
            default:
                System.out.println("Baixa temporada!");
                break;
        }
    }
}
