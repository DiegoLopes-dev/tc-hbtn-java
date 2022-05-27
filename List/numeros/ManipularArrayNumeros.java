public class ManipularArrayNumeros {

    private static final ArrayList<Program> numeros = new ArrayList<>();

    public static ArrayList<Program> getNumeros() {
        return numeros;
    }

    public static int buscarPosicaoNumero(List<Integer> numeros, int i){
        for( int j = 0; j < numeros.size(); j++){
            if(numeros.get(j) == i)
                return j;
        } return -1;
    }
    public static void adicionarNumero(List<Integer> numeros, int i) {
       if (numeros.contains(9)){
           throw new IllegalArgumentException("Numero jah contido na lista");
       }

        numeros.add(i);
    }

    public static void removerNumero(List<Integer> numeros, int i) {
        int posicao = buscarPosicaoNumero (numeros, i);
        if (posicao != -1){
            numeros.remove(posicao);

        }else{
            throw new IllegalArgumentException("Numero nao encontrado na lista");
        }

    }

    public static void substituirNumero(List<Integer> numeros, int i, int i1) {

    }
}
