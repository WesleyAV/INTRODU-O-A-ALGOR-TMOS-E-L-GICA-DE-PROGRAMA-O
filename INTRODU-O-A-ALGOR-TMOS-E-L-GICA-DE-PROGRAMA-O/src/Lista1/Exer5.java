/*
 * Construa um algoritmo que, tendo como dados de entrada dois pontos quaisquer 
 * no plano, P(x1,y1) e P(x2,y2), escreva a distância entre eles. A fórmula que efetua tal cálculo é: d=raizq(x2-x1)^2+(y1-y2)^2
 */
package Lista1;

import java.util.Scanner;

/**
 *
 * @author Wesley A.V
 */
public class Exer5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //declaração de variáveis
        int x1, y1, x2, y2;
        double d;
        //entrada de dados
        System.out.println("Digite o valor de x1 do ponto 1: ");
        x1 = scan.nextInt();

        System.out.println("Digite o valor de y1 no ponto 1: ");
        y1 = scan.nextInt();

        System.out.println("Digite o valor de x2 no ponto 2: ");
        x2 = scan.nextInt();

        System.out.println("Digite o valor de y2 no ponto 2: ");
        y2 = scan.nextInt();

        //processamento de dados
        d = Math.sqrt(((x2 - x1) ^ 2) + ((y2 - y1) ^ 2));

        //saída de dados
        System.out.println("A distância entre os dois pontos informados é de: " + d);
    }
}
