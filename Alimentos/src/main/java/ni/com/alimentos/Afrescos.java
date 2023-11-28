package ni.com.alimentos;

import java.util.Date;

public class Afrescos extends Alimento{

    private Date envazado;
    private String origen;

    public Afrescos(String nombre, Date fecha_de_vecimiento, Integer numero_lote, Date envazado, String origen) {
        super(nombre, fecha_de_vecimiento, numero_lote);
        this.envazado = envazado;
        this.origen = origen;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public Date getEnvazado() {
        return envazado;
    }

    public void setEnvazado(Date envazado) {
        this.envazado = envazado;
    }
}


