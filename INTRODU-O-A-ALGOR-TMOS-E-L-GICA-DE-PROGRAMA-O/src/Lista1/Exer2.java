/*
 * Fazer um programa que leia uma temperatura fornecida em graus Farenheit a 
 * converta para o seu equivalente em graus centígrados. Sabe-se que: C= (5/9) * (F - 32)
 */
package Lista1;

import java.util.Scanner;

/**
 *
 * @author Wesley A.V
 */
public class Exer2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //declaração de variáveis
        double c;

        //entrada de dados
        System.out.println("Informe a temperatura em Farenheit: ");
        int v1 = scan.nextInt();

        //processamento de dados
        c = (5 * (v1 - 32)/ 9);

        //saída de dados
        System.out.println(v1 + " graus Farenheit, equivalem a " + c + " graus Celsius.");
    }
}
