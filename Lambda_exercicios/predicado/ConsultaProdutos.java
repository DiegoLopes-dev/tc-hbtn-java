import consulta_produtos.Produto;

import java.util.List;
import java.util.stream.Collectors;
import java.util.function.Predicate;

public class ConsultaProdutos {

    public static List<Produto> filtrar (List<Produto> produtos, Predicate<Produto> pred){
        return produtos.stream().filter(p -> pred.test(p)).collect(Collectors.toList());
    }
}