package workflow;

import pedido_livraria.ItemPedido;

import java.util.ArrayList;

public class ProcessadorVideo {

    private ArrayList<CanalNotificacao> canais = new ArrayList<CanalNotificacao>();

    public void registrarCanal(CanalNotificacao canal) {
        this.canais.add(canal);
    }

    public void processar(Video video) {
        for (CanalNotificacao canal : canais) {
            canal.notificar(new Mensagem( video.arquivo + " - " + video.formato, TipoMensagem.LOG));
        }
    }
}
