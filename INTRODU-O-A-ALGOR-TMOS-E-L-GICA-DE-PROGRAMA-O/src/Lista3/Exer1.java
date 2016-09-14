/*
 * Um vendedor precisa de um programa que calcule o preço total devido por um cliente. 
 * O programa deve receber o código de um produto e a quantidade comprada e calcular o preço total, 
 * usando a tabela abaixo:
 * Código Preço Unitário 
 * 1001         5.32
 * 1324         6.45 
 * 6548         2.37 
 * 0987         5.85 
 * 7623         6.50 
 */
package Lista3;

import java.util.Scanner;

/**
 *
 * @author Wesley A.V
 */
public class Exer1 {

    public static void main(String[] args) {
        int codprod, qntde;
        double pt = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o código do produto: ");
        codprod = scan.nextInt();

        System.out.println("Digite a quantidade comprada: ");
        qntde = scan.nextInt();

        switch (codprod) {
            case 1001:
                pt = qntde * 5.32;
                break;
            case 1324:
                pt = qntde * 6.45;
                break;
            case 6548:
                pt = qntde * 2.37;
                break;
            case 987:
                pt = qntde * 5.85;
                break;
            case 7623:
                pt = qntde * 6.50;
                break;
            default:
                System.out.println("Nenhum código foi informado.");
        }

        System.out.println("Código do produto: " + codprod);
        System.out.println("Quantidade: " + qntde);
        System.out.println("Preço Total: R$ " + pt);
    }
}
