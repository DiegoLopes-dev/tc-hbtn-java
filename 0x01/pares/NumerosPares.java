public class NumerosPares {
    public static void main(String[] args) {
        for (int i = 0; i <= 98; i++)
            if (i % 2 == 0) {
                System.out.print(i + ", ");
                if (i == 98) {
                    System.out.print(98 + "   ");
                }
            }
    }
}