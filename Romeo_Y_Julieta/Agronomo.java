package Romeo_Y_Julieta;

public class Agronomo extends Aldeanos{
    private int daño;

    @Override
    public int daño(Aldeanos atacar){
        if(atacar instanceof Pacifista)return (int)Math.round(daño*0.05);
        if(atacar instanceof Normales) return (int)Math.round(daño*0.1);
        return daño;
    }

    public Agronomo(String nombre, String apellido, int edad, int vida) {
        super(nombre, apellido, edad, vida);
        daño = 100;
    }

    @Override
    public String toString() {
        return "Normales: "+super.toString()+" Ataque: 100";
    }


}
