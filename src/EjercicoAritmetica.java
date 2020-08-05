
import java.util.Scanner;


public class EjercicoAritmetica {

    public static void main(String[] args) {
        double a = 0;
        /* Se declaran variables y se inicializan*/
        double b = 0;
        double resultado = 0;
        int opc = 0;
        boolean continuar = false;
        boolean error = false;
        Scanner reader = new Scanner(System.in);
        do {
            System.out.println("¿Que desea hacer?:\n"
                    + "(1)Sumar\n"
                    + "(2)Restar\n"
                    + "(3)Producto\n"
                    + "(4)Division\n"
                    + "(5)Modulo\n"
                    + "(6)Logaritmo\n"
                    + "(7)Potencia\n");
            opc = reader.nextInt();
            /* Se lee la opcion escogida */
            switch (opc) { /*condicion swicth que varia segun la opcion elegida alamacenada en opc */
                case 1:
                    System.out.println("Escriba el primer numero: ");
                    a = reader.nextDouble();
                    System.out.println("Escriba el segundo numero: ");
                    b = reader.nextDouble();
                    resultado = a + b;
                    System.out.println("El resultado de la suma es: " + String.valueOf(resultado));
                    break;
                case 2:
                    System.out.println("Escriba el primer numero: ");
                    a = reader.nextDouble();
                    System.out.println("Escriba el segundo numero: ");
                    b = reader.nextDouble();
                    resultado = b - a;
                    System.out.println("El resultado de la resta es: " + String.valueOf(resultado));
                    break;
                case 3:
                    System.out.println("Escriba el primer numero: ");
                    a = reader.nextDouble();
                    System.out.println("Escriba el segundo numero: ");
                    b = reader.nextDouble();
                    resultado = a * b;
                    System.out.println("EL resultado del producto es: " + String.valueOf(resultado));
                    break;
                case 4:
                    System.out.println("Escriba el primer numero: ");
                    a = reader.nextDouble();
                    System.out.println("Escriba el segundo numero: ");
                    do {
                        b = reader.nextDouble();
                        if (b == 0) {
                            /* ciclo que obliga que b sea distinto a 0 */
                            System.out.println("¡No se puede dividir entre 0!");
                            System.out.println("Escriba otro numero: ");

                        }

                    } while (b == 0);

                    resultado = a / b;
                    System.out.println("EL resultado de la division es: " + String.valueOf(resultado));
                    break;
                case 5:
                    System.out.println("Escriba el primer numero: ");
                    a = reader.nextDouble();
                    System.out.println("Escriba el segundo numero: ");
                    do {
                        b = reader.nextDouble();
                        if (b == 0) {
                            /* ciclo que obliga que b sea distinto a 0 */
                            System.out.println("¡No se puede dividir entre 0!");
                            System.out.println("Escriba otro numero: ");

                        }
                    } while (b == 0);

                    resultado = a % b;
                    System.out.println("El resultado de la division es: " + String.valueOf(resultado));
                    break;
                case 6:
                    System.out.println("Escriba el primer numero: ");
                    a = reader.nextDouble();
                    resultado = Math.log(a);
                    System.out.println("El logaritmo del numero es: " + String.valueOf(resultado));
                    break;
                case 7:
                    System.out.println("Escriba el primer numero: ");
                    a = reader.nextDouble();
                    System.out.println("Escriba el segundo numero: ");
                    b = reader.nextDouble();
                    resultado = Math.pow(a, b);
                    System.out.println("EL resultado de la potencia es: " + String.valueOf(resultado));
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
            do {
                error = false;
                System.out.println("¿Desea continuar\n"
                        + "(1)Si\n"
                        + "(2)No\n");
                opc = reader.nextInt();
                switch (opc) {
                    case 1:
                        continuar = true;
                        break;
                    case 2:
                        continuar = false;
                        break;
                    default:
                        error = true;
                        System.out.println("Opcion invalida");
                }
            } while (error);/*Asegura que el usuario escoja una opcion valida*/

        } while (continuar);/*MIentras no se diga que no desea continuar se repetira todo el bloque de codigo*/

    }

}
