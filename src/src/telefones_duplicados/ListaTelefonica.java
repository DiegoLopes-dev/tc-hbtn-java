package telefones_duplicados;

import telefones.Telefone;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ListaTelefonica {

    private HashMap<String, HashSet<telefones.Telefone>> listaTelefones;

    public ListaTelefonica() {
        listaTelefones = new HashMap<>();
    }

    public HashSet<telefones.Telefone> adicionarTelefone(String nome, telefones.Telefone telefone) {
        HashSet<telefones.Telefone> telTempLoc = new HashSet<telefones.Telefone>();
        boolean achou = false;
        String chave = "";


        for (Map.Entry<String, HashSet<telefones.Telefone>> entry : listaTelefones.entrySet()) {
            if (entry.getValue().contains(telefone)) {
                achou=true;
                chave = entry.getKey();
            }
        }

        if(achou == false && listaTelefones.containsKey(nome)) {
            telTempLoc.addAll(listaTelefones.get(nome));
            telTempLoc.add(telefone);
            listaTelefones.put(nome, telTempLoc);

        }

        if(chave.equals(nome) && achou) {
            throw new IllegalArgumentException("Telefone jah existente para essa pessoa");
        }else if(!chave.equals(nome) && achou){
            throw new IllegalArgumentException("Telefone jah pertence a outra pessoa");
        }

        telTempLoc.add(telefone);
        listaTelefones.put(nome, telTempLoc);

        return telTempLoc;

    }

    public HashSet<telefones.Telefone> buscar(String nome) {

        HashSet<telefones.Telefone> telTemp = new HashSet<Telefone>();

        if (!listaTelefones.containsKey(nome)) {
            return null;
        } else {
            telTemp = listaTelefones.get(nome);
            return telTemp;
        }
    }
}