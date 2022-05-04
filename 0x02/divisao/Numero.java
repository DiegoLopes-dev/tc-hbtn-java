public class Numero {
    public static void dividir(int a, int b) {

        try {
            System.out.println(a/b);

        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println(a + "/" + b + "=" + a / b);
        }
    }
}




