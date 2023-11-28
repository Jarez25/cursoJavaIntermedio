package ni.com.alimentos;

import java.util.Date;

public class Alimento {
    private  String nombre;

    private Date fecha_de_vecimiento;

    private Integer numero_lote;

    public Alimento() {
    }

    public Alimento(String nombre, Date fecha_de_vecimiento, Integer numero_lote) {
        this.nombre = nombre;
        this.fecha_de_vecimiento = fecha_de_vecimiento;
        this.numero_lote = numero_lote;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha_de_vecimiento() {
        return fecha_de_vecimiento;
    }

    public void setFecha_de_vecimiento(Date fecha_de_vecimiento) {
        this.fecha_de_vecimiento = fecha_de_vecimiento;
    }

    public Integer getNumero_lote() {
        return numero_lote;
    }

    public void setNumero_lote(Integer numero_lote) {
        this.numero_lote = numero_lote;
    }
}
