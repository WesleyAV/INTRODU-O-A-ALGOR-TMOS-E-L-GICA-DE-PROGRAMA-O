/*
 * Escreva um algoritmo que leia três números inteiros e positivos (A, B, C) e 
 * calcule a seguinte expressão: D = (R + S)/2. Onde R = (a+b)² e S = (b+c)²
 */
package Lista1;

import java.util.Scanner;

/**
 *
 * @author Wesley A.V
 */
public class Exer4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //declaração de variáveis
        int a, b, c;
        double d, r, s;
        //entrada de dados
        System.out.println("Informe o primeiro número positivo");
        a = scan.nextInt();

        System.out.println("Informe o segundo número positivo");
        b = scan.nextInt();

        System.out.println("Informe o terceiro número positivo");
        c = scan.nextInt();
        //condição para receber apenas números positivos
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Digite apenas números positivos!");
        } else {
        //processamento de dados
        r = (a + b) ^ 2;
        s = (b + c) ^ 2;
        d = (r + s) / 2;
        
        //saída de dados
            System.out.println("O resultado é: " + d);
        }

    }
}
