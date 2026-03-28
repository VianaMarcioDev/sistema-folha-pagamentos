public class FolhaPagamento {

    double calcularSalario(int horasNormaistrabalhadas, int horasExtrasTrabalhadas
                            , double valorHoraNormal, double valorHoraExtra) {
        double salarioHoraNormal = valorHoraNormal * horasNormaistrabalhadas;
        double salarioHoraExtra = valorHoraExtra * horasExtrasTrabalhadas;

        return salarioHoraNormal + salarioHoraExtra;
    }
}
