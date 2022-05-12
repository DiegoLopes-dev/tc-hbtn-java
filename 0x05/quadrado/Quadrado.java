public class Quadrado extends Retangulo {

    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) throws Exception {
        if(lado < 0){
            throw new IllegalArgumentException("Lado deve ser maior ou igual a 0");
        }else{
            this.lado = lado;
        }
    }
}