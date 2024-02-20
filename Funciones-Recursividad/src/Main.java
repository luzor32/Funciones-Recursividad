
import java.text.DecimalFormat;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ex1(); 
        ex2();
        ex3();
        ex4();
        ex5();
    }

    private static void ex5() {
        DecimalFormat df = new DecimalFormat("#.##");

        Scanner sc = new Scanner(System.in);
        double real ;
        double dolar ;
        double euro ;
        double pesos ;
        int opcion ;

        System.out.print("Ingrese el importe en peso: ");
        pesos = sc.nextDouble();

        System.out.println("Seleccione una opcion");
        System.out.println("1: Reales \n" +
                           "2: Dolar  \n" +
                           "3: Euro   \n" +
                           "4: salir");
        opcion = sc.nextInt();

        while (opcion != 4){

            if (opcion == 1) {
                real =pesos / 168.50;
                String real_formateado = df.format(real);
                System.out.println("-----------------------------------");
                System.out.println(pesos + " pesos valen " + real_formateado + " reales");
            } else if (opcion == 2) {
                dolar = pesos / 836.74;
                String dolar_formateado = df.format(dolar);
                System.out.println("-----------------------------------");
                System.out.println(pesos + " pesos valen " + dolar_formateado + " dolares");
            } else if (opcion == 3) {
                euro = pesos / 900.85;
                String euro_formateado = df.format(euro);
                System.out.println("-----------------------------------");
                System.out.println(pesos + " pesos valen " + euro_formateado + " euros");
            } else {
                System.out.println("-----------------------------------");
                System.out.println("La opcion es incorrecta");
            }
            System.out.println("-----------------------------------");
            System.out.println("Seleccione una opcion");
            System.out.println("1: Reales \n" +
                    "2: Dolar  \n" +
                    "3: Euro   \n" +
                    "4: salir");
            opcion = sc.nextInt();

        }

      
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

    private static void ex3() {
        int[][] matriz = {
                {1, 2, 0},
                {3, 1, 4},
                {3, 0, 1}
        };


        int suma = 0;
        int producto = 1;
        int s_diagonal_principal= 0;
        int p_diagonal_principal= 1;
        int s_diagonal_sec = 0;
        int p_diagonal_sec = 1;


        // Mostrar la matriz
        System.out.println("Matriz:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("La suma de los elementos de la matriz es: "+ getSuma(matriz, suma));
        System.out.println("el producto de los elementos de la matriz es: "+getProducto(matriz, producto));
        System.out.println("La suma de los elementos de la diagonal principal es: "+sumaDiagonalPrincipal(matriz, s_diagonal_principal));
        System.out.println("El producto de los elementos de la diagonal principal es: "+prodDiagonalPrincipal(matriz, p_diagonal_principal));
        System.out.println("La suma de los elemento de la diagonal secundaria es: "+sumaDiagonalSec(matriz, s_diagonal_sec));
        System.out.println("El producto de los elementos de la diagonal secundaria es: "+prodDiagonalSec(matriz, p_diagonal_sec));
    }

    private static int prodDiagonalSec(int[][] matriz, int p_diagonal_sec) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3 ; j++) {
                if (i + j  == 3) {
                    p_diagonal_sec *= matriz[i][j];
                }
            }
        }
        return p_diagonal_sec;
    }

    private static int sumaDiagonalSec(int[][] matriz, int s_diagonal_sec) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3 ; j++) {
                if (i + j == 3) {
                    s_diagonal_sec += matriz[i][j];
                }
            }
        }
        return s_diagonal_sec;
    }

    private static int prodDiagonalPrincipal(int[][] matriz, int p_diagonal_principal) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3 ; j++) {
                if (i==j) {
                    p_diagonal_principal *= matriz[i][j];
                }
            }
        }
        return p_diagonal_principal;

    }

    private static int sumaDiagonalPrincipal(int[][] matriz, int s_diagonal_principal) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3 ; j++) {
               if (i==j) {
                   s_diagonal_principal += matriz[i][j];
               }
            }
        }
        return s_diagonal_principal;
    }

    private static int getProducto(int[][] matriz, int producto) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3 ; j++) {
                producto *= matriz[i][j];
            }
        }
        return producto;
    }

    private static int getSuma(int[][] matriz, int suma) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3 ; j++) {
               suma += matriz[i][j];
            }
        }
        return suma;
     

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

