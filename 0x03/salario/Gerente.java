public class Gerente extends Empregado{
    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }
    @Override
    public double calcularBonus(Departamento departamento) {
        if (departamento.alcancouMeta() == true) {
            double bonus = 0.20 * salarioFixo + 0.01 * (departamento.valorAtingidoMeta - departamento.valorMeta);
            return bonus;

        } else return 0;
    }
}