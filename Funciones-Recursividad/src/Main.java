import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ex2();

    }

    private static void ex2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un numero entero: ");
        int numero = sc.nextInt();

        System.out.println("Números primos desde 1 hasta " + numero + ":");
        imprimirPrimosHasta(numero);
    }

    public static boolean esPrimo(int num, int divisor) {
        if (divisor <= 1) {
            return true;
        }
        if (num % divisor == 0) {
            return false;
        }
        return esPrimo(num, divisor - 1);
    }

    public static void imprimirPrimosHasta(int numero) {
        if (numero >= 1) {
            imprimirPrimosHasta(numero - 1);
            if (esPrimo(numero, numero - 1)) {
                System.out.print(numero + " ");
            }
        }
    }

}
