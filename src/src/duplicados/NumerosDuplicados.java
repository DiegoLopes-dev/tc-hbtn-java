package duplicados;

import java.util.*;
import java.util.stream.Collectors;

public class NumerosDuplicados {

    public static TreeSet<Integer> buscar(int[] numeros) {

        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < numeros.length; i++){
            result.add(numeros[i]);
        }
        Set<Integer> resultRemovido = new HashSet<>();
        Set<Integer> resultDuplicado = result.stream().filter(n -> !resultRemovido.add(n)).collect(Collectors.toSet());

        TreeSet<Integer> setResult = new TreeSet<Integer>();

        for (Integer numeroLista : resultDuplicado) {
            setResult.add(numeroLista);
        }
        return setResult;
    }
}
