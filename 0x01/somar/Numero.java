import java.util.Scanner;

class Numero {

    public static void main( String[] args ) {
        int a, b = 0;
        int somar = 0;
        Scanner s = new Scanner( System.in );
        System.out.println( "Entre com os numeros para somar: ");
        a = s.nextInt();
        b = s.nextInt();
        somar = a + b;
        System.out.println( "A soma dos dois numeros é : " + somar );
    }
}