import comida.*;
import humor.*;

public class Personagem {

    int pontosDeFelicidade;

    public Personagem(int pontosDeFelicidade) {
        this.pontosDeFelicidade = pontosDeFelicidade;
    }

    public Personagem() {
    }

    public Humor obterHumorAtual(){
        if(pontosDeFelicidade < -5){
            return new Irritado();
        }else if(pontosDeFelicidade < -5 || pontosDeFelicidade <= 0){
            return new Triste();
        }else if(pontosDeFelicidade >= 1 && pontosDeFelicidade <= 15){
            return new Feliz();
        }else{
            return new MuitoFeliz();
        }
    }

    public void comer(Comida[] comidas){

        for(Comida comida : comidas){
            pontosDeFelicidade = pontosDeFelicidade + comida.getPontosDeFelicidade();
        }
    }

    @Override
    public String toString() {
        return pontosDeFelicidade + " - " + obterHumorAtual().getClass().getSimpleName();
    }
}
