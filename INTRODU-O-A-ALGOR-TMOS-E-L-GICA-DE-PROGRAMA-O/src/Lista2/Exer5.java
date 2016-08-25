/*
 * Escreva um programa que leia codigo de um aluno e suas três notas de prova. 
 * Dentro do programa, calcule a media do aluno  sabendo que a nota da primeira 
 * prova tem peso 1, a nota da segunda prova tem peso 2 e a nota da terceira prova tem peso 3. 
 * Exiba o código e a media do aluno. 
 */
package Lista2;

import java.util.Scanner;

/**
 *
 * @author Wesley A.V
 */
public class Exer5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //declaração de variáveis
        int cod, n1, n2, n3, pesos;
        //int media;
        double media;
        //entrada de dados
        System.out.println("Digite o código do aluno:");
        cod = scan.nextInt();

        System.out.println("Digite a primeira nota do aluno:");
        n1 = scan.nextInt();

        System.out.println("Digite segunda nota do aluno:");
        n2 = scan.nextInt();

        System.out.println("Digite a terceira nota do aluno:");
        n3 = scan.nextInt();

        //processamento de dados
        pesos = (1 + 2 + 3);
        media = ((n1 * 1) + (n2 * 2) + (n3 * 3)) / pesos;
        //saída de dados
        System.out.println("Código do aluno: " + cod + ". Média ponderada obtida de " + media);
    }
}
