
import java.util.Scanner;

/*
 *  A jornada de trabalho semanal de um funcionário é de 40 horas. 
O funcionário que trabalhar mais de 40 horas receberá hora extra, 
cujo cálculo é o valor da hora regular com um acréscimo de 
50%. Escreva um algoritmo que leia o número de horas trabalhadas em um mês, 
o salário por hora e escreva o salário total do funcionário, que deverá ser 
acrescido das horas extras, caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas). 
/**
 *
 * @author Wesley A.V
 */
public class Exer10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //declaração de variáveis
        double horastrab, salporhora, salnormal, saltotal, horaextra;
        //entrada de dados
        System.out.println("Digite o número de horas trabalhadas no mês: ");
        horastrab = scan.nextInt();
        System.out.println("Digite o valor do salário por hora:");
        salporhora = scan.nextInt();
        //processamento de dados
        if (horastrab > 160) {
            horaextra = (horastrab - 160) * salporhora + (salporhora * (50 / 100));
            saltotal = 160 * salporhora + horaextra;
            System.out.println("O total de horas trabalhadas no mês é de: " + horastrab);
            System.out.println("O valor da hora é de: " + salporhora);
            System.out.println("O salário total é de: " + saltotal);

        } else {
            salnormal = horastrab * 160;
            System.out.println("O total de horas trabalhadas no mês é de: " + horastrab);
            System.out.println("O valor da hora é de: " + salporhora);
            System.out.println("O salário total é de: " + salnormal);
        }

        
        
    }
}
