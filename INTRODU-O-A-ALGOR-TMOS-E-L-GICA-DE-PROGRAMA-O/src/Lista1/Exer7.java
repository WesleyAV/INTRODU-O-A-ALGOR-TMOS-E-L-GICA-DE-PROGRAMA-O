/*
 *  Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a área do retângulo
 */
package Lista1;

import java.util.Scanner;

/**
 *
 * @author Wesley A.V
 */
public class Exer7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //declaração de variáveis
        int b, a, area;
        //entrada de dados
        System.out.println("Informe a medida da base do retângulo; ");
        b = scan.nextInt();

        System.out.println("Informe a medida da altura do retângulo; ");
        a = scan.nextInt();
        //processamento de dados
        area = b * a;
        //saída de dados
        System.out.println("A área do retângulo é de: " + area);
    }
}
