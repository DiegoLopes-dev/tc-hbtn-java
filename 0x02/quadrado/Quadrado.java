public class Quadrado {
    public static double area(double lado) throws Exception {

        int result = 0;
        try {
            if (lado < 0) {
            }
            throw new IllegalArgumentException(lado+ " é menor que 0.");
        } catch (IllegalArgumentException e) {
            System.out.println("Lado deve possuir valor positivo");
        }

        return lado;
    }
}
