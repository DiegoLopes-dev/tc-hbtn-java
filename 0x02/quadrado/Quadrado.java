public class Quadrado {
    public static void Quadrado(int a, int b) {

        int result = 0;
        try {
            if (a == 0 | b == 0) {

            }
            result = a / b;

        } catch (ArithmeticException e) {
            System.out.println("Nao eh possivel dividir por zero");
        } finally {
            System.out.println(a + " / " + b + " = " + result);
        }
    }
}