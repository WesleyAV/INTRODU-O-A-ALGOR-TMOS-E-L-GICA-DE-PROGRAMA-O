/*1 -Faça um programa que permita entrar com a quantidade de pães e leite. 
Informe o valor da conta do cliente, sabendo que cada  litro de leite custa R$2,50 e cada pão custa R$0,25.
 */
package Lista1;

import java.util.Scanner;

/**
 *
 * @author Wesley A.V
 */
public class Exer1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //declaração de variáveis
        double valordaconta;

        //entrada de dados
        System.out.println("Digite a quantidade de pães: ");
        int v1 = scan.nextInt();

        System.out.println("Digite a quantidade de Leite (em litros): ");
        int v2 = scan.nextInt();

        //processamento de dados
        valordaconta = (v1 * 0.25) + (v2 * 2.50);

        //saída de dados
        System.out.println("O valor total da conta é de R$ " + valordaconta);
    }
}
