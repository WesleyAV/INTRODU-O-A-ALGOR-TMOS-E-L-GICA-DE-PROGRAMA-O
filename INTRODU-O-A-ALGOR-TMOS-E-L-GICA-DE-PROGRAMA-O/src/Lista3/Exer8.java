/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista3;

import java.util.Scanner;

/**
 *
 * @author admin.wesley
 */
public class Exer8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char opcao;
        double area = 0, base = 0, bmaior = 0, bmenor = 0, altura = 0, lado = 0;

        System.out.println("Qual área você quer calcular? (q - Quadrado; r - Retângulo, t - Triangulo, p - Trapézio");
        opcao = scan.next(".").charAt(0);

        switch (opcao) {
            case 'q':
                System.out.println("Informe a medida da base (em cm): ");
                base = scan.nextDouble();

                System.out.println("Informe a medida do lado (em cm): ");
                lado = scan.nextDouble();

                area = base * lado;
                System.out.println("A figura escolhida foi Quadrado, e a área é de: " + area + " cm²");
                break;
            case 'r':
                System.out.println("Informe a medida da base (em cm): ");
                base = scan.nextDouble();

                System.out.println("Informe a medida do lado (em cm): ");
                lado = scan.nextDouble();

                area = base * lado;
                System.out.println("A figura escolhida foi Retangulo, e a área é de: " + area + " cm²");
                break;
            case 't':
                System.out.println("Informe a medida da base (em cm): ");
                base = scan.nextDouble();

                System.out.println("Informe a medida do lado (em cm): ");
                lado = scan.nextDouble();

                area = (base * lado) / 2;
                System.out.println("A figura escolhida foi Triangulo, e a área é de: " + area + " cm²");
                break;
            case 'p':
                System.out.println("Informe a medida da base maior: ");
                bmaior = scan.nextInt();

                System.out.println("Informe a medida da base menor (em cm): ");
                bmenor = scan.nextDouble();

                System.out.println("Informe a medida do lado/altura (em cm): ");
                altura = scan.nextDouble();

                area = ((bmaior + bmenor) * altura) / 2;
                System.out.println("A figura escolhida foi Trapézio, e a área é de: " + area + " cm²");
                break;
            default:
                System.out.println("Figura geométrica não foi informada!");
        }
    }
}
