/*
 *  Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. 
 * Sabendo-se que ele recebe uma comissão de 3% sobre o total das vendas até 
 * R$ 1.500,00 mais 5% sobre o que ultrapassar este valor, calcular e escrever o seu salário total. 
 */
package Lista2;

import java.util.Scanner;

/**
 *
 * @author Wesley A.V
 */
public class Exer8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //declaração de variáveis
        double sal_fixo, vvendas, aux, sal_total;

        //entrada de dados
        System.out.println("Informe o valor do salário fixo:");
        sal_fixo = scan.nextInt();

        System.out.println("Informe o valor das vendas efetuadas:");
        vvendas = scan.nextInt();
        //processamento de dados
        if (vvendas <= 1500) {
            vvendas = vvendas + (vvendas * 0.03);
            aux = vvendas;
        }
        if (vvendas > 1500) {
            vvendas = vvendas + (vvendas * 0.05);
            aux = vvendas;
        }
        sal_total = vvendas + sal_fixo;
        //saída de dados
        System.out.println("O salário total é de: " + sal_total);
    }
}
