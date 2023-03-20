package ni.com.persona;

import java.util.Date;


//atributos

public class Maestro extends  persona{
    private String maestro;


//contructor

    public Maestro(String nombre, Date FechaNacimiento, String interes) {
        super(nombre, FechaNacimiento, interes);
        this.maestro = maestro;
    }
//metodos

    // getter and setter
    public String getMaestro() {
        return maestro;
    }

    public void setMaestro(String maestro) {
        this.maestro = maestro;
    }
}
