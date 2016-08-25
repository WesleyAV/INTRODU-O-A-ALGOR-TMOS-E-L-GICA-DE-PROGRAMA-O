/*
 *  As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e 
 * R$ 1,00 se forem compradas pelo menos 12. Escreva um programa que leia o 
 * número de maçãs compradas, calcule e escreva o custo total da compra. 
 */
package Lista2;

import java.util.Scanner;

/**
 *
 * @author Wesley A.V
 */
public class Exer6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //declaração de variáveis
        double macas, total;
        //entrada de dados
        System.out.println("Quantas maçãs foram compradas? ");
        macas = scan.nextInt();
        //processamento de dados
        if (macas < 12) {
            total = (macas * 1.30);
            System.out.println("Foram compradas " + macas + " no valor total de: R$ " + total);
        }
        if (macas > 12) {
            total = (macas * 1.00);
            System.out.println("Foram compradas " + macas + " no valor total de: R$ " + total);
        }
        //saída de dados
    }
}
