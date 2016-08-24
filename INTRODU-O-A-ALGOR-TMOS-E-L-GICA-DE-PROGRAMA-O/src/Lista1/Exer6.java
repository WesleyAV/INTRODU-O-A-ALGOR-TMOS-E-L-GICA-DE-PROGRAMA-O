/*
 *  Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor. 
 */
package Lista1;

import java.util.Scanner;

/**
 *
 * @author Wesley A.V
 */
public class Exer6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //declaração de variáveis
        int v, a;
        //entrada de dados
        System.out.println("Digite um valor qualquer: ");
        v = scan.nextInt();
        //processamento de dados
        a = v - 1;
        //saída de dados
        System.out.println("O valor digitado foi " + v + " e o seu antecessor é: " + a);
    }
}
