public class Main {
    public static void main(String[] args) {


        ex3();

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
}