import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

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
                real = pesos / 168.50;
                System.out.println("-----------------------------------");
                System.out.println(pesos + " pesos valen " + real + " reales");
            } else if (opcion == 2) {
                dolar = pesos / 836.74;
                System.out.println("-----------------------------------");
                System.out.println(pesos + " pesos valen " + dolar + " dolares");
            } else if (opcion == 3) {
                euro = pesos / 900.85;
                System.out.println("-----------------------------------");
                System.out.println(pesos + " pesos valen " + euro + " euros");
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
}