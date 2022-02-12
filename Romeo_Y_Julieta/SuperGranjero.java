package Romeo_Y_Julieta;

public class SuperGranjero extends Aldeanos{
    private int vida;

    @Override
    public String toString() {
        return "SuperGranjero: "+super.toString();
    }


    @Override
    public int daño(Aldeanos atacar){
        if(atacar instanceof Herrero)return (int)Math.round(vida*1.15);
        if(atacar instanceof Explosivo) return (int)Math.round(vida*1.2);
        return vida;
    }


    public SuperGranjero(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad, 1000);
        vida = 1000;
    }

}
