package ni.com;


import ni.com.persona.Alumno;
import ni.com.persona.Maestro;
import ni.com.persona.Persona;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public  class Main {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        Persona persona1 = new Persona("jarez", dateFormat.parse("22/07/1996") , "anime");
        System.out.println(persona1.getNombre());
        persona1.setNombre("Jairo Medina");
        System.out.println(persona1.getNombre());

        Alumno alumno = new Alumno("carlos", dateFormat.parse("22/07/1996"), "programacion", "A");
        System.out.println(alumno.getAula());
        alumno.setAula("j" +  alumno.getNombre());
        System.out.println(alumno.getAula());

        Maestro maestro = new Maestro("carlos", dateFormat.parse("22/07/1996"), "programacion", "prgramacion");
        System.out.println(maestro.getClase());

    }
}