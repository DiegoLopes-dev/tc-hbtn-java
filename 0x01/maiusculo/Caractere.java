class Caractere {

    static boolean EhMaiusculo;

    String c;
    public static boolean EhMaiusculo(char c) {

        if (c > 'A' && c < 'Z') {
            EhMaiusculo = true;
        } else {
            EhMaiusculo = false;
        }
        return EhMaiusculo;

    }
}


