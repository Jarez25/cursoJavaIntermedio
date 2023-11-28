package ni.com.persona;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Persona {
    private String nombre;
    private Date Fecha_nacimiento;
    private String interes;

    public Persona() {
    }

    public Persona(String nombre, Date fecha_nacimiento, String interes) {
        this.nombre = nombre;
        this.Fecha_nacimiento = fecha_nacimiento;
        this.interes = interes;
    }

    public int Calcula_edad() {
        LocalDate localDate = new java.sql.Date(Fecha_nacimiento.getTime()).toLocalDate();
        Period periodo = Period.between(localDate, localDate.now());
        return periodo.getYears();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha_nacimiento() {
        return Fecha_nacimiento;
    }

    public void setEdad(Date fecha_nacimiento) {
        this.Fecha_nacimiento = fecha_nacimiento;
    }

    public String getInteres() {
        return interes;
    }

    public void setInteres(String interes) {
        this.interes = interes;
    }
}
