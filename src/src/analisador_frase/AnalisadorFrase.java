package analisador_frase;

import java.util.Locale;
import java.util.TreeMap;

public class AnalisadorFrase {

    public static TreeMap<String, Integer> contagemPalavras (String frase) {
        TreeMap<String, Integer> map = new TreeMap<>();

        frase = frase.replace("?","");
        frase = frase.replace("!","");
        frase = frase.replace(".","");

        String [] array = frase.split(" ");
        int quantidade = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[i].equalsIgnoreCase(array[j])) {
                    quantidade++;
                }
            }
            map.put(array[i].toLowerCase(), quantidade);
            quantidade = 0;
        }
        return map;
    }
}
