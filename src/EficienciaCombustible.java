
import java.util.Scanner;

public class EficienciaCombustible {

    public static void main(String[] args) {
        boolean rep = false;
        do {
            double mpg = 0;
            double lpk = 0;
            /*Se declaran variables */
            int opc = 0;
            boolean error = false;
            Scanner reader = new Scanner(System.in);
            System.out.println("Ingrese la eficiencia en millas por galon (MPG)");
            mpg = reader.nextDouble();
            lpk = mpg * 2.35215;
            System.out.println("El valor de la eficiencia en litros por kilometro (LPK) es: " + String.valueOf(lpk));
            do {
                error = false;
                System.out.println("¿Desea ingresar otro valor?\n"
                        + "(1)Si\n"
                        + "(2)No");
                opc = reader.nextInt();
                switch (opc) {/*condicion swicth que varia segun la opcion elegida alamacenada en opc */
                    case 1:
                        rep = true;
                        break;
                    case 2:
                        rep = false;
                        break;
                    default:
                        error = true;
                        System.out.println("Opcion invalida");
                }
            } while (error);
        } while (rep);
    }
}
