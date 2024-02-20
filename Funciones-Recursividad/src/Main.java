import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ex1(); 
        ex2();

    }

    

    private static void ex1() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un numero entero: ");
        int numero = sc.nextInt();
      
       if (esPrimo(numero,2)){
            System.out.println("El numero es primo");
        }else {
            System.out.println("El numero no es primo");
        }
    }
     public static boolean esPrimo(int nro,int divisor){
        if (nro == divisor){
            return true;
        } else if (nro % divisor ==0 || nro < 2) {
            return false;
        }
        return esPrimo(nro,divisor+1);
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

