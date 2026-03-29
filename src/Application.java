import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();
        System.out.println("Digite o nome do funcionario: ");
        funcionario.nome = input.nextLine();
        input.nextLine();
        System.out.println("Digite o número de filhos do funcionário: ");
        funcionario.quantidadeFilhos = input.nextInt();

        ContratoTrabalho contratoTrabalho = new ContratoTrabalho();
        contratoTrabalho.funcionario = funcionario;
        System.out.println("Digite o valor da hora normal trabalhada: ");
        contratoTrabalho.valorHoraNormal = input.nextDouble();
        System.out.println("Digite o valor da hora extra trabalhada: ");
        contratoTrabalho.valorHoraExtra = input.nextDouble();

        FolhaPagamento folhaPagamento = new FolhaPagamento();
        System.out.println("Digite o número de horas normais trabalhadas: ");
        int horasNormaisTrabalhadas = input.nextInt();
        System.out.println("Digite o número de horas extras trabalhadas: ");
        int horasExtrasTrabalhadas = input.nextInt();

        Holerite holerite = folhaPagamento.calcularSalario(horasNormaisTrabalhadas, horasExtrasTrabalhadas, contratoTrabalho);
        input.close();
        holerite.imprimir();
    }
}
