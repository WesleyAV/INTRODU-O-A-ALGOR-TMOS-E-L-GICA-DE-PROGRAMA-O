/*
 * Uma empresa concederá um aumento de salário aos seus funcionários, variável 
 * de acordo com o cargo, conforme a tabela abaixo.
 * Faça  um  programa  que  leia  o  salário  e  o  código  do  cargo  de  um  
 * funcionário,  e  calcule  o  novo salário. Se o cargo do funcionário não estiver 
 * na tabela, ele deverá, então, receber 52% de aumento. Mostre o salário antigo, 
 * o novo salário, a diferença entre eles e o percentual de aumento.Observação: utilizar 
 * o comando switch.

 */
package Lista3;

import java.util.Scanner;

/**
 *
 * @author admin.wesley
 */
public class Exer5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int salarioatual, codcargo, funcionario, salarionovo;
        double diferenca, aumento;

        System.out.println("Informe o código do funcionário: ");
        funcionario = scan.nextInt();

        System.out.println("Informe o código do cargo: ");
        codcargo = scan.nextInt();

        System.out.println("Informe o salário: ");
        salarioatual = scan.nextInt();

        switch (codcargo) {
            case 101:
                salarionovo = salarioatual + ((salarioatual * 12) / 100);
                diferenca = salarionovo - salarioatual;
                aumento = 12;
                break;
            case 102:
                salarionovo = salarioatual + ((salarioatual * 26) / 100);
                diferenca = salarionovo - salarioatual;
                aumento = 26;
                break;
            case 103:
                salarionovo = salarioatual + ((salarioatual * 32) / 100);
                diferenca = salarionovo - salarioatual;
                aumento = 32;
                break;
            case 104:
                salarionovo = salarioatual + ((salarioatual * 37) / 100);
                diferenca = salarionovo - salarioatual;
                aumento = 37;
                break;
            case 105:
                salarionovo = salarioatual + ((salarioatual * 41) / 100);
                diferenca = salarionovo - salarioatual;
                aumento = 41;
                break;
            default:
                salarionovo = salarioatual + ((salarioatual * 52) / 100);
                diferenca = salarionovo - salarioatual;
                aumento = 52;
                break;
        }
        System.out.println("Funcionário de número: " + funcionario);
        System.out.println("Salário antigo: R$ " + salarioatual);
        System.out.println("Salário novo: R$ " + salarionovo);
        System.out.println("Diferença: R$ " + diferenca);
        //System.out.println("Aumento: " + "%.2f", aumento + " %");
        System.out.println("Aumento: " + aumento + "0%");
    }
}
