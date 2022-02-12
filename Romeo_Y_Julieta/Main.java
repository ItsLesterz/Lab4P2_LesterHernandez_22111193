package Romeo_Y_Julieta;


import java.util.ArrayList;
import java.util.Scanner;

import static Romeo_Y_Julieta.Aldeanos.crearAldeano;
import static Romeo_Y_Julieta.Familias.*;

public class Main {
    static ArrayList<Familias> Familia = new ArrayList();
    static ArrayList<Aldeanos> ataque = new ArrayList();
    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        agregarFamilias();
        int opcion;
        do {
            System.out.println("\n----JUEGO DE ROMEO Y JULIETA----");
            System.out.println("\n\n[1] Crear Familia" +
                    "\n[2] Crear Aldeano" +
                    "\n[3] Imprimir Familias" +
                    "\n[4] Pelear" +
                    "\n[5] Salir" +
                    "\nSeleccione opcion: ");
            opcion = leer.nextInt();
            switch (opcion) {

                case 1:
                    crearFamilia();
                    break;

                case 2:
                    crearAldeano();
                    break;

                case 3:
                    imprimirFamilia();
                    break;

                case 4:
                    //No logre terminarla :''(
                    break;

                case 5:
                    System.out.println("Has salido del juego");
                    break;

                default:
                    System.out.println("OPCION INVALIDA");
                    break;
            }
        } while (opcion != 5);
    }

}
