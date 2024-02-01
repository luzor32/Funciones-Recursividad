import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un numero entre el 2 y el 9: ");
        int numero = sc.nextInt();

        tablaDeMultiplicar(numero);

    }

    public static void tablaDeMultiplicar(int num){
        if (num >= 2 && num <=9){
            System.out.println(" Tabla del "+num);

            for (int i = 1; i <=10 ; i++) {
                int prod = num * i;
                System.out.println(num+" x "+i+" = "+prod);
            }
        }else {
            System.out.println("El numero ingresado esta fuera de rango");
        }
    }
}