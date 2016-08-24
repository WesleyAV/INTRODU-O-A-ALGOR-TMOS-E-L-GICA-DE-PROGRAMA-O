/*
 *  Fazer um programa para ler um n.mero do usu.rio e determinar se este n.mero . par ou impar. 
 */
package Lista2;

import java.util.Scanner;

/**
 *
 * @author Wesley A.V
 */
public class Exer3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //declaração de variáveis
        int v1;
        //entrada de dados
        System.out.println("Digite um número: ");
        v1 = scan.nextInt();

        //processamento de dados
        if (v1 % 2 == 0) {
            System.out.println("O número digitado é par!");
        } else {
            System.out.println("O número digitado é impar!");
        }
        //saída de dados
    }
}
