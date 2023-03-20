package ni.com;

import ni.com.persona.Alumno;
import ni.com.persona.Maestro;
import ni.com.persona.persona;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class main {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat dateFormat = new SimpleDateFormat( "dd/MM/yyyy");

        persona persona1 = new persona("jarez", dateFormat.parse("22/07/1996"), "anime");
        System.out.println(persona1.getNombre());
        persona1.setNombre("jairo Medina");
        System.out.println(persona1.getNombre());
        System.out.println(persona1.calcularEdad());


        Alumno alumno = new Alumno("jarez", dateFormat.parse("22/07/1996"), "anime", "A");
        System.out.println("Nombre: " +  alumno.getNombre());
        System.out.println("aula: " +  alumno.getAula());


        Maestro maestro = new Maestro("jose", dateFormat.parse("22/07/1996"), "anime");
        System.out.println("maestro: " +  maestro.getNombre());


    }
}
