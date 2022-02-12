package Romeo_Y_Julieta;

import java.util.Scanner;

import static Romeo_Y_Julieta.Familias.buscarFamilia;
import static Romeo_Y_Julieta.Main.Familia;

public class Aldeanos {
    private String nombre;
    private String apellido;
    private int edad;
    private int vida;

    public Aldeanos(String nombre, String apellido, int edad, int vida) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getvida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String toString(){
        return "Nombre: "+nombre+" Apellido: "+apellido+" Edad: "+edad+" Vida: "+vida;
    }

    public int daño(Aldeanos atacar) {
        return 0;
    }

    public static void crearAldeano() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("\nIngrese Nombre: ");
        String nombre = leer.next();
        System.out.println("Ingrese Apellido: ");
        String apellido = leer.next().toUpperCase();
        System.out.println("Ingrese Edad: ");
        int edad = leer.nextInt();
        System.out.println("Vida: ");
        int vida = leer.nextInt();
        System.out.println("\n----TIPO ALDENAO----" +
                "\n[1] Normal" +
                "\n[2] Pacifista" +
                "\n[3] Herrero\n" +
                "\n[4] Agronomo" +
                "\n[5] Explosivo" +
                "\nSeleccione opcion: ");
        int opcion = leer.nextInt();
        if (buscarFamilia(apellido) != null) {
            switch (opcion) {
                case 1:
                    agregarGuerrero(new Normales(nombre, apellido, edad, vida));
                    break;

                case 2:
                    System.out.print("Ingrese Discurso de Paz: ");
                    String discurso = leer.next();
                    agregarGuerrero(new Pacifista(nombre, apellido, edad, vida, discurso));
                    break;

                case 3:
                    agregarGuerrero(new Herrero(nombre, apellido, edad, vida));
                    break;

                case 4:
                    agregarGuerrero(new Agronomo(nombre, apellido, edad, vida));
                    break;

                case 5:
                    agregarGuerrero(new Explosivo(nombre, apellido, edad, vida));
                    break;

                default:
                    System.out.println("OPCION INVALIDA");
                    break;
            }
        }
    }
    public static void agregarGuerrero(Aldeanos ald){
        for(Familias lista: Familia){
            if(lista.getLastname().equalsIgnoreCase(ald.getApellido())){
                lista.getGuerreros().add(ald);
            }
        }
    }
}
