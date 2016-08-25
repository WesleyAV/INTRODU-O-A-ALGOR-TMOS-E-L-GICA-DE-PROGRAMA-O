/*
 * Escreva um algoritmo que leia um valor inteiro de dias e depois converta-o 
 * para mostrar no formato "XX semanas e XX dias". 
 */
package Lista2;

import java.util.Scanner;

/**
 *
 * @author Wesley A.V
 */
public class Exer4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //declaração de variáveis
        int d, semana, dias;
        //entrada de dados
        System.out.println("Informe uma quantidade de dias: ");
        d = scan.nextInt();

        //processamento de dados
        semana = d / 7;
        dias = d % 7;

        //saída de dados
        System.out.println(d + " dias equivalem a: " + semana + " semanas e " + dias + " dias.");
    }
}
