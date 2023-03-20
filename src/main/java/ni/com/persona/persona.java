package ni.com.persona;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class persona {
    private String nombre;
    private Date FechaNacimiento;
    private String interes;


    public persona() {
    }

    public persona(String nombre, Date FechaNacimiento, String interes) {
        this.nombre = nombre;
        this.FechaNacimiento = FechaNacimiento;
        this.interes = interes;
    }

    public int calcularEdad(){
       LocalDate localDate = new  java.sql.Date(FechaNacimiento.getTime()).toLocalDate();
       Period periodo = Period.between(localDate, LocalDate.now());
       return periodo.getYears();
    }

    // getter and setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.FechaNacimiento = fechaNacimiento;
    }

    public String getInteres() {
        return interes;
    }

    public void setInteres(String interes) {
        this.interes = interes;
    }
}
