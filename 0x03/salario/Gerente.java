public class Gerente extends Empregado{
    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }

    double calcularBonus(Departamento departamento) {
        double bonus = 0.20 * salarioFixo;
        return bonus;
    }
}