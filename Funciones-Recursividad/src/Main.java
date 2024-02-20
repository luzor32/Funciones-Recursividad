import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        cambioDeMoneda();
    }

    private static void cambioDeMoneda() {
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
}