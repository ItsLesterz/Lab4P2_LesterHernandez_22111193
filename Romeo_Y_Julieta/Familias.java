package Romeo_Y_Julieta;

import java.util.ArrayList;

import static Romeo_Y_Julieta.Aldeanos.agregarGuerrero;
import static Romeo_Y_Julieta.Main.*;

public class Familias {
    private String nombre;
    ArrayList<Aldeanos> familiares = new ArrayList();
    public void setGuerreros(ArrayList<Aldeanos> familiares) {
        this.familiares = familiares;
    }

    public String getLastname() {
        return nombre;
    }


    @Override
    public String toString() {
        return "Familia "+nombre+"\nAldeanos: "+familiares;
    }

    public Familias(String nombre) {
        this.nombre = nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Aldeanos> getGuerreros() {
        return familiares;
    }

    public static void crearFamilia() {
        String familia;
        System.out.println("Ingresar Apellido: ");
        familia = leer.next();
        if (buscarFamilia(familia) == null) {
            Familia.add(new Familias(familia));
            System.out.println("Se ha creado la familia " + familia);
        } else {
            System.out.println("Ya existe una familia con este apellido");
        }
    }

    public static Familias buscarFamilia(String familias) {
        for (Familias fam : Familia) {
            if (familias.equalsIgnoreCase(fam.getLastname())) {
                return fam;
            }
        }
        return null;
    }

    public static void imprimirFamilia() {
        for(Familias fam: Familia){
            System.out.println(fam.toString()+"\n");
        }
    }

    public static void agregarFamilias() {
        Familia.add(new Familias("Capuleto"));
        Familia.add(new Familias("Montesco"));
        Familia.add(new Familias("Hernandez"));
        //Familia Capuleto
        agregarGuerrero(new Normales("Julieta", "Capuleto", 15, 300));
        agregarGuerrero(new Pacifista("Señora", "Capuleto", 29, 900, "Nunca hubo guerra buena ni paz mala"));
        agregarGuerrero(new Explosivo("Señor", "Capuleto", 36, 600));
        //Familia Montesco
        agregarGuerrero(new SuperGranjero("Romeo", "Montesco", 22));
        agregarGuerrero(new Herrero("Montague", "Montesco", 50, 700));
        agregarGuerrero(new Agronomo("Señora", "Montesco", 40, 900));
        //Familia Hernandez
        agregarGuerrero(new Herrero("Lester", "Hernandez", 43, 1000));
        agregarGuerrero(new Explosivo("Chloe", "Hernandez", 39, 500));
        agregarGuerrero(new Agronomo("Eunice", "Hernandez", 15, 200));
        agregarGuerrero(new Normales("LesterJr", "Hernandez", 18, 950));
    }
}
