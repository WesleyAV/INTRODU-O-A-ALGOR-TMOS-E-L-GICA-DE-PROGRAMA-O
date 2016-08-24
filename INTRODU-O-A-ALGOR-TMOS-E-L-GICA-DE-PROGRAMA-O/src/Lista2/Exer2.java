/*
 *  Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles. 
 */
package Lista2;

import java.util.Scanner;

/**
 *
 * @author Wesley A.V
 */
public class Exer2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //declaração de variáveis
        int v1, v2, aux;
        //entrada de dados
        System.out.println("Digite o primeiro valor: ");
        v1 = scan.nextInt();

        System.out.println("Digite o segundo valor: ");
        v2 = scan.nextInt();
        //processamento de dados
        if (v1 > v2) {
            aux = v1;
            System.out.println("O número " + v1 + " é o maior!");
        } else {
            System.out.println("O número " + v2 + " é o maior!");
        }
        //saída de dados
    }
}
