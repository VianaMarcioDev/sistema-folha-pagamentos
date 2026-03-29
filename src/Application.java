import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        FolhaPagamento folhaPagamento = new FolhaPagamento();
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o número de horas normais trabalhadas: ");
        int horasNormaistrabalhadas = input.nextInt();
        System.out.println("Digite o número de horas extras trabalhadas: ");
        int horasExtrasTrabalhadas = input.nextInt();
        System.out.println("Digite o valor da hora normal trabalhada: ");
        double valorHoraNormal = input.nextDouble();
        System.out.println("Digite o valor da hora extra trabalhada: ");
        double valorHoraExtra = input.nextDouble();
        double resultado = folhaPagamento.calcularSalario(horasNormaistrabalhadas, horasExtrasTrabalhadas, valorHoraNormal, valorHoraExtra);

        input.close();
        System.out.printf("O salário desse mês é %6.2f", resultado);
    }
}
