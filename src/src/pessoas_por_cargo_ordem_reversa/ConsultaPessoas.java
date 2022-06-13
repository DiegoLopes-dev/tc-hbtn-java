package pessoas_por_cargo_ordem_reversa;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConsultaPessoas {

    public static Map<String, List<Pessoa>> obterPessoasPorCargo(List<Pessoa> todasPessoas) {
       return todasPessoas.stream().collect(Collectors.groupingBy(Pessoa::getCargo));
    }
}
