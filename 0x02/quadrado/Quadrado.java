public class Quadrado {
    public static double area(double lado) throws Exception {

        double area = 0;

            if (lado < 0) {
                throw new IllegalArgumentException("Lado deve possuir valor positivo");
            } else if (lado > 0){
                area = lado *lado;
            }
            return area;

    }
}
