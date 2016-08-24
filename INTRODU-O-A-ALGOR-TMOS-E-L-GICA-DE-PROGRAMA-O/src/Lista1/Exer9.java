/*
 * Escreva um algoritmo para ler o número total de eleitores de um município, 
 * o número de votos brancos, nulos e válidos. Calcular e escrever o percentual 
 * que cada um representa em relação ao total de eleitores. 
 */
package Lista1;

import java.util.Scanner;

/**
 *
 * @author Wesley A.V
 */
public class Exer9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //declaração de variáveis
        double te, vb, vn, vv;
        double pervb, pervn, pervv;
        //entrada de dados
        System.out.println("Qual o total de eleitores deste município? ");
        te = scan.nextInt();

        System.out.println("Qual o total de votos brancos? ");
        vb = scan.nextInt();

        System.out.println("Qual o total de votos nulos? ");
        vn = scan.nextInt();

        System.out.println("Qual o total de votos válidos? ");
        vv = scan.nextInt();
        //processamento de dados
        pervb = (vb / te) * 100;
        pervn = (vn / te) * 100;
        pervv = (vv / te) * 100;
        //saída de dados
        System.out.println("O percentual de votos BRANCOS é de: " + pervb + "%");
        System.out.println("O percentual de votos NULOS é de: " + pervn + "%");
        System.out.println("O percentual de votos VÁLIDOS é de: " + pervv + "%");
    }
}
