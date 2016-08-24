/*
 * Escreva um algoritmo para ler o salário mensal atual de um funcionário e o 
 * percentual de reajuste. Calcular e escrever o valor do novo salário
 */
package Lista1;

import java.util.Scanner;

/**
 *
 * @author Wesley A.V
 */
public class Exer10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //declaração de variáveis
        int sal_atual, per_reaj, sal_novo, reaj;
        //entrada de dados
        System.out.println("Digite o valor do salário atual: ");
        sal_atual = scan.nextInt();

        System.out.println("Digite o valor reajuste (em %): ");
        per_reaj = scan.nextInt();

        //processamento de dados
        reaj = (sal_atual * per_reaj) / 100;
        sal_novo = (sal_atual + reaj);

        //saída de dados
        System.out.println("O salário de R$ " + sal_atual + " após o reajuste de " + per_reaj + " % será de: R$ " + sal_novo);
    }
}
