package Romeo_Y_Julieta;

public class Pacifista extends Aldeanos{
    private String discurso;
    @Override
    public String toString() {
        return "Normales: "+super.toString()+" Discurso: "+discurso;
    }

    @Override
    public int daño(Aldeanos atacar){
        return 0;
    }

    public void setDiscurso(String discurso) {
        this.discurso = discurso;
    }

    public Pacifista(String nombre, String apellido, int edad, int vida, String discurso) {
        super(nombre, apellido, edad, vida);
        this.discurso = discurso;
    }

    public String getDiscurso() {
        return discurso;
    }



}
