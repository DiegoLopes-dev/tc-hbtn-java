import pedido_livraria.ItemPedido;

public class Workflow {

    ArrayList<Atividade> atividade = new ArrayList<Atividade>();

    public ArrayList<Atividade> getAtividade() {
        return atividade;
    }

    public void registrarAtividade(Atividade atividade) {
        this.atividade.add(atividade);
    }
}
