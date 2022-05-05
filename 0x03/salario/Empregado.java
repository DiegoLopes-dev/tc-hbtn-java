public class Empregado {

    public double salarioFixo;

    public Empregado(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public double calcularBonus(Departamento departamento) {
        if (departamento.alcancouMeta() == true) {
            double bonus = 0.10 * salarioFixo;
            return bonus;

        } else return 0;
    }


        double calcularSalarioTotal(Departamento departamento){
            double reajuste = 0.10 * salarioFixo;
            return salarioFixo + reajuste;
        }
    }
