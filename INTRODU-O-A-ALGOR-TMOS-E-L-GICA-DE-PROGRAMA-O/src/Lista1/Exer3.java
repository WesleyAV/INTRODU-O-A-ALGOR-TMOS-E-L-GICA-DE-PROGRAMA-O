/*
 * Escrever um algoritmo que lê 3 valores a, b e c que são lados de um triângulo
 * e calcule a área deste triângulo.Representar raiz em Português Estruturado: 
 * RaizQ(s*(s-a)*(s-b)*(s-c))
 */
package Lista1;

import java.util.Scanner;

/**
 *
 * @author Wesley A.V
 */
public class Exer3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //declaração de variáveis
        int a, b, c;
        double area, s;

        //entrada de dados
        System.out.println("Informe a medida do primeiro lado (em cm): ");
        a = scan.nextInt();

        System.out.println("Informe a medida do segundo lado (em cm): ");
        b = scan.nextInt();

        System.out.println("Informe a medida do terceiro lado (em cm); ");
        c = scan.nextInt();

        //processamento de dados
        s = (a + b + c) / 2;

        //RaizQ(s*(s-a)*(s-b)*(s-c))
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        //saída de dados
        System.out.println("A área do triângulo é de: " + area + " cm²");

    }
}
