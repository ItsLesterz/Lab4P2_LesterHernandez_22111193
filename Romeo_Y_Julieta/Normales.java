package Romeo_Y_Julieta;

public class Normales extends Aldeanos{
    private int vida;

    public int daño(Aldeanos atacar){
        if(atacar instanceof Pacifista)return (int)Math.round(vida*0.05);
        return vida;
    }

    public Normales(String nombre, String apellido, int edad, int vida) {
        super(nombre, apellido, edad, vida);
        vida = 50;
    }

    public String toString() {
        return "Normales: "+super.toString()+" Ataque: 50";
    }


}
