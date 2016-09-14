/*
 * Um usuário deseja um programa onde possa escolher que tipo de média deseja calcular - média aritmética, 
 * média ponderada (3, 3, 4) ou média harmônica - a partir de três notas. 
 * Faça um programa que leia as notas, a opção escolhida pelo usuário e calcule a média. 
 * Caso a opção esteja errada o programa deve exibir uma mensagem de erro e sair. 
 */
package Lista3;

import java.util.Scanner;

/**
 *
 * @author Wesley A.V
 */
public class Exer4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tpmedia, numaluno;
        int media = 0, n1, n2, n3;

        System.out.println("Digite o número do aluno: ");
        numaluno = scan.nextInt();

        System.out.println("Digite a primeira nota: ");
        n1 = scan.nextInt();
        //n1 = scan.nextDouble();

        System.out.println("Digite a segunda nota: ");
        n2 = scan.nextInt();

        System.out.println("Digite a terceira nota: ");
        n3 = scan.nextInt();

        System.out.println("Qual tipo de média deseja saber?: Aritmética - 1; Ponderada - 2; Harmônica - 3; ");
        tpmedia = scan.nextInt();

        switch (tpmedia) {
            case 1:
                media = (n1 + n2 + n3) / 3;
                //System.out.println("Número do aluno: " + numaluno);
                //System.out.println("A média Aritmética é de: " + media);
                break;
            case 2:
                media = (n1 * 3) + (n2 * 3) + (n3 * 4) / 10;
                //System.out.println("Número do aluno: " + numaluno);
                //System.out.println("A média Ponderada é de: " + media);
                break;
            case 3:
                media = (3 / ((1 / n1) + (1 / n2) + (1 / n3)));
                //System.out.println("Número do aluno: " + numaluno);
                //System.out.println("A média Harmônica é de: " + media);
                break;
            default:
                System.out.println("Opção Inválida! Informe novamente!");
                break;
        }
        
        System.out.println("Número do aluno: " + numaluno);
        System.out.println("Nota 1: " + n1);
        System.out.println("Nota 2: " + n2);
        System.out.println("Nota 3: " + n3);
        System.out.println("Opção de média: (Aritmética - 1; Ponderada - 2; Harmônica - 3) " + tpmedia);
        System.out.println("A média do aluno " + numaluno + " foi de: " + media);
    }
}
