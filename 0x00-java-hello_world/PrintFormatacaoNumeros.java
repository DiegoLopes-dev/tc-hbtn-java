public class PrintFormatacaoNumeros {
    public static void main(String[] args) {
        float taxa = 0.2456f;
        float valor = 7654.321f;
//        System.out.println("Valor: R$ 7,654.32" + "\n" + "Taxa: 0.25%");
        System.out.printf("Valor: " + "%,.2f\n", valor);
        System.out.printf("Taxa: " + "%.2f", taxa);
        System.out.println('%');

    }
}

