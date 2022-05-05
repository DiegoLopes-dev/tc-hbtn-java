public class Gerente extends Empregado{
    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }
    @Override
    double calcularBonus(Departamento departamento) {
        if (departamento.alcancouMeta() == true) {
            double bonus = 0.20 * salarioFixo;
            return bonus;

        } else return 0;
    }
}