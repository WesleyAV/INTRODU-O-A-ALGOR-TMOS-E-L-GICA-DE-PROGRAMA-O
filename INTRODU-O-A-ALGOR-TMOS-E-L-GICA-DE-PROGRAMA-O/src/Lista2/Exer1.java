/*
 *  Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo). 
 */
package Lista2;

import java.util.Scanner;

/**
 *
 * @author Wesley A.V
 */
public class Exer1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //declaração de variáveis
        int v1;
        //entrada de dados
        System.out.println("Digite um número: ");
        v1 = scan.nextInt();
        //processamento de dados
        if (v1 > 0) {
            System.out.println("O número informado é positivo.");
        } else {
            System.out.println("O número informado é negativo.");
        }
        //saída de dados
    }
}
