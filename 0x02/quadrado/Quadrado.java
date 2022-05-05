public class Quadrado {
    public static void area(double lado) {

        int result = 0;
        try {
            if (lado < 0) {
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Lado deve possuir valor positivo");
        }

    }
}
