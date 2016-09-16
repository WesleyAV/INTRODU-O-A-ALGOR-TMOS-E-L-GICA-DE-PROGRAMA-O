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
public class Exer7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int idade, faixa = 0;
        double valor = 0, total;

        System.out.println("Informe a idade do conveniado: ");
        idade = scan.nextInt();

        if (idade < 10) {
            faixa = 1;
        }
        if (idade >= 10 && idade <= 30) {
            faixa = 2;
        }
        if (idade >= 40 && idade <= 61) {
            faixa = 3;
        }
        if (idade >= 60) {
            faixa = 4;
        }

        switch (faixa) {
            case 1:
                valor = 80;
                break;
            case 2:
                valor = 50;
                break;
            case 3:
                valor = 95;
                break;
            case 4:
                valor = 130;
        }

        total = valor + 100;
        System.out.println("Valor do Plano de Saúde: R$ 100,00");
        System.out.println("Valor Adicional por idade de : " + idade + " anos: R$ " + valor);
        //System.out.println("%.2f", total);
        System.out.println("Valor Total: " + total);
    }
}
