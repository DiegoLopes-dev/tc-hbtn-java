import atividades.Atividade;
import java.util.ArrayList;
public class Workflow {

    public ArrayList<Atividade> atividade = new ArrayList<Atividade>();

    public Workflow() {
    }

    public Workflow(ArrayList<Atividade> atividade) {
        this.atividade = atividade;
    }

    public ArrayList<Atividade> getAtividade() {
        return atividade;
    }

    public void registrarAtividade(Atividade atividade) {
        this.atividade.add(atividade);
    }
}
