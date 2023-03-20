package ni.com.persona;

import java.util.Date;


//atributos

public class Alumno extends  persona{
    private String aula;


//contructor

    public Alumno(String nombre, Date FechaNacimiento, String interes, String aula) {
        super(nombre, FechaNacimiento, interes);
        this.aula = aula;
    }
//metodos

    // getter and setter
    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }
}
