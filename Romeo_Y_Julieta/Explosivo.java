package Romeo_Y_Julieta;

public class Explosivo extends Aldeanos{
    private int daño;

    public Explosivo(String nombre, String apellido, int edad, int vida) {
        super(nombre, apellido, edad, vida);
        daño = 250;
    }

    public String toString() {
        return "Normales: "+super.toString()+" Ataque: 250";
    }

    public int daño(Aldeanos atacar){
        if(atacar instanceof Herrero)return (int)Math.round(daño*0.05);
        if(atacar instanceof Agronomo) return (int)Math.round(daño*0.1);
        return daño;
    }
}
