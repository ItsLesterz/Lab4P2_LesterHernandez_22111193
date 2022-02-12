package Romeo_Y_Julieta;

import java.util.Random;

public class Herrero extends Aldeanos {
    Random rnd = new Random();
    private int vida;
    public int daño(Aldeanos atacar){
        if(atacar instanceof Agronomo)return (int)Math.round(vida*0.1);
        if(atacar instanceof Pacifista)return (int)Math.round(vida*0.05);
        return vida;
    }

    public Herrero(String nombre, String apellido, int edad, int vida) {
        super(nombre, apellido, edad, (int) Math.round(vida * 0.5));
        vida = rnd.nextInt(500 - 200) + 200;
    }

    public String toString() {
        return "Normales: " + super.toString() + " Ataque: " + vida;
    }

}
