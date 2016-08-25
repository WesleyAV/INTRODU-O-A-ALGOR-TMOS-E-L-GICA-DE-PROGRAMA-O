/*
 *  Ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo 
 * e escrever se formam ou não um triângulo. OBS: para formar um triângulo, 
 * o valor de cada lado deve ser menor que a somA dos outros 2 lados. 
 */
package Lista2;

import java.util.Scanner;

/**
 *
 * @author Wesley A.V
 */
public class Exer9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //declaração de variáveis
        int v1, v2, v3;
        //entrada de dados
        System.out.println("Informe a medida do primeiro lado: ");
        v1 = scan.nextInt();

        System.out.println("Informe a medida do segundo lado: ");
        v2 = scan.nextInt();

        System.out.println("Informe a medida do terceiro lado: ");
        v3 = scan.nextInt();
        //processamento de dados

        if ((v1 < v2 + v3) || (v2 < v1 + v3) || (v3 < v1 + v2)) {
            System.out.println("As medidas formam um triangulo!");
        } else {
            System.out.println("As medidas não formam um triangulo");
        }
    }
}
