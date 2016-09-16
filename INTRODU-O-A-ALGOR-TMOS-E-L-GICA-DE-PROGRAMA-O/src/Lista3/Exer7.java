/*
 * Criar um programa para identificar o valor a ser pago por um plano de saúde dada a
 * idade do conveniado considerando que todos pagam R$ 100 mais um adicional conforme a seguinte
 * tabela: 1) crianças com menos de 10 anos pagam R$80; 2) conveniados com idade entre 10 e 30
 * anos pagam R$50; 3) conveniados com idade entre 40 e 60 anos pagam R$ 95; e 4) conveniados
 * com mais de 60 anos pagam R$130.
 */
package Lista3;

import java.util.Scanner;

/**
 *
 * @author admin.wesley
 */
public class Exer7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int idade, faixa = 0;
        double valor = 0, total;

        System.out.println("Informe a idade do conveniado: ");
        System.out.println("1 - para 0 a 10: ");
        System.out.println("2 - para 11 a 30: ");
        System.out.println("3 - para 40 a 60: ");
        System.out.println("4 - acima de 60: ");

        System.out.println("Digite aqui: ");
        idade = scan.nextInt();

        switch (idade) {
            case 1:
                valor = 80;
                total = valor + 100;
                System.out.println("Valor do Plano de Saúde: R$ 100,00");
                System.out.println("Valor Adicional por idade de R$: " + valor);
                System.out.println("Valor Total: " + total);
                break;
            case 2:
                valor = 50;
                total = valor + 100;
                System.out.println("Valor do Plano de Saúde: R$ 100,00");
                System.out.println("Valor Adicional por idade de R$: " + valor);
                System.out.println("Valor Total: " + total);
                break;
            case 3:
                valor = 95;
                total = valor + 100;
                System.out.println("Valor do Plano de Saúde: R$ 100,00");
                System.out.println("Valor Adicional por idade de R$: " + valor);
                System.out.println("Valor Total: " + total);
                break;
            case 4:
                valor = 130;
                total = valor + 100;
                System.out.println("Valor do Plano de Saúde: R$ 100,00");
                System.out.println("Valor Adicional por idade de R$: " + valor);
                System.out.println("Valor Total: " + total);
                break;
            default:
                System.out.println("Opção inválida! Digite novamente.");
                break;
        }
    }
}
