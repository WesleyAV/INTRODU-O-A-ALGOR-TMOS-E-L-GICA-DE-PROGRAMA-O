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
public class Exer6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String codcurso;
        int codaluno, freq;
        double media;

        System.out.println("Informe o código do aluno: ");
        codaluno = scan.nextInt();

        System.out.println("Informe o código do curso: (G, E, M, D)");
        codcurso = scan.next();

        System.out.println("Informe frequência: (De 0 a 100)");
        freq = scan.nextInt();

        System.out.println("Informe média: (De 1 até 10)");
        media = scan.nextDouble();

        switch (codcurso) {
            case "G":
                if (freq >= 75 && media >= 7) {
                    System.out.println("\nNúmero do aluno: " + codaluno);
                    System.out.println("Código do Curso: " + codcurso);
                    System.out.println("Frequência: " + freq);
                    System.out.println("Média: " + media);
                    System.out.println("\nAluno " + codaluno + " aprovado, favor retirar o diploma daqui a 30 dias");
                } else {
                    System.out.println("Aluno reprovado.");
                }
                break;
            case "E":
                if (freq >= 75 && media >= 7) {
                    System.out.println("\nNúmero do aluno: " + codaluno);
                    System.out.println("Código do Curso: " + codcurso);
                    System.out.println("Frequência: " + freq);
                    System.out.println("Média: " + media);
                    System.out.println("\nAluno " + codaluno + " aprovado, favor retirar o diploma daqui a 30 dias");
                } else {
                    System.out.println("Aluno reprovado.");
                }
                break;
            case "M":
                if (freq >= 75 && media >= 7) {
                    System.out.println("\nNúmero do aluno: " + codaluno);
                    System.out.println("Código do Curso: " + codcurso);
                    System.out.println("Frequência: " + freq);
                    System.out.println("Média: " + media);
                    System.out.println("\nAluno " + codaluno + " aprovado, favor retirar o diploma daqui a 30 dias");
                } else {
                    System.out.println("Aluno reprovado.");
                }
                break;
            case "D":
                if (freq >= 75 && media >= 7) {
                    System.out.println("\nNúmero do aluno: " + codaluno);
                    System.out.println("Código do Curso: " + codcurso);
                    System.out.println("Frequência: " + freq);
                    System.out.println("Média: " + media);
                    System.out.println("\nAluno " + codaluno + " aprovado, favor retirar o diploma daqui a 30 dias");
                } else {
                    System.out.println("Aluno reprovado.");
                }
                break;
            default:
                System.out.println("Opção Inválida! Informe novamente!");
                break;
        }
    }
}
