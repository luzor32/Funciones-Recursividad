import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ex4();
    }

    private static void ex4() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un numero entre el 2 y el 9: ");
        int numero = sc.nextInt();


        if (numero >= 2 && numero <= 9) {
            System.out.println(" Tabla del " + numero);

            for (int i = 1; i <= 10; i++) {
                int prod = numero * i;
                System.out.println(numero + " x " + i + " = " + prod);
            }
        } else {
            System.out.println("El numero ingresado esta fuera de rango");
        }
    }
}