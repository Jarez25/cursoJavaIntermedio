package ni.com.persona;

import java.util.Date;

public class Alumno  extends Persona {

    private  String aula;


    public Alumno(String nombre, Date fecha_nacimiento, String interes, String aula) {
        super(nombre, fecha_nacimiento, interes);
        this.aula = aula;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }
}
