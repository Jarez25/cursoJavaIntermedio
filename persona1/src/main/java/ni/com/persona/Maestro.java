package ni.com.persona;

import java.util.Date;

public class Maestro extends Persona{

    private  String clase;

    public Maestro(String nombre, Date fecha_nacimiento, String interes, String clase) {
        super(nombre, fecha_nacimiento, interes);
        this.clase = clase;
    }
    public String getClase() {
        return clase;
    }


    public void setClase(String clase) {
        this.clase = clase;
    }
}
