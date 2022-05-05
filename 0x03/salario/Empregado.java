public class Empregado {

    public double salarioFixo;

    public Empregado(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    double calcularBonus(Departamento departamento) {
        double bonus = 0.10 * salarioFixo;
        return bonus;
    }
    double calcularSalarioTotal(Departamento departamento) {
        double reajuste = 0.10 * salarioFixo;
        return salarioFixo + reajuste;
    }
}