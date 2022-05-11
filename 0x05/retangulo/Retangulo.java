public class Retangulo {
    private double largura;
    private double altura;

    public double getLargura() {
        return largura;
    }
    public void setLargura(double largura) throws Exception {
        if(largura < 0){
            throw new IllegalArgumentException("Largura deve ser maior ou igual a 0");
        }else{
            this.largura = largura;
        }
    }
    public double getAltura(){
        return altura;
    }
    public void setAltura(double altura) throws Exception {
        if(altura < 0){
            throw new IllegalArgumentException("Altura deve ser maior ou igual a 0");
        }else{
            this.altura = altura;
        }
    }
}